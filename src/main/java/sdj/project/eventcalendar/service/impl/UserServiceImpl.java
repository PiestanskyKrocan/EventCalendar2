package sdj.project.eventcalendar.service.impl;

import org.springframework.stereotype.Service;
import sdj.project.eventcalendar.Entity.EventEntity;
import sdj.project.eventcalendar.Entity.UserEntity;
import sdj.project.eventcalendar.respiratory.EventRespiratory;
import sdj.project.eventcalendar.respiratory.UserRespiratory;
import sdj.project.eventcalendar.service.UserService;

import javax.persistence.SecondaryTable;
import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    private UserRespiratory userRespiratory;

    private EventRespiratory eventRespiratory;

    public UserServiceImpl(UserRespiratory userRespiratory,EventRespiratory eventRespiratory) {
        this.userRespiratory = userRespiratory;
        this.eventRespiratory = eventRespiratory;
    }

    @Override
    public List<EventEntity> findAllJoinedEvents(Long id) {
        ArrayList<EventEntity> evententities = (ArrayList<EventEntity>) eventRespiratory.findAll();
        ArrayList<EventEntity> returnlist = new ArrayList<>();
        ArrayList<UserEntity> users;

        for (EventEntity entity : evententities)
        {
            users = new ArrayList<UserEntity>(entity.getJoined());
            for (UserEntity user : users)
            {
                if(user.getId()==id){
                    returnlist.add(entity);
                    break;
                }
            }
        }
        return returnlist;
    }

    @Override
    public ArrayList<EventEntity> findAllCreatedEvents(Long id) {
        ArrayList<EventEntity> evententities = (ArrayList<EventEntity>) eventRespiratory.findAll();
        ArrayList<EventEntity> returnlist = new ArrayList<>();
        for (EventEntity entity : evententities)
        {
            if (entity.getUser().getId()==id){
                returnlist.add(entity);
                break;
            }

            }
        return returnlist;
        }


    @Override
    public ArrayList<UserEntity> findAllUsers() {
        List<UserEntity> list;
        list = userRespiratory.findAll();
        ArrayList<UserEntity> arrayList = new ArrayList<>();
        arrayList.addAll(list);
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
