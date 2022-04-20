package com.javaex.practice;

import java.util.Scanner;

public class Test {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[] bArray = new int[5];
      
      int sum = 0;
      
      for(int i = 0; i<bArray.length; i++) {
         bArray[i] = input.nextInt();
         sum += bArray[i];
      }
      System.out.println("평균은 " + (double)sum / bArray.length + " 입니다.");
      input.close();
   }

}