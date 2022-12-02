package sdj.project.eventcalendar.service;

import org.springframework.data.crossstore.ChangeSetPersister;
import sdj.project.eventcalendar.Entity.EventEntity;
import sdj.project.eventcalendar.Entity.UserEntity;

import java.util.ArrayList;
import java.util.Optional;

public interface EventService {
    ArrayList<UserEntity> findUsersByEventId(Long id);
    ArrayList<EventEntity> findAllEvents();
    Optional<EventEntity> findById(Long id) throws ChangeSetPersister.NotFoundException;
    EventEntity saveEvent(EventEntity eventEntity);
    EventEntity updateEvent(EventEntity eventEntity);
    void deleteEvent(Long id);
}
