package com.javaex.practice;
import java.util.*;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[5];
		int[] card = new int[5];
		boolean winner = true;
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
			for(int j=0; j<i; j++) {
				while(lotto[i] == lotto[j]) {
					lotto[i] = (int)(Math.random()*45) + 1;
				}
			}
		}
		
		for(int i=0; i<card.length; i++) {
			card[i] = (int)(Math.random()*60) + 1; //rigged
			for(int j=0; j<i; j++) {
				while(card[i] == card[j]) {
					card[i] = (int)(Math.random()*45) + 1;
				}
			}
		}
		
		System.out.println("당첨 번호: ");
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		System.out.println("");
		
		System.out.println("당신의 번호: ");
		for(int i=0; i<lotto.length; i++) {
			System.out.print(card[i] + " ");
		}
		
		System.out.println("");
		
		for(int i=0; i<lotto.length; i++) {
			if(lotto[i] != card[i]) {
				winner = false;
				break;
			}
		}
		
		if(winner) {
			System.out.println("당첨입니다! 축하합니다!!!!!");
		} else {
			System.out.println("이쉽습니다...");
		}
		
		sc.close();
	}
}
