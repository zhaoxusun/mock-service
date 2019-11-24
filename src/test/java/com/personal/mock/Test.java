package com.personal.mock;

/**
 * author: zhaoxu
 * date: 2019/5/5 上午11:51
 */
public class Test {

    public static int func(int n){
        if (n<=0){
            return -1;
        }else if (n==1||n==2){
            return 1;
        }
        int [] num = new int[n];
        num[0] = 1;
        num[1] = 1;
        for (int i = 2; i < n; i++) {
            num[i] = num[i-1]+num[i-2];
        }
        return num[n-1];
    }


    public static void sort(int [] array){
        int length = array.length;

        for (int i=0;i<length-1;i++){
            for (int j=0;j<length-i-1;j++){
                if (array[j]<array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        for (int i=0;i<length;i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int [] array = {1,3,2,8,5};
        sort(array);
    }
}
