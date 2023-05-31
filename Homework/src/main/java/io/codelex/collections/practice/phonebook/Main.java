package io.codelex.collections.practice.phonebook;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.putNumber("Gatis Strauss", "28311419");
        phoneDirectory.putNumber("Janis Jarans", "29123123");
        phoneDirectory.putNumber("Visvaldis Avotins", "28123123");

        int index = phoneDirectory.find("Arturs Silovs");
        if (index != -1) {
            System.out.println("Contact found at index " + index);
        } else {
            System.out.println("Contact not found.");
        }

        phoneDirectory.putNumber("Miks Indrasis", "27123123");
        phoneDirectory.putNumber("Harijs Vitolins", "27123121");

        System.out.println("Phone Directory:");
        TreeMap<String, String> data = phoneDirectory.getData();
        for (Map.Entry<String, String> entry : data.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
