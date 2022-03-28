package com.example.kotlinnew;

import android.content.Context;

public class SomeJavaClass {
    private Context context;

    public SomeJavaClass(Context context) {
        this.context = context;
    }


    void someMethod() {
        Person person = new Person("Ivan", "Sidorov", 23);
        person.getAge();
        person.setAge(20);


        KotlinSingleton.INSTANCE.getSomeFiled();

        SecondActivity.Companion.start(33, context);
    }
}
