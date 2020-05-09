package br.com.localization;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeOf {

	public static void main(String[] args) {

		System.out.println(ZonedDateTime.of(2019, 6, 9, 13, 20, 3, 1000, ZoneId.of("America/Sao_Paulo")));
		LocalDateTime localDateTime = LocalDateTime.of(2019, 6, 9, 13, 20, 3, 1000);
		System.out.println(ZonedDateTime.of(localDateTime, ZoneId.of("America/Sao_Paulo")));
		LocalDate localDate = LocalDate.of(2019, 6, 9);
		LocalTime localTime = LocalTime.of(13, 20, 3, 1000);
		System.out.println(ZonedDateTime.of(localDate, localTime, ZoneId.of("America/Sao_Paulo")));

	}

}
