package datas;

import java.time.Instant;
import java.util.Date;

public class Ex5 {
	public static void main(String[] args) {
		
		//Exemplo de convers�o entre Date e Instant

        Date dataInicio = new Date(1513124807691L);
        System.out.println(dataInicio);
        // Tue Dec 12 22:26:47 BRST 2017

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);
        // 2017-12-13T00:26:47.691Z
    }

}