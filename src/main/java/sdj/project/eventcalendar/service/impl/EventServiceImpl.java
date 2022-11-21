package sdj.project.eventcalendar.service.impl;

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
    public Optional<EventEntity> findById(Long id) {
        return eventRespiratory.findById(id);
    }

    @Override
    public EventEntity saveEvent(EventEntity eventEntity) {
    return eventRespiratory.save(eventEntity);
    }

    @Override
    public EventEntity updateEvent(EventEntity eventEntity) {
        return eventRespiratory.save(eventEntity);
    }

    @Override
    public void deleteEvent(Long id) {
        eventRespiratory.deleteById(id);
    }
}
