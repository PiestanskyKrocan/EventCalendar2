package sdj.project.eventcalendar.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "events")
public class EventEntity {

    @Id
    @Column(name = "event_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "bodytext")
    private String bodytext;

    @Column(name = "startTime")
    private Timestamp startTime;

    @Column(name = "endTime")
    private Timestamp endTime;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToMany(mappedBy = "joinedEvents", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Set<UserEntity> joinedUsers = new HashSet<>();


    @Column(name = "address")
    private String address;


    public EventEntity() {
    }

    public EventEntity(Long id, String name, String bodytext, Timestamp startTime, Timestamp endTime, String address, UserEntity user) {
        this.id = id;
        this.name = name;
        this.bodytext = bodytext;
        this.startTime = startTime;
        this.endTime = endTime;
        this.user = user;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBodytext() {
        return bodytext;
    }

    public void setBodytext(String bodytext) {
        this.bodytext = bodytext;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<UserEntity> getJoined() {
        return joinedUsers;
    }

    public void setJoined(Set<UserEntity> joined) {
        this.joinedUsers = joinedUsers;
    }

    public void addUser(UserEntity user) {
        joinedUsers.add(user);
    }

    public void removeUser(UserEntity user) {
        joinedUsers.remove(user);

    }
}


