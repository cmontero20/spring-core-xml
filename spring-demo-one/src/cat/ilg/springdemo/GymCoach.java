package cat.ilg.springdemo;

public class GymCoach implements Coach {

    private GameStatsService gameStatsService;

    public GymCoach(GameStatsService gameStatsService){
        this.gameStatsService = gameStatsService;
    }

    @Override
    public String getDailyPractice() {
        return "Fes 10 volteretes i 500 abdominals.";
    }

    @Override
    public String getLastGameStats() {
        return gameStatsService.getLastGameStats();
    }

}
