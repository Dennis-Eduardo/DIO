package datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10 {

	public static void main(String[] args) {

		Date agora = new Date();

		SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss:mmm");

		String dataFormatada1 = formatter1.format(agora);
		String dataFormatada2 = formatter2.format(agora);

		System.out.println(dataFormatada1);
		// 25/06/2021
		System.out.println(dataFormatada2);
		//16:12:04:012


	}

}
