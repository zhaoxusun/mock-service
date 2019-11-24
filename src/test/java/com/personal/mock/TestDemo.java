package com.personal.mock;

/**
 * author: zhaoxu
 * date: 2019/4/14 下午8:29
 */
public class TestDemo {

    private static String func() {
        int random =(int) (Math.random()*10);
        if (random>4){
            return "走";
        } else {
            return "不走";
        }
    }

    private static void testGoOrNot(int count){
        int goCount = 0;
        String result ;
        for (int i = 0; i < count; i++) {
            result = func();
            if (result.equals("走")){
                goCount++;
            }
        }
        System.out.println(String.format("走：不走=%d：%d",goCount,count-goCount));
    }

    public static void main(String[] args) {
        while (true){
             testGoOrNot(9);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
