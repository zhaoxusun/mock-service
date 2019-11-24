package com.personal.mock.log;

import org.apache.ibatis.io.Resources;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.*;

/**
 * author: zhaoxu
 * date: 2019/1/25 下午3:04
 */
public class LogUtil {
    private static Logger logger ;
    static {
        logger = Logger.getLogger(LogUtil.class);
        String resource = "log4j.properties";
        try {
            InputStream logStream = Resources.getResourceAsStream(resource);
          //  PropertyConfigurator.configure(logStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void setLoggerProperties(String path){
        PropertyConfigurator.configure(path);
    }

    private static StackTraceElement getStackTraceElement(){
        StackTraceElement [] stackTraceElements = Thread.currentThread().getStackTrace();
        Class clazz ;
        for (int i=0; i<stackTraceElements.length; i++){
            try {
                clazz = Class.forName(stackTraceElements[i].getClassName());
                if (clazz.equals(LogUtil.class)){
                    return stackTraceElements[i+3];
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return stackTraceElements[stackTraceElements.length-1];
    }

    private static Object getMessage(Object message){
        StackTraceElement stackTraceElement = getStackTraceElement();
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        String fileName = className.substring(className.lastIndexOf('.') + 1);
        int lineNumber = stackTraceElement.getLineNumber();
        return String.format("[%s.%s(%s.java:%d)]:%s", className, methodName, fileName,
                lineNumber, message);

    }

    public static void debug(Object message){
        logger.debug(getMessage(message));
    }
    public static void debug(Object message,Throwable t){
        logger.debug(getMessage(message),t);
    }
    public static void info(Object message){
        logger.info(getMessage(message));
    }
    public static void info(Object message,Throwable t){
        logger.info(getMessage(message),t);
    }
    public static void warn(Object message){
        logger.warn(getMessage(message));
    }
    public static void warn(Object message,Throwable t){
        logger.warn(getMessage(message),t);
    }
    public static void error(Object message){
        logger.error(getMessage(message));
    }
    public static void error(Object message,Throwable t){
        logger.error(getMessage(message),t);
    }

    public static void printLog(String dir,String fileName, String logStr) {
        File file = new File(dir);
        file.mkdirs();
        file = new File(String.format("%s/%s",dir,fileName));
        FileOutputStream out = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            file.createNewFile();
            out = new FileOutputStream(file);
            bufferedOutputStream = new BufferedOutputStream(out);
            bufferedOutputStream.write(logStr.getBytes());
            bufferedOutputStream.flush();
        } catch (IOException e) {
            error("print log error",e);
        } finally {
            try {
                bufferedOutputStream.close();
                out.close();
            } catch (IOException e) {
                error("file outputstream close error",e);
            }
        }
    }
}

