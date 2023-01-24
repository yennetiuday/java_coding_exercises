package com.techreturners.exercise002;

import java.util.Objects;

public class Exercise002 {

	public boolean isFromManchester(final Person person) {
		return Objects.nonNull(person) && person.getCity() != null && person.getCity().equalsIgnoreCase("manchester");
	}

	public boolean canWatchFilm(final Person person, final int ageLimit) {
		return Objects.nonNull(person) && person.getAge() >= ageLimit;
	}

}
