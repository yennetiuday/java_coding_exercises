package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Exercise004 {

	private static final long gigaSecond = 1000000000;

	private final LocalDateTime date;

	public Exercise004(final LocalDate date) {
		this.date = LocalDateTime.of(date.getYear(), date.getMonth(), date.getDayOfMonth(), 0, 0, 0);
	}

	public Exercise004(final LocalDateTime dateTime) {
		this.date = dateTime;
	}

	public LocalDateTime getDateTime() {
		return this.date.plus(gigaSecond, ChronoUnit.SECONDS);
	}
}
