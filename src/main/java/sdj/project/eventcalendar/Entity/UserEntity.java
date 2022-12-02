package sdj.project.eventcalendar.Entity;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "gender")
    private String gender;

    @Column(name = "date_of_birth")
    private Timestamp dateOfBirth;

    @Column(name = "address")
    private String address;

    @OneToMany
    @JoinColumn(name = "user_id")
    private ArrayList<EventEntity> createdevents;

    @ManyToMany
    @JoinTable(
            name = "events_joined",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "event_id"))
    protected ArrayList<EventEntity> joinedEvents;

    public UserEntity(){}

    public UserEntity(Long id, String name,String password, String gender, Timestamp dateOfBirth, String address) {
        this.id = id;
        this.name = name;
        this.password=password;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Timestamp getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Timestamp dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<EventEntity> getCreatedevents() {
        return createdevents;
    }

    public void setCreatedevents(ArrayList<EventEntity> createdevents) {
        this.createdevents = createdevents;
    }

    public ArrayList<EventEntity> getJoinedEvents() {
        return joinedEvents;
    }

    public void setJoinedEvents(ArrayList<EventEntity> joinedEvents) {
        this.joinedEvents = joinedEvents;
    }
}
