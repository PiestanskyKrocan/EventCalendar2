package sdj.project.eventcalendar.controller;

import org.springframework.web.bind.annotation.*;
import sdj.project.eventcalendar.Entity.EventEntity;
import sdj.project.eventcalendar.service.EventService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/event")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<EventEntity> findAllEvents() {
        return eventService.findAllEvents();
    }

    @GetMapping("/{id}")
    public Optional<EventEntity> findEventById(@PathVariable("id") Long id) {

        return eventService.findById(id);
    }

    @PostMapping
    public EventEntity saveEvent(@RequestBody EventEntity eventEntity) {
        return eventService.saveEvent(eventEntity);
    }

    @PutMapping
    public EventEntity updateEvent(@RequestBody EventEntity eventEntity) {
        return eventService.updateEvent(eventEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable("id") Long id) {
        eventService.deleteEvent(id);
    }

}
