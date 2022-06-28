package ru.netology.stats;


import java.util.Arrays;

public class salesStatistics {
    public int[] salesMonth = {11, 10, 10, 9, 12, 17, 19, 14, 13, 18, 16, 15

    };

    public double salesAmount = Arrays.stream(salesMonth).sum();
    ;
    public double averageSales = (salesAmount / salesMonth.length);


    public int minMonthSales;

    {
        int minMonth = 0;


        for (int i = 0; i < salesMonth.length; i++) {
            if (salesMonth[i] <= salesMonth[minMonth]) {
                minMonth = i;
                minMonthSales = minMonth + 1;

            }


        }
    }

    public int maxMonthSales;

    {
        int maxMonth = 0;


        for (int i = 0; i < salesMonth.length; i++) {
            if (salesMonth[i] >= salesMonth[maxMonth]) {
                maxMonth = i;
                maxMonthSales = maxMonth + 1;
            }


        }
    }

    public int monthsOfSalesBelowAverage;

    {
        int minSales = 0;
        for (int i = 0; i < salesMonth.length; i++) {

            if (salesMonth[i] < averageSales) minSales++;
            monthsOfSalesBelowAverage = minSales;



        }
    }
    public int monthsOfSalesBeMoreAverage;

    {
        int maxSales = 0;
        for (int i = 0; i < salesMonth.length; i++) {

            if (salesMonth[i] > averageSales) maxSales++;
            monthsOfSalesBeMoreAverage = maxSales;



        }
    }
}




