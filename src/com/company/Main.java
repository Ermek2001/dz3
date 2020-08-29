package com.company;

public class Main<is> {

    public static void main(String[] args) {

        double[] massiv = {78.45, 23.12, 567.34, -32.67, 99.12, 412.78, 55.11, -34,78, 900.75, 345.23, 12.34, 45.96, 22.78, 40.34,10.8};
        boolean isStart = false;

        double positiveCount = 0;
        double summa = 0;
        int counter = 0;

        for (double i : massiv){
            if (!isStart && i < 0){
                isStart = true;
                continue;
            }
            else if (isStart && i > 0){
                positiveCount +=i;
                counter++;
            }
            summa = positiveCount / counter;
        }

        System.out.println(summa);

    }
}
