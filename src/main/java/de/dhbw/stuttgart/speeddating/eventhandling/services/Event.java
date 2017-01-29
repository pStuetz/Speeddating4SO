package de.dhbw.stuttgart.speeddating.eventhandling.services;

public class Event {

    private int minAge;
    private int maxAge;
    private int day;
    private int month;
    private int year;
    private int hour;
    private int minute;
    private String time;
    private String location;
    private String city;
    private double price;

    public Event(Age age, EventDate date, EventTime time, Location location, City city,
            Price price) {

        this.minAge = age.getMinAge();
        this.maxAge = age.getMaxAge();
        this.day = date.getDay();
        this.month = date.getMonth();
        this.year = date.getYear();
        this.hour = time.getHour();
        this.minute = time.getMinute();
        this.location = location.getLocation();
        this.city = city.getCity();
        this.price = price.getPrice();
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

    public int getDay() {

        return day;
    }

    public void setDay(int day) {

        this.day = day;
    }

    public int getMonth() {

        return month;
    }

    public void setMonth(int month) {

        this.month = month;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {

        this.year = year;
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

    public String getTime() {

        return time;
    }

    public void setTime(String time) {

        this.time = time;
    }

    public String getLocation() {

        return location;
    }

    public void setLocation(String location) {

        this.location = location;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }
}
