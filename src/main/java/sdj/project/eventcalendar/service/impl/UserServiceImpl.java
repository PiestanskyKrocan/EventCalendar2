package sdj.project.eventcalendar.service.impl;

import org.springframework.stereotype.Service;
import sdj.project.eventcalendar.Entity.EventEntity;
import sdj.project.eventcalendar.Entity.UserEntity;
import sdj.project.eventcalendar.respiratory.EventRespiratory;
import sdj.project.eventcalendar.respiratory.UserRespiratory;
import sdj.project.eventcalendar.service.UserService;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRespiratory userRespiratory;

    public UserServiceImpl(UserRespiratory userRespiratory) {
        this.userRespiratory = userRespiratory;
    }

    @Override
    public ArrayList<EventEntity> findAllJoinedEvents(Long id) {
        Optional<UserEntity> user = userRespiratory.findById(id);
        ArrayList<EventEntity> arrayList = new ArrayList<EventEntity>(user.get().getJoinedEvents());
        return arrayList;

    }

    @Override
    public ArrayList<EventEntity> findAllCreatedEvents(Long id) {
            Optional<UserEntity> user = userRespiratory.findById(id);
            ArrayList<EventEntity> arrayList = new ArrayList<EventEntity>(user.get().getCreatedevents());
            return arrayList;
        }


    @Override
    public ArrayList<UserEntity> findAllUsers() {
        ArrayList<UserEntity> arrayList = new ArrayList<UserEntity>();
        arrayList.addAll(userRespiratory.findAll());
        return arrayList;
    }

    @Override
    public Optional<UserEntity> findById(Long id) {
        return userRespiratory.findById(id);
    }

    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        return userRespiratory.save(userEntity);
    }

    @Override
    public UserEntity updateUser(UserEntity userEntity) {
        return userRespiratory.save(userEntity);
    }

    @Override
    public void deleteUser(Long id) {
        userRespiratory.deleteById(id);
    }
}
