package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        salesStatistics service = new salesStatistics();

        System.out.println(service.salesAmount);
        System.out.println(service.averageSales);
        System.out.println(service.minMonthSales);
        System.out.println(service.maxMonthSales);
        System.out.println(service.monthsOfSalesBelowAverage);
        System.out.println(service.monthsOfSalesBeMoreAverage);
    }
}