package io.codelex.collections.practice.phonebook;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectory {
    private final TreeMap<String, String> data;

    public PhoneDirectory() {
        data = new TreeMap<>();

    }

    public int find(String name) {
        int i = 0;
        for (Map.Entry<String, String> entry : data.entrySet()) {
            if (entry.getKey().equals(name)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public TreeMap<String, String> getData() {
        return data;
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        data.put(name, number);
    }
}
