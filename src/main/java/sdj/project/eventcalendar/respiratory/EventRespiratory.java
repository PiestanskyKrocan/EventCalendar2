package sdj.project.eventcalendar.respiratory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sdj.project.eventcalendar.Entity.EventEntity;

@Repository
public interface EventRespiratory extends JpaRepository<EventEntity, Long> {
}
