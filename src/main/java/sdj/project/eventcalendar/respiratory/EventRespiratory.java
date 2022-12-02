package sdj.project.eventcalendar.respiratory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sdj.project.eventcalendar.Entity.EventEntity;
import sdj.project.eventcalendar.Entity.UserEntity;

import java.util.ArrayList;

@Repository
public interface EventRespiratory extends JpaRepository<EventEntity, Long> {

    ArrayList<UserEntity> findUsersByEventId(Long event_id);

    ArrayList<EventEntity> findAllEvents();
}
