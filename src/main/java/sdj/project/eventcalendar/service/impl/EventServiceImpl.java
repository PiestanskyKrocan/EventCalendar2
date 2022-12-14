package sdj.project.eventcalendar.service.impl;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sdj.project.eventcalendar.Entity.EventEntity;
import sdj.project.eventcalendar.Entity.UserEntity;
import sdj.project.eventcalendar.respiratory.EventRespiratory;
import sdj.project.eventcalendar.respiratory.UserRespiratory;
import sdj.project.eventcalendar.service.EventService;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class EventServiceImpl implements EventService {

    private EventRespiratory eventRespiratory;
    private UserRespiratory userRespiratory;



    public EventServiceImpl(EventRespiratory eventRespiratory,UserRespiratory userRespiratory) {
        this.eventRespiratory = eventRespiratory;
        this.userRespiratory = userRespiratory;

    }

    @Override
    public List<UserEntity> findUsersByEventId(Long id) {
        ArrayList<UserEntity> userentities = (ArrayList<UserEntity>) userRespiratory.findAll();
        ArrayList<UserEntity> returnlist = new ArrayList<>();
        ArrayList<EventEntity> events;

        for (UserEntity entity : userentities)
        {
            events = new ArrayList<EventEntity>(entity.getJoinedEvents());
            for (EventEntity event : events)
            {
                if(event.getId()==id){
                    returnlist.add(entity);
                    break;
                }
            }
        }
        return returnlist;
    }

    @Override
    public ArrayList<EventEntity> findAllEvents() {
        List<EventEntity> list;
        list = eventRespiratory.findAll();
        return new ArrayList<>(list);

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
        return eventRespiratory.save(eventEntity);
    }

    @Override
    public void deleteEvent(Long id) {
        eventRespiratory.deleteById(id);
    }

    @Override
    public void addUser(Long userId, Long eventId) {
        Optional <EventEntity> event = eventRespiratory.findById(eventId);
        Optional<UserEntity> optionaluser = userRespiratory.findById(userId);
        Set<UserEntity> usersInEvent = (event.get().getJoined());
        UserEntity user = new UserEntity(optionaluser.get().getId(), optionaluser.get().getName(),optionaluser.get().getPassword(),optionaluser.get().getGender(),optionaluser.get().getDateOfBirth(), optionaluser.get().getAddress());

        usersInEvent.add(user);

    }

    @Override
    public void removeUser(Long userId, Long eventId) {
        Optional <EventEntity> event = eventRespiratory.findById(eventId);
        Optional<UserEntity> optionaluser = userRespiratory.findById(userId);
        Set<UserEntity> usersInEvent = (event.get().getJoined());
        UserEntity user = new UserEntity(optionaluser.get().getId(), optionaluser.get().getName(),optionaluser.get().getPassword(),optionaluser.get().getGender(),optionaluser.get().getDateOfBirth(), optionaluser.get().getAddress());

        usersInEvent.remove(user);

    }

}


