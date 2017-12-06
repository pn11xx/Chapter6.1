package com.example.pngo.chapter61final;

/**
 * Created by pngo on 12/5/17.
 *
 */

public class Calculator {

    public static double findSum(double [] numbers){
        double sum = 0.0;
        for(double x:numbers){
            sum += x;
        }
        return sum;
    }

    public static double findAverage(double [] numbers){
        double avg = 0.0;
        double sum = 0.0;
        for(double x:numbers){
            sum += x;
        }
        avg = sum/numbers.length;
        return avg;
    }

    public static int findFactorial(int number){
        int fact = 1;
        for (int i = number; i > 0; i--){
            fact += i;
        }
        return fact;
    }




}
