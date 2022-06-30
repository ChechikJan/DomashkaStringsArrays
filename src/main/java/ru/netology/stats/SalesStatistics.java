package ru.netology.stats;


import java.util.Arrays;

public class SalesStatistics {


    public double salesAmount(int[] sales) {
        double amount = 0;

        for (double i = 0; i < sales.length; i++) {
            amount = amount + sales[(int) i];
        }
        return amount;
    }

    ;

    public double averageSales(int[] sales) {
        double average = 0;
        double amount = 0;
        for (double i = 0; i < sales.length; i++) {
            amount = amount + sales[(int) i];
            average = amount / sales.length;

        }
        return average;
    }


    public int minMonthSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int maxMonthSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int monthsOfSalesBelowAverage(int[] sales) {
        int minSales = 0;

        double salesAmount = Arrays.stream(sales).sum();
        double averageSales = (salesAmount / sales.length);
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] < averageSales) minSales++;


        }


        return minSales;
    }


    public int monthsOfSalesBeMoreAverage(int[] sales) {
        int maxSales = 0;

        double salesAmount = Arrays.stream(sales).sum();
        double averageSales = (salesAmount / sales.length);
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] < averageSales) maxSales++;


        }
        return maxSales;

    }

}







