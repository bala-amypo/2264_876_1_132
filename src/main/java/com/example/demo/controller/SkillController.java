@RestController
@RequestMapping("/skills")
public class SkillController {

    private final SkillService service;

    public SkillController(SkillService service) {
        this.service = service;
    }

    @PostMapping
    public Skill create(@RequestBody Skill skill) {
        return service.create(skill);
    }

    @PutMapping("/{id}")
    public Skill update(@PathVariable Long id, @RequestBody Skill skill) {
        return service.update(id, skill);
    }

    @GetMapping
    public List<Skill> list() {
        return service.list();
    }
}
