package datas;

import java.util.Date;

public class Ex2 {
	public static void main(String[] args) {
		// Exemplo de utilização do construtor com passagem de parametro em milisegundos

		Long currentTimeMillis = System.currentTimeMillis();

		System.out.println(currentTimeMillis);
		// 1624631045474

		Date novaData = new Date(currentTimeMillis);

		System.out.println(novaData);
		// Fri Jun 25 11:24:05 GMT-03:00 2021

	}

}
