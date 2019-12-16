package com.Zhangquan;

import java.util.Arrays;

public class First {


    public void IfElse(){
        int n1 =1;
        int n2 =4;
        System.out.println(n1+n2);
    }
    public static void plusForEvenIndex(int[] arr){
        for(int index =0;index<arr.length;index++){
            if (arr[index]%2!=0){
                arr[index] = arr[index]+1;

            }
        }
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,10};
        plusForEvenIndex(a);
        System.out.println(Arrays.toString(a));
    }
}
