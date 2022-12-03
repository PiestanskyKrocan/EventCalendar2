package sdj.project.eventcalendar.service;

import sdj.project.eventcalendar.Entity.EventEntity;
import sdj.project.eventcalendar.Entity.UserEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface UserService {

    ArrayList<EventEntity> findAllJoinedEvents(Long id);

    ArrayList<EventEntity> findAllCreatedEvents(Long id);

    ArrayList<UserEntity> findAllUsers();

    Optional<UserEntity> findById(Long id);
    UserEntity saveUser(UserEntity userEntity);
    UserEntity updateUser(UserEntity userEntity);
    void deleteUser(Long id);
}