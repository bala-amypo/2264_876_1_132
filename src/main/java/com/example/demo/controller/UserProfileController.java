@RestController
@RequestMapping("/users")
public class UserProfileController {

    private final UserProfileService service;

    public UserProfileController(UserProfileService service) {
        this.service = service;
    }

    @PostMapping
    public UserProfile create(@RequestBody UserProfile user) {
        return service.create(user);
    }

    @GetMapping("/{id}")
    public UserProfile get(@PathVariable Long id) {
        return service.get(id);
    }

    @PutMapping("/deactivate/{id}")
    public void deactivate(@PathVariable Long id) {
        service.deactivate(id);
    }

    @GetMapping
    public List<UserProfile> list() {
        return service.list();
    }
}
