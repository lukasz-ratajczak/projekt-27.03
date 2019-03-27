package com.company;

public class CountFibonacci {


    public int fibRek(int count) {

        if (count == 0) return 0;
        if (count == 1) return 1;

        return fibRek(count - 1) + fibRek(count - 2);
    }

    public int fibIt(int count) {
        int a = 0, b = 1;
        int c = 0;


        if (count == 0) return 0;
        if (count == 1) return 1;

        for (int i = 1; i < count; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}


