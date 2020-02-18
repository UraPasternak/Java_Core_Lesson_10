package ua.lviv.lgs.hw10.zavdania1;

import java.lang.StringBuilder;
import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		Scanner scaner = new Scanner(System.in);
		String s, rs;
		
		while(true){
			System.out.println("Введіть слово з 5-ти букв: ");
			s = scaner.nextLine().toLowerCase();
			StringBuilder str = new StringBuilder(s);
			str.reverse();
			rs = str.toString();
			palind(s, rs);
			
		}

	}
	
	public static void palind(String s, String rs){
		if(s.length()==5){
			if(s.equals(rs)){
				System.out.println("Введене слово є паліндромом!");
			}
			else{
				System.out.println("Введене слово НЕ паліндром!");
			}
		}
		else{
			System.err.println("Введене слово складається не з 5-ти букв!!!");
		}
		
		System.out.println("===========================================");
		System.out.println("");
	}

}
