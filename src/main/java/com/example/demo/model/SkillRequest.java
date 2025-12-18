import jakarta.persistence.*;

@Entity
public class SkillRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private UserProfile user;

    @ManyToOne
    private Skill skill;

    private String urgencyLevel;
    private Boolean active;

    public SkillRequest() {
        this.active = true;
    }

    public SkillRequest(UserProfile user, Skill skill, String urgencyLevel) {
        this.user = user;
        this.skill = skill;
        this.urgencyLevel = urgencyLevel;
        this.active = true;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public UserProfile getUser() { return user; }
    public void setUser(UserProfile user) { this.user = user; }

    public Skill getSkill() { return skill; }
    public void setSkill(Skill skill) { this.skill = skill; }

    public String getUrgencyLevel() { return urgencyLevel; }
    public void setUrgencyLevel(String urgencyLevel) { this.urgencyLevel = urgencyLevel; }

    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
}
