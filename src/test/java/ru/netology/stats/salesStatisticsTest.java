package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class salesStatisticsTest {
    salesStatistics service = new salesStatistics();
    @Test
    public void searchSalesAmount(){
        double expectedSalesAmount = 164;
        double actualSalesAmount = service.salesAmount;
        Assertions.assertEquals(expectedSalesAmount,actualSalesAmount);


    }
    @Test
    public void searchAverageSales(){
        double expectedAverageSales = 13.666666666666666;
        double actualAverageSales = service.averageSales;
        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }
    @Test
    public void searchMinMonthSales(){
        int expectedMinMonthSales = 4;
        int actualMinMonthSales = service.minMonthSales;
        Assertions.assertEquals(expectedMinMonthSales,actualMinMonthSales);
    }
    @Test
    public void searchMaxMonthSales(){
        int expectedMaxMonthSales = 7;
        int actualMaxMonthSales = service.maxMonthSales;
        Assertions.assertEquals(expectedMaxMonthSales,actualMaxMonthSales);
    }
    @Test
    public void searchMonthsOfSalesBelowAverage(){
        int expectedMonthsOfSalesBelowAverage = 6;
        int actualMonthsOfSalesBelowAverage = service.monthsOfSalesBelowAverage;
        Assertions.assertEquals(expectedMonthsOfSalesBelowAverage, actualMonthsOfSalesBelowAverage);
    }
    @Test
    public void searchMonthsOfSalesBeMoreAverage(){
        int expectedMonthsOfSalesBeMoreAverage = 6;
        int actualMonthsOfSalesBeMoreAverage = service.monthsOfSalesBeMoreAverage;
        Assertions.assertEquals(expectedMonthsOfSalesBeMoreAverage, actualMonthsOfSalesBeMoreAverage);
    }


}
