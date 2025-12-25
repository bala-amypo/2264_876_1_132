import java.sql.Timestamp;

public class UserProfile {

    private Long id;
    private String username;
    private String email;
    private String bio;
    private boolean active;
    private Timestamp createdAt;   // ✅ ADD
    private Timestamp updatedAt;   // ✅ ADD

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
