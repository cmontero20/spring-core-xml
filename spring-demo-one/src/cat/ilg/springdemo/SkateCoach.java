package cat.ilg.springdemo;

public class SkateCoach implements Coach {

    private GameStatsService gameStatsService;

    public SkateCoach(){
        System.out.println("Skate coach: Dins del constructor per defecte.");
    }

    public void setGameStatsService(GameStatsService gameStatsService){
        System.out.println("Skate coach: Dins del setter per defecte.");
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
