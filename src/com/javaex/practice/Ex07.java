package com.javaex.practice;
import java.util.*;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		System.out.print("금액: ");
		int amt = sc.nextInt();
		int count;
		
		for(int i=0; i<wonArray.length; i++) {
			if(amt > wonArray[i]) {
				count = 0;
				while(amt >= wonArray[i]) {
					amt -= wonArray[i];
					count++;
				}
				System.out.println(wonArray[i] + "원: " + count + "개");
			}
		}
		
		sc.close();
	}
}
