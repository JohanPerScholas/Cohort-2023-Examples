package org.example;

public class ClassExample {

    public static void main(String args[]){
        call();
        System.out.println("Main Method: I'm am good, how about you?");
        call2("Call Method 2: I'm glad to hear it!");
    }

    /* IN CUSTOMER SUPPORT */
    public static void call(){
        System.out.println("Call Method: How are you?");
    }

    public static void call2(String x){
        System.out.println(x);
        /* IN MARKETING */
    }



}
