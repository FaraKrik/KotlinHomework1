package com.example.kotlinnew;

public class JavaSingleton {
    static  JavaSingleton instance = null;

    private  JavaSingleton() {}

        static JavaSingleton getInstance() {
           if (instance == null) {
               instance = new JavaSingleton();
           }

           return instance;

    }
}
