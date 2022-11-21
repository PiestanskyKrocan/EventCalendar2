package sdj.project.eventcalendar.service.impl;

import org.springframework.stereotype.Service;
import sdj.project.eventcalendar.Entity.UserEntity;
import sdj.project.eventcalendar.respiratory.UserRespiratory;
import sdj.project.eventcalendar.service.UserService;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRespiratory userRespiratory;

    public UserServiceImpl(UserRespiratory userRespiratory) {
        this.userRespiratory = userRespiratory;
    }

    @Override
    public List<UserEntity> findAllUsers() {
        return userRespiratory.findAll();
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