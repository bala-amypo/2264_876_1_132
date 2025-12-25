@Entity
public class SkillOffer {

    @Id
    @GeneratedValue
    private Long id;

    private String experienceLevel;

    @ManyToOne
    private UserProfile user;

    @ManyToOne
    private Skill skill;

    public void setExperienceLevel(String e) { this.experienceLevel = e; }
    public void setUser(UserProfile u) { this.user = u; }
    public void setSkill(Skill s) { this.skill = s; }

    public UserProfile getUser() { return user; }
    public Skill getSkill() { return skill; }
}
