package ua.lviv.lgs.hw10.zavdania2;

import java.util.Scanner;

public class golosTyre {

	public static void main(String[] args) {

		while (true) {
			System.out.println("Введіть строку:");
			Scanner scaner = new Scanner(System.in);
			String s = scaner.nextLine();
			s = s.replace('а', '-');
			s = s.replace('о', '-');
			s = s.replace('е', '-');
			s = s.replace('і', '-');
			s = s.replace('и', '-');
			s = s.replace('у', '-');
			System.out.println("Нова строка: \n" + s + "\n");
			System.out.println("======================================= \n");
		}
	}

}
