package com.Zhangquan;

import java.sql.SQLOutput;

/**
 * @author class_Russell
 * @date 2019/12/10 0010 - 下午 19:28
 */
public class LessonString {
    public static void main(String[] args) {
        System.out.println("Hello World");
        LessonString lesson = new LessonString();
        lesson.LessonStringOpt();
    }
    public void LessonString1(){
        //有final 的声明是不能被继承的类
        String str1 = "hello";
        String str2 = "world";
        //new的新的str每个地址都会不一样
        String str3 = new String("Hello");
        //intern调用常量池中。
        String str4 = str3.intern();
        System.out.println(str1+str2);
        System.out.println(str3);
        System.out.println(str4);
    }
    public void LessonStringLength(){
        String str1 = "Hello World";
        System.out.println(str1.length());
        //代码点数就是实际真正的个数
        System.out.println(str1.codePointCount(0,str1.length()));
        String str2 =str1.substring(1,4);
        System.out.println(str2);
    }
//    public void LessonStringFormat(){
//        String str1 = "大写a："+"A"+"\n";
//        System.out.println(str1);
//
//        String str2 = String.format("大写a：%c,他的 ASCII码值是:%d %n","A");
//        System.out.println(str2);
//    }
    public void LessonStringNew(){
        String str1 = "hello";
        str1 +=",";
        str1 +="world";
        str1 +=".";
        System.out.println(str1);
        StringBuilder sb1 = new StringBuilder();

        sb1.append("hello");
        sb1.append(".");
        sb1.append("world");
        sb1.append(".");
        System.out.println(sb1.toString());
        System.out.println(sb1.length());

        sb1.setLength(9);
        System.out.println(sb1);
        sb1.setLength(20);
        System.out.println(sb1);

    }
    public void LessonStringOpt(){
        String str1 = "hello"+",world.";
        System.out.println(str1);
    }
    public void over(){
        System.out.println("good bye");
    }


}
