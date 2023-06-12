package io.codelex.oop.summary;

import java.time.LocalDate;

public interface SellableThing extends Item{
    String getName();
    double getPrice();
    String getFullInfo();
    LocalDate getExpirationDate();
}
