package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> array = new ArrayList<>();
        array.add("GKFFD");
        array.add("TNANA");
        array.add("MPMSL");
        array.add("PSWME");
        array.add("LZMLF");
        array.add("JYEBV");
        array.add("YELNT");
        array.add("JSNKR");
        array.add("JFESF");
        array.add("TMJLL");

        return array;
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (String array: customList){
            System.out.println(array);
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void main(String[] args) {
        List<String> arrayList = createArrayList();

        boolean addedtoArrayList = addElementToList(arrayList, "AAAAA");

        System.out.println("Añadido a ArrayList" + addedtoArrayList);
        System.out.println("\nContenido de ArrayList: ");
        printElementsAndIndex(arrayList);
    }


}
