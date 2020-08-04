package org.example;

public class MyClass {
    public static void existingStaticMethod(String name, int age) {
        System.out.println(name + " is " + age + " years old.");
    }
    public static void main(String args[])
    {
        MyFunctionalInterface myFunctionalInterface=MyClass::existingStaticMethod;
        myFunctionalInterface.mySingleAbstractMethod("John",20);
    }
}
