package com.company;

import java.util.StringTokenizer;

public class TallPeople {

    public static void main(String[] args) {
        TallPeople solution = new  TallPeople();
        String[] input = {"9 2 3",
                "4 8 7"};

        solution.getPeople(input);
//        String s = "9 2 3";

//        System.out.println(String.format("Highest Value found is : %d",tallestOfShortest));
//        System.out.println(String.format("Smallest Value found is : %d",shortestOfTallest));
    }

    public int [] getPeople(String [] people){
        int[] result = new int[2];

        int shortestOfTallest = 999999999;
        int [] tallestArray = new int[50];
        int tallestOfShortest = 0;
        int arraySize=0;
        for(String s:people){
            StringTokenizer st = new StringTokenizer(s);
//            int tallestRowInt =0;
            int shortestRowInt = 99999999;
            st.countTokens();
            int counter =0;
            while(st.hasMoreTokens()){
                String t = st.nextToken();
                int i = Integer.parseInt(t);
                if (i>tallestArray[counter]){
                    tallestArray[counter]=i;
                }
                if(i<shortestRowInt){
                    shortestRowInt = i;
                }
//                System.out.println(i);
                counter++;
            }
            if(shortestRowInt > tallestOfShortest){
                tallestOfShortest = shortestRowInt;
            }
            if(counter>arraySize){
                arraySize = counter;
            }
//            if(tallestRowInt < shortestOfTallest){
//                shortestOfTallest = tallestRowInt;
//            }

        }

        for(int x =0;x<arraySize; x++){
            if(tallestArray[x]<shortestOfTallest){
                shortestOfTallest = tallestArray[x];
            }
        }

        result[0]=tallestOfShortest;
        result[1]=shortestOfTallest;
        return result;
    }


}
