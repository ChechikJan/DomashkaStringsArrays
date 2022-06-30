package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesStatisticsTest {
    SalesStatistics service = new SalesStatistics();
    public int[] sales = {11, 10, 10, 9, 12, 17, 19, 14, 13, 18, 16, 15

    };

    @Test
    public void searchSalesAmount() {

       double expectedSalesAmount = 164;
        double actualSalesAmount = service.salesAmount(sales);
        Assertions.assertEquals(expectedSalesAmount, actualSalesAmount);


    }
    @Test
    public void searchAverageSales(){
        double expectedAverageSales = 13.666666666666666;
        double actualAverageSales = service.averageSales(sales);
        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }
    @Test
    public void searchMinMonthSales(){
        int expectedMinMonthSales = 4;
        int actualMinMonthSales = service.minMonthSales(sales);
        Assertions.assertEquals(expectedMinMonthSales,actualMinMonthSales);
    }
    @Test
    public void searchMaxMonthSales(){
        int expectedMaxMonthSales = 7;
        int actualMaxMonthSales = service.maxMonthSales(sales);
        Assertions.assertEquals(expectedMaxMonthSales,actualMaxMonthSales);
    }
    @Test
    public void searchMonthsOfSalesBelowAverage(){
        int expectedMonthsOfSalesBelowAverage = 6;
        int actualMonthsOfSalesBelowAverage = service.monthsOfSalesBelowAverage(sales);
        Assertions.assertEquals(expectedMonthsOfSalesBelowAverage, actualMonthsOfSalesBelowAverage);
    }
    @Test
    public void searchMonthsOfSalesBeMoreAverage(){
        int expectedMonthsOfSalesBeMoreAverage = 6;
        int actualMonthsOfSalesBeMoreAverage = service.monthsOfSalesBeMoreAverage(sales);
        Assertions.assertEquals(expectedMonthsOfSalesBeMoreAverage, actualMonthsOfSalesBeMoreAverage);
    }



}
