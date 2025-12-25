@Entity
public class SkillRequest {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private UserProfile user;

    @ManyToOne
    private Skill skill;

    public void setUser(UserProfile u) { this.user = u; }
    public void setSkill(Skill s) { this.skill = s; }

    public UserProfile getUser() { return user; }
    public Skill getSkill() { return skill; }
}
