@Entity
public class SkillOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String experienceLevel;

    @ManyToOne
    private Skill skill;

    @ManyToOne
    private UserProfile user;

    // getters & setters
    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void setUser(UserProfile user) {
        this.user = user;
    }

    public UserProfile getUser() {
        return user;
    }
}
