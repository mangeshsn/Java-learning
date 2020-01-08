package com.core.java8.date;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DateTime {
	public static void main(String[] args) {
		List<People> people = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(DateTime.class.getResourceAsStream("details.txt")));
				Stream<String> stream = reader.lines();) {
			stream.map(line -> {
				String[] s = line.split(" ");
				String name = s[0].trim();
				int year = Integer.parseInt(s[1]);
				Month month = Month.of(Integer.parseInt(s[2]));
				int day = Integer.parseInt(s[3]);
				People p = new People(name, LocalDate.of(year, month, day));
				people.add(p);
				return p;
			}).forEach(System.out::println);

		} catch (Exception e) {

		}
	}
}
