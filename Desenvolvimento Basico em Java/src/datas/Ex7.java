package datas;

import java.util.Calendar;

public class Ex7 {
	public static void main(String[] args) {
		Calendar agora = Calendar.getInstance();

		System.out.println("A data corrente é : " + agora.getTime());
		// A data corrente é : Fri Jun 25 15:34:07 GMT-03:00 2021

		agora.add(Calendar.DATE, -15);
		System.out.println("15 dias atrás: " + agora.getTime());
		// 15 dias atrás: Thu Jun 10 15:34:07 GMT-03:00 2021

		agora.add(Calendar.MONTH, 4);
		System.out.println("4 meses depois: " + agora.getTime());
		// 4 meses depois: Sun Oct 10 15:34:07 GMT-03:00 2021

		agora.add(Calendar.YEAR, 2);
		System.out.println("2 anos depois: " + agora.getTime());
		// 2 anos depois: Tue Oct 10 15:34:07 GMT-03:00 2023
	}

}
