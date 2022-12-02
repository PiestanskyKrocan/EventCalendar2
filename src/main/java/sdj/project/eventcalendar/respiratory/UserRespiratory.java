package sdj.project.eventcalendar.respiratory;

import org.springframework.data.jpa.repository.JpaRepository;
import sdj.project.eventcalendar.Entity.EventEntity;
import sdj.project.eventcalendar.Entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRespiratory extends JpaRepository<UserEntity, Long> {

    ArrayList<EventEntity> findAllCreatedEvents(Long user_id);

    ArrayList<EventEntity> findAllJoinedEvents(Long user_id);

    ArrayList<UserEntity> findAllUsers();
}
