package ru.netology.stats;

public class StatsService {

    public long summary(long[] sales) {

        long result = 0;
        for (int i = 0; i < sales.length; i++) {
            result += sales[i];
        }
        return result;
    }

    public long avAmount(long[] sales) {
        return summary(sales) / sales.length;

    }

    public int maxMonth(long[] sales) {
        int mMonth = 0;
        long mSales = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= mSales) {
                mSales = sales[i];
                mMonth = i;
            }
        }
        return mMonth + 1;
    }

    public int minMonth(long[] sales) {
        int minMonth = 0;
        long minSales = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= minSales) {
                minSales = sales[i];
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int belowAv(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale < avAmount(sales)) {
                count++;
            }
        }
        return count;
    }

    public int aboveAv(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale > avAmount(sales)) {
                count++;
            }
        }
        return count;
    }

}