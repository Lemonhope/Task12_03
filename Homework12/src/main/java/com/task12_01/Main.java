
package com.task12_01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        List<Integer> myList=new ArrayList<>();
        for(int i=0;i<10;i++){
            myList.add(getRandomNumber(0, 10));
        }
        System.out.println("Original array:");
        System.out.println(myList);

        List<Integer> squares=myList.stream()
                .map(i->i*i)
                .collect(Collectors.toList());
        System.out.println("List of squares:\n"+squares);
        int sum=squares.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of squares = "+sum);

    }
}
