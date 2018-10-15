package com.example.linio;

public class linioChallenge {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("LINIANOS");
            }

            while (i % 3 == 0 && i % 5 != 0) {
                System.out.println("LINIO");
                break;
            }

            while (i % 5 == 0 && i % 3 != 0) {
                System.out.println("IT");
                break;
            }

            while (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
