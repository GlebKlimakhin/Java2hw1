package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class TelephoneDirectory {
    protected HashMap<String, ArrayList<String>> hm;

    public TelephoneDirectory() {
        this.hm = new HashMap<>();
    }

    protected void add(String surname, String number) {
        if (hm.containsValue(number)) {
            System.out.println("Человек с таким номером телефона уже существует, повторите ввод!");
            return;
        }
        ArrayList<String> telephoneBill = hm.get(surname);
        if (telephoneBill == null) {
            telephoneBill = new ArrayList<>();
        }
        telephoneBill.add(number);
        hm.put(surname, telephoneBill);
        System.out.println(surname + " c номером телефона " + number + " добавлен в справочник!");
    }


    protected void get(String surname) {
        if (hm.containsKey(surname)) {
            System.out.println(surname + " : " + hm.get(surname).toString());
        }
        else
            System.out.println("Человека с такой фамилией нет в справочнике!");

    }
}
