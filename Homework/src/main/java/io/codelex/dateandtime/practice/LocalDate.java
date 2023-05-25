package io.codelex.dateandtime.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class LocalDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start date (yyyy-MM-dd): ");
        String startDateStr = scanner.nextLine();

        System.out.print("Enter the end date (yyyy-MM-dd): ");
        String endDateStr = scanner.nextLine();

        long workingHours = 0;
        workingHours = calculateWorkingHours(startDateStr, endDateStr);

        System.out.println("Total working hours: " + workingHours);

    }

    public static long calculateWorkingHours(String startDateStr, String endDateStr) {
        long workingHours = 0;

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = null;
        try {
            startDate = dateFormat.parse(startDateStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        Date endDate = null;
        try {
            endDate = dateFormat.parse(endDateStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);

        while (!calendar.getTime().after(endDate)) {
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek >= Calendar.MONDAY && dayOfWeek <= Calendar.FRIDAY) {
                workingHours += 8;
            }
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        return workingHours;
    }
}
