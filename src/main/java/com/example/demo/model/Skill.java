@Entity
public class Skill {

    @Id
    @GeneratedValue
    private Long id;

    private String category;

    public Long getId() { return id; }
    public String getCategory() { return category; }

    public void setId(Long id) { this.id = id; }
    public void setCategory(String category) { this.category = category; }
}
