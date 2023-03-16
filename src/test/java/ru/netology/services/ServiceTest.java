package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class ServiceTest {
    @ParameterizedTest()
    @CsvFileSource(files="src/test/resources/testVacationTime.csv")
//    @CsvSource({
//        "2,100000,40000,250000",
//        "1,100000,60000,250000"
//    })
    public void testVacationTime (int expected, int income, int expenses, int threshold) {
        Service vacationTime = new Service();
        int actual = vacationTime.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
