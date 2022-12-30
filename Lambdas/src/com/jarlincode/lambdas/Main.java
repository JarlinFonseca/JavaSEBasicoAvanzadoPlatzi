package com.jarlincode.lambdas;

public class Main {
    public static void main(String[] args) {
        OnOneListener onOneListener = new OnOneListener() {
            @Override
            public void onOne(String message) {
                System.out.println("One: "+message);
            }

        };

        OnOneListener onOneListener2 = (String message) -> {
            System.out.println("One Lambda :) "+message);
        };

        onOneListener.onOne("Sin Lambda :(");
        onOneListener2.onOne("Con Lambda :)");

        OnOneListener onOneListener3 = message -> System.out.println("Tu mensaje: "+message);
        onOneListener3.onOne("HOLA :)");



    }
}
