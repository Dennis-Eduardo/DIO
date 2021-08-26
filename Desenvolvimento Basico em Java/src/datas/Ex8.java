package datas;

import java.util.Calendar;

public class Ex8 {
	public static void main(String[] args) {
		
		//Algumas conversões de data
		
		Calendar agora = Calendar.getInstance();
		
		System.out.printf("%tc\n", agora);
		//sex jun 25 15:42:00 GMT-03:00 2021
		
		System.out.printf("%tF\n", agora);
		//2021-06-25
		
		System.out.printf("%tD\n", agora);
		//06/25/21
		
		System.out.printf("%tr\n", agora);
		//03:42:00 PM
		
		System.out.printf("%tT\n", agora);
		//15:42:00
	}

}
