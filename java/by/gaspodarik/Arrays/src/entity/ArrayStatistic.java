package entity;

import service.ServiceArray;

public class ArrayStatistic {
    private int sum;
    private int max;
    private int min;
    private double average;

    public ArrayStatistic(CustomArray arrayObject) {
        ServiceArray as = new ServiceArray();
        this.sum = as.findSum(arrayObject);
        this.max = as.findMax(arrayObject);
        this.min = as.findMin(arrayObject);
        this.average = as.findMiddle(arrayObject);
    }

    public int getSum() {
        return sum;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ArrayStatistics{");
        sb.append("sum=").append(sum);
        sb.append(", max=").append(max);
        sb.append(", min=").append(min);
        sb.append(", average=").append(average);
        sb.append('}');
        return sb.toString();
    }
}