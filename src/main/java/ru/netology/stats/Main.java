package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        SalesStatistics service = new SalesStatistics();
        int[] sales = {11, 10, 10, 9, 12, 17, 19, 14, 13, 18, 16, 15

        };

        System.out.println(service.salesAmount(sales));
        System.out.println(service.averageSales(sales));
        System.out.println(service.minMonthSales(sales));
        System.out.println(service.maxMonthSales(sales));
        System.out.println(service.monthsOfSalesBelowAverage(sales));
        System.out.println(service.monthsOfSalesBeMoreAverage(sales));
    }
}