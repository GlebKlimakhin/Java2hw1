package com.company;

import com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------------");
        printUniqueWords();//1-е задание
        System.out.println("-----------------");
        telephoneDirActions();//2-е задание

    }
    public static void printUniqueWords()
    {
       /* ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add(1,"ds");
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        arrayList.get(1);
        arrayList.set(1,"dss");
        arrayList.remove(0);
        arrayList.set(0,"d");
        arrayList.trimToSize();
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        String arr [] = new String[arrayList.size()];
        arrayList.toArray(arr);
        System.out.println(arr.length);
        */

        ArrayList<String> words = new ArrayList<>();
        words.ensureCapacity(15);
        words.addAll(Arrays.asList("мама", "рама", "краб", "краб",
                "мрак", "брак", "мрак", "рама",
                "драма", "java", "папа","шов" , "шорох",
                "мир", "дом"));
        Collections.sort(words);
        Set <String> uniqueWords = new HashSet<>(words);
        System.out.print("Изначальный массив: ");
        System.out.println(words.toString());
        System.out.print("Массив без дубликатов слов: ");
        System.out.println(uniqueWords.toString());
        System.out.println("Количество раз, которые встречаются все слова:");
        uniqueWords.stream().map(o -> o + ":" + Collections.frequency(words, o) + "  ").forEach(System.out::print);
        System.out.println();

    }
    public static void telephoneDirActions()
    {
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add("Терентьев", "+78005553535");
        telephoneDirectory.add("Герр", "+79788603454");
        telephoneDirectory.add("Храмов", "+79892340902");
        telephoneDirectory.add("Герр", "+75632348099");
        telephoneDirectory.add("Сартр", "+76666666666");
        telephoneDirectory.get("Храмов");
        telephoneDirectory.get("Быков");
        telephoneDirectory.get("Герр");
    }
}
