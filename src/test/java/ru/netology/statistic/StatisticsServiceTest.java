package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMaxFirstElementIsMax() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {15, 10, 8, 12, 5};
        assertEquals(15, service.findMax(incomes));
    }

    @Test
    void findMaxMiddleElementIsMax() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {10, 5, 20, 8, 15};
        assertEquals(20, service.findMax(incomes));
    }

    @Test
    void findMaxLastElementIsMax() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {10, 5, 8, 12, 15};
        assertEquals(15, service.findMax(incomes));
    }

    @Test
    void findMaxWithNegativeNumbers() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {-10, -5, -8, -3, -15};
        assertEquals(-3, service.findMax(incomes));
    }

    @Test
    void findMaxWithAllEqualValues() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {7, 7, 7, 7, 7};
        assertEquals(7, service.findMax(incomes));
    }

    @Test
    void findMaxWithSingleElement() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {100};
        assertEquals(100, service.findMax(incomes));
    }

    @Test
    void findMaxWhenNoNewMaxFound() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {15, 10, 8, 12, 5};
        assertEquals(15, service.findMax(incomes));
    }
}