package sdj.project.eventcalendar.service;

import sdj.project.eventcalendar.Entity.EventEntity;

import java.util.List;
import java.util.Optional;

public interface EventService {
    List<EventEntity> findAllEvents();
    Optional<EventEntity> findById(Long id);
    EventEntity saveEvent(EventEntity eventEntity);
    EventEntity updateEvent(EventEntity eventEntity);
    void deleteEvent(Long id);
}
