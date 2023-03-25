package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }

        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthMaxSales(long[] sales) {
        int monthMax = 0;
        long maxSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSales) {
                monthMax = i;
                maxSales = sales[i];
            }
        }
        return monthMax + 1;
    }

    public int monthMinSales(long[] sales) {
        int monthMin = 0;
        long minSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSales) {
                monthMin = i;
                minSales = sales[i];
            }
        }
        return monthMin + 1;
    }

    public int monthsBelowAverage(long[] sales) {
        int counter = 0;
        long averageSales = average(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                counter++;
            }
        }

        return counter;
    }

    public int monthsHigherAverage(long[] sales) {
        int counter = 0;
        long averageSales = average(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                counter++;
            }
        }

        return counter;
    }
}




