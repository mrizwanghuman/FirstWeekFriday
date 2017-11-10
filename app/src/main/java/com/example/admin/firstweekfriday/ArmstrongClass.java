package com.example.admin.firstweekfriday;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by  Admin on 11/10/2017.
 */

public class ArmstrongClass {

    public static void main(String[] args) {
        CheckArmStrongNumber(153);
    }

    public  static  void CheckArmStrongNumber(int number){

        String numberToString = Integer.toString(number);

        String[] splitNum = numberToString.split("");

        List<Double> cubicNumList = new ArrayList<>();

        for (int i = 0; i < splitNum.length; i++) {

            double converSToN = Double.parseDouble(splitNum[i]);

            double cubicNum = Math.pow(converSToN, 3);

            cubicNumList.add(cubicNum);

        }

        int i;
        double sum = 0;
        for (int j = 0; j < cubicNumList.size(); j++) {
            sum += cubicNumList.get(j);
        }

        Integer doubleToInt = (int)sum;

        if(doubleToInt == number){
            System.out.println("This is Armstrong number");
        }

    }
}
