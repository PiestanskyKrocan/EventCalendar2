package sdj.project.eventcalendar.service.impl;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import sdj.project.eventcalendar.Entity.EventEntity;
import sdj.project.eventcalendar.respiratory.EventRespiratory;
import sdj.project.eventcalendar.service.EventService;

import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements EventService {

    private final EventRespiratory eventRespiratory;

    public EventServiceImpl(EventRespiratory eventRespiratory) {
        this.eventRespiratory = eventRespiratory;
    }


    @Override
    public List<EventEntity> findAllEvents() {
        return eventRespiratory.findAll();
    }

    @Override
    public Optional<EventEntity> findById(Long id) throws ChangeSetPersister.NotFoundException {
        Optional<EventEntity> eventOptional =  eventRespiratory.findById(id);
        if (!eventOptional.isPresent()){

            throw new ChangeSetPersister.NotFoundException();


        }
        return eventOptional;

    }

    @Override
    public EventEntity saveEvent(EventEntity eventEntity) {
        EventEntity eventToBeUpdated = eventRespiratory.save(eventEntity);
        return eventEntity;
    }

    @Override
    public EventEntity updateEvent(EventEntity eventEntity) {
        EventEntity eventToBeUpdated = eventRespiratory.save(eventEntity);
        return eventToBeUpdated;
    }

    @Override
    public void deleteEvent(Long id) {
        eventRespiratory.deleteById(id);
    }
}
