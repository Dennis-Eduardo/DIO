package datas;

import java.text.DateFormat;
import java.util.Date;

public class Ex9 {
	public static void main(String[] args) {

		Date agora = new Date();

		String dateToStr = DateFormat.getInstance().format(agora);
		System.out.println(dateToStr);
		// 25/06/2021 16:05

		dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
		System.out.println(dateToStr);
		// 25 de junho de 2021 16:05

		dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(agora);
		System.out.println(dateToStr);
		// 25 de junho de 2021 16:05:11 GMT-03:00

	}

}
