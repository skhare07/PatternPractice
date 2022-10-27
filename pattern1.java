package com.bridgelabz.patterndemo;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {

        System.out.println("Enter row : ");
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int i , j ;



        for ( i=0; i<row; i++)
        {

            for ( j = 0; j <=i; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }

    }
}