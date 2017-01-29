package de.dhbw.stuttgart.speeddating.eventhandling.services;

public class EventTime {
	
	private int hour;
	private int minute;
	
	public EventTime(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
}