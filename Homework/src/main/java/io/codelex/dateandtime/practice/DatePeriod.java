package io.codelex.dateandtime.practice;
import java.time.LocalDate;

public class DatePeriod {
        private LocalDate start;
        private LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }
    public DatePeriod intersection(DatePeriod datePeriod){
        LocalDate intersectionStart = this.start.isAfter(datePeriod.start) ? this.start : datePeriod.start;
        LocalDate intersectionEnd = this.end.isBefore(datePeriod.end) ? this.end : datePeriod.end;

        if (intersectionStart.isAfter(intersectionEnd)) {
            return null;
        } else {
            return new DatePeriod(intersectionStart, intersectionEnd);
        }
    }
}
