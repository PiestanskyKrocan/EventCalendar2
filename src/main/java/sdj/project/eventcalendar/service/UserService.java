package sdj.project.eventcalendar.service;

import sdj.project.eventcalendar.Entity.EventEntity;
import sdj.project.eventcalendar.Entity.UserEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface UserService {

    List<EventEntity> findAllJoinedEvents(Long id);

    ArrayList<EventEntity> findAllCreatedEvents(Long id);

    List<UserEntity> findAllUsers();

    Optional<UserEntity> findById(Long id);
    UserEntity saveUser(UserEntity userEntity);
    UserEntity updateUser(UserEntity userEntity);
    void deleteUser(Long id);

    void addEvent(Long userId, Long eventId);

    void removeEvent(Long userId, Long eventId);

}