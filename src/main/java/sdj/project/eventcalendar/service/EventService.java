package sdj.project.eventcalendar.service;

import org.springframework.data.crossstore.ChangeSetPersister;
import sdj.project.eventcalendar.Entity.EventEntity;

import java.util.List;
import java.util.Optional;

public interface EventService {
    List<EventEntity> findAllEvents();
    Optional<EventEntity> findById(Long id) throws ChangeSetPersister.NotFoundException;
    EventEntity saveEvent(EventEntity eventEntity);
    EventEntity updateEvent(EventEntity eventEntity);
    void deleteEvent(Long id);
}
