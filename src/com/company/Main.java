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
        initArray(arr);
        long a = System.currentTimeMillis();
        makeArrayCalculations(arr, 0);
        System.out.println(" Время выполнения метода 1: " + (System.currentTimeMillis() - a));

    }

    public static void test2() {
        float[] arr = new float[SIZE];
        initArray(arr);
        float[] a1 = new float[H];
        float[] a2 = new float[H];
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, H);
        System.arraycopy(arr, H, a2, 0, H);
        new Thread(() -> makeArrayCalculations(a1, 0)).start();
        new Thread(() -> makeArrayCalculations(a2, H)).start();
        System.arraycopy(a1, 0, arr, 0, H);
        System.arraycopy(a2, 0, arr, H, H);
        System.out.println(" Время выполнения метода 2: " + (System.currentTimeMillis() - a));
    }

    public static void makeArrayCalculations(float[] Arr, int shift) {
        for( int i = shift; i < Arr.length; i++){
            Arr[i] = (float) (Arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        i++;
        }
    }

    public static void initArray(float[] Arr) {
        for (int i = 0; i < SIZE; i++)
            Arr[i] = 1;
    }

}

