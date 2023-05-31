package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UsernameCheck {
    public static void main(String[] args) {

        Set<String> usernameCheck = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");

        String name;
        while (!(name = scanner.nextLine()).isEmpty()) {
            usernameCheck.add(name);
        }

        System.out.println("Unique name list contains: ");
        for (String username : usernameCheck){
            System.out.println(username);
        }

    }
}
