package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements

        List<String> someList = new ArrayList<>();

        //TODO: Add 10 values to list

        someList.add("Nike");
        someList.add("Adidas");
        someList.add("Puma");
        someList.add("Reebok");
        someList.add("Umbro");
        someList.add("Molten");
        someList.add("Wilson");
        someList.add("Spalding");
        someList.add("Diadora");
        someList.add("Lotto");

        //TODO: Add new value at 5th position

        someList.add(4, "Gucci");

        //TODO: Change value at last position (Calculate last position programmatically)

        int lastPosition = someList.size() - 1;
        someList.set(lastPosition, "Dior");

        //TODO: Sort your list in alphabetical order

        Collections.sort(someList);

        //TODO: Check if your list contains "Foobar" element

       if (someList.contains("Foobar")){
           System.out.println("Contains");
       } else {
           System.out.println("Doesn't contain");
       }

        //TODO: Print each element of list using loop

        for (String element : someList){
            System.out.println(element);
        }
    }

}
