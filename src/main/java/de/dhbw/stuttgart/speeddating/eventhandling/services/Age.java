package de.dhbw.stuttgart.speeddating.eventhandling.services;

public class Age {

	private int minAge;
	private int maxAge;

	public Age(int minAge, int maxAge) {
		this.minAge = minAge;
		this.maxAge = maxAge;
	}
	
	public int getMinAge() {

		return minAge;
	}

	public void setMinAge(int minAge) {

		this.minAge = minAge;
	}

	public int getMaxAge() {

		return maxAge;
	}

	public void setMaxAge(int maxAge) {

		this.maxAge = maxAge;
	}
}
