@Entity
public class UserProfile {

    @Id
    @GeneratedValue
    private Long id;

    private boolean active = true;

    public Long getId() { return id; }
    public boolean isActive() { return active; }

    public void setId(Long id) { this.id = id; }
    public void setActive(boolean active) { this.active = active; }
}
