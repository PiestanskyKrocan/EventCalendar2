package sdj.project.eventcalendar.respiratory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import sdj.project.eventcalendar.Entity.EventEntity;
import sdj.project.eventcalendar.Entity.UserEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Repository
public interface EventRespiratory extends JpaRepository<EventEntity, Long> {


}
