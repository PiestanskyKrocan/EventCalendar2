package sdj.project.eventcalendar.respiratory;

import org.springframework.data.jpa.repository.JpaRepository;
import sdj.project.eventcalendar.Entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespiratory extends JpaRepository<UserEntity, Long> {
}
