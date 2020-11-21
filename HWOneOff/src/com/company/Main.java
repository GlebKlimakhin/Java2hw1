package com.company;

public class Main {
    static final int SIZE = 10000000;
    static final int H = SIZE / 2;

    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++)
            arr[i] = 1;
        long a = System.currentTimeMillis();
            makeArrayCalculations(arr);
        System.out.println(System.currentTimeMillis() - a);

    }

    public static void test2() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++)
            arr[i] = 1;
        float[] a1 = new float[H];
        float[] a2 = new float[H];
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, H);
        System.arraycopy(arr, H, a2, 0, H);
        new Thread(() -> makeArrayCalculations(a1)).start();
        new Thread(() -> makeArrayCalculations(a2)).start();
        System.arraycopy(a1, 0, arr, 0, H);
        System.arraycopy(a2, 0, arr, H, H);
        System.out.println(System.currentTimeMillis()-a);
    }
    public static void makeArrayCalculations(float [] Arr)
    {
        for (int i = 0; i < Arr.length; i++)
        {
            Arr[i] = (float) (Arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

        }
    }
}

