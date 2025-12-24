@Service
public class MatchmakingServiceImpl implements MatchmakingService {

    private final MatchRecordRepository repository;

    public MatchmakingServiceImpl(MatchRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public MatchRecord generateMatch(Long userId) {
        throw new RuntimeException("No match found");
    }

    @Override
    public MatchRecord getMatchById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("No match found"));
    }

    @Override
    public List<MatchRecord> getMatchesForUser(Long userId) {
        return repository.findAll();
    }

    @Override
    public MatchRecord updateMatchStatus(Long id, String status) {
        MatchRecord record = getMatchById(id);
        record.setStatus(status);
        return repository.save(record);
    }
}
