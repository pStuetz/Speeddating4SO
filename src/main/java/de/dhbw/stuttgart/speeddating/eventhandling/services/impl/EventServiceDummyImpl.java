package de.dhbw.stuttgart.speeddating.eventhandling.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import de.dhbw.stuttgart.speeddating.eventhandling.services.Age;
import de.dhbw.stuttgart.speeddating.eventhandling.services.City;
import de.dhbw.stuttgart.speeddating.eventhandling.services.Event;
import de.dhbw.stuttgart.speeddating.eventhandling.services.EventDate;
import de.dhbw.stuttgart.speeddating.eventhandling.services.EventService;
import de.dhbw.stuttgart.speeddating.eventhandling.services.EventTime;
import de.dhbw.stuttgart.speeddating.eventhandling.services.Location;
import de.dhbw.stuttgart.speeddating.eventhandling.services.Price;

@Service
public class EventServiceDummyImpl implements EventService {
	
	List<Event> eList = new ArrayList<Event>();
	
	@Override
	public void initEvents(){
	    eList.add( new Event(new Age(18,22), new EventDate(19, 2, 2017), new EventTime(19, 00), new Location("Besitos"), new City("Stuttgart"), new Price(19.00)));
	    eList.add( new Event(new Age(30,46), new EventDate(21, 3, 2017), new EventTime(19, 00), new Location("Park-Inn"), new City("Stuttgart"), new Price(19.00)));
	    eList.add( new Event(new Age(25,35), new EventDate(06, 4, 2017), new EventTime(19, 00), new Location("Besitos"), new City("Stuttgart"), new Price(19.00)));
	}
	
	@Override
	public List<Event> getAllEvents() {
		return this.eList;
	}
/*
	@Override
	public void addEvent(Event event) {
		
		this.eList.add(event);
		
	}

    @Override
    public Event getEventById(int id) {

        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Event> getEventByLocation(Location loc) {

        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Event> getEventByAge(Age a) {

        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Event> getEventByCity(String city) {

        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Event> getEventByDate(Date date) {

        // TODO Auto-generated method stub
        return null;
    }
*/
}
