package com.example.admin.firstweekfriday;

/**
 * Created by  Admin on 11/10/2017.
 */

public class SingletonClass {
private static  SingletonClass myObject;

    public SingletonClass() {
    }

    public  static SingletonClass getSinpleInstance() {
        if (myObject == null) {
            myObject = new SingletonClass();
        }
        return myObject;
    }

    public static  void someMethod(){
        System.out.println("this is Singleton method");
    }

    public static void main(String[] args) {

        SingletonClass st = SingletonClass.getSinpleInstance();
        st.someMethod();

    }
}
