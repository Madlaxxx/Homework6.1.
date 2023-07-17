package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ScheduleServiceTest {
    ScheduleService service = new ScheduleService();

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/schedule.csv")
    public void ScheduleCalc(int expected, int income, int expenses, int threshold) {
        //int expected = 3;
        //int income = 10_000;
        //int expenses = 3_000;
        //int threshold = 20_000;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(actual, expected);
    }

    //@Test
    // public void ScheduleOrCalc() {
    //int expected = 2;
    //int income = 100_000;
    //int expenses = 60_000;
    //int threshold = 150_000;
    //int actual = service.calculate(income, expenses, threshold);

    //Assertions.assertEquals(actual, expected);
    //}
}
