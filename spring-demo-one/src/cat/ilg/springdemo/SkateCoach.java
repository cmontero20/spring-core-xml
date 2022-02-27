package cat.ilg.springdemo;

public class SkateCoach implements Coach {

    private GameStatsService gameStatsService;

    public SkateCoach(GameStatsService gameStatsService){
        this.gameStatsService = gameStatsService;
    }

    @Override
    public String getDailyPractice() {
        return "Fes 10 voltes a la pista i 5 salts.";
    }

    @Override
    public String getLastGameStats() {
        return gameStatsService.getLastGameStats();
    }

}
