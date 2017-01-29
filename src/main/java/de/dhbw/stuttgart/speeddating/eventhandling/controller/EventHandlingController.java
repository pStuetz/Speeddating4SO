package de.dhbw.stuttgart.speeddating.eventhandling.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import de.dhbw.stuttgart.speeddating.eventhandling.services.EventService;
import de.dhbw.stuttgart.speeddating.eventhandling.services.Event;

@Controller
public class EventHandlingController {
	
	private EventService eService;
	
	@Autowired
	public void setEventService(EventService eService){
		this.eService = eService;
	}
	
	@RequestMapping(value="/loadEvents")
	public String loadAllEvents(Model model){
	    eService.initEvents();
		List<Event> allEvents = eService.getAllEvents();
		
		model.addAttribute("allEvents", allEvents);
		return "displayAllEvents";
	}
}
