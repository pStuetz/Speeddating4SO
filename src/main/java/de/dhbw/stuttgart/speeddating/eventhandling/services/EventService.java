package de.dhbw.stuttgart.speeddating.eventhandling.services;

import java.util.Date;
import java.util.List;

public interface EventService {
	
    public void initEvents();
    
	public List<Event> getAllEvents();
	
	//public Event getEventById(int id);
	
	//public List<Event> getEventByLocation(Location loc);

	//public List<Event> getEventByAge(Age a);
	
	//public List<Event> getEventByCity(String city);
	
	//public List<Event> getEventByDate(Date date);
	
	//public void addEvent(Event event);
	
}
