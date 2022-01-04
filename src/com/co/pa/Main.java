package com.co.pa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(solution(a, b));
    }


    private static boolean solution(int a, int b){
        int resultA = getSumIndex(a);
        int resultB = getSumIndex(b);
        boolean resultAvsB = a == resultB;
        boolean resultBvsA = b == resultA;
        return resultAvsB && resultBvsA;
    }


    private static int getSumIndex(int value){
        int result = 1;

        for(int i = 2; i < value; i++){
            if(value % i == 0){
                result += i;
            }
        }

        return result;
    }


}
