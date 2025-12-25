@RestController
@RequestMapping("/offers")
public class SkillOfferController {

    @PostMapping
    public SkillOffer create(@RequestBody SkillOffer o) {
        return o;
    }

    @GetMapping("/{id}")
    public SkillOffer get(@PathVariable Long id) {
        return new SkillOffer();
    }
}
