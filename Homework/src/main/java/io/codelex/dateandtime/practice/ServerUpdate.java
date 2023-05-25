package io.codelex.dateandtime.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ServerUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the launch date (yyyy-MM-dd): ");
        String launchDateStr = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date launchDate = null;
        try {
            launchDate = dateFormat.parse(launchDateStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        calculateServerUpdate(launchDate);
    }

    private static void calculateServerUpdate(Date launchDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(launchDate);

        calendar.add(Calendar.DAY_OF_MONTH, 14);
        Date updateDate = calendar.getTime();

        int currentMonth = calendar.get(Calendar.MONTH);
        while (calendar.get(Calendar.MONTH) == currentMonth) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String updateDateStr = dateFormat.format(updateDate);
            System.out.println(updateDateStr);

            calendar.add(Calendar.DAY_OF_MONTH, 14);
            updateDate = calendar.getTime();
        }
    }
}
