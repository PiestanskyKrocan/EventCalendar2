package sdj.project.eventcalendar.respiratory;

import org.springframework.data.jpa.repository.JpaRepository;
import sdj.project.eventcalendar.Entity.EventEntity;
import sdj.project.eventcalendar.Entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface UserRespiratory extends JpaRepository<UserEntity, Long> {


}
