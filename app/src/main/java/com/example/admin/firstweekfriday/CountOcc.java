package com.example.admin.firstweekfriday;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by  Admin on 11/10/2017.
 */

public class CountOcc {



    public static void main(String[] args) {

        int[] numarray = { 2, 3, 4, 5, 5, 6, 7 };
        List<Integer> numarraylist = new ArrayList<>();
        int firnum = numarray[0]-1;
        int count = 1;

        for (int n = 0; n < numarray.length; n++)
        {

            //Console.WriteLine(numarray[n]);
            if (firnum == numarray[n])
            {
                ++count;
                numarraylist.add(numarray[n]);
            }
            else
            {
                firnum = numarray[n];

            }
        }
        for (int i =0; i<numarraylist.size();i++){
            System.out.println("Number "+numarraylist.get(i));
        }

        System.out.println("Count " + count);
    }










}
