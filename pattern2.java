package com.bridgelabz.patterndemo;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        int i ,j ,k,row;
        System.out.println("Enter no of rows :");
       Scanner s = new Scanner(System.in);
       row=s.nextInt();

        for( i=0;i<row;i++)
        {

            for(j=row;j>i;j--)
            {
                System.out.print(" ");
            }

                for(k=0;k<=i;k++) {
                    System.out.print("* ");

                }
            System.out.println();

            }
        }


    }

