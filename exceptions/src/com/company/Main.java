
package com.company;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, DataException {
        Object[][] arr = {
                {"12", "22", "33", "14"},
                {"61", "52", "31", "41"},
                {"16", "26", "63", "64"},
                {"12", "21", "37", "gb"}};
        Object[][] Array = {
                {"12", "22", "33", "14"},
                {"61", "52", "31", "41"},
                {"16", "26", "63", "64"},
                {"12", "21", "37"}};
        Object [][] a = {
                {12 , 32 , 323, 32},
                {321, 32, 44, 43},
                {321, 32, 44, 43},
                {12 , 32 , 323, 32}};

        ArrayExcept(a);
        ArrayExcept(arr);
        ArrayExcept(Array);
    }

    public static void ArrayExcept(Object[][] Arr) throws MyArraySizeException, DataException {
        if (!(sizeCheck(Arr)))
            throw new MyArraySizeException("Массив должен быть размером 4х4");
        int sum = 0;
        for (int i = 0; i < Arr.length; i++)
            for (int j = 0; j < Arr.length; j++) {
                try {
                    sum += (int) Arr[i][j];
                } catch (ClassCastException exception) {
                    throw new DataException("В ячейке [" + i + "] " + "[" + j + "] находится не integer");
                }
            }
        System.out.println("Сумма массива : " + sum);
    }

    private static boolean sizeCheck(Object Arr[][]) {
        boolean isAcceptableSize = true;
        for (int i = 0; i < Arr.length; i++) {
            if ((Arr.length != 4) || (Arr[i].length != 4))
                isAcceptableSize = false;
        }
        return isAcceptableSize;
    }
}