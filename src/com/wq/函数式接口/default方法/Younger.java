package com.wq.函数式接口.default方法;

/**
 * Created by 王萍 on 2017/1/16 0016.
 */
public interface Younger {

    default void print(){
        System.out.println("I am a Younger!!");
    }

    static void sayHello(){
        System.out.println("Younger is the capital");
    }
}
