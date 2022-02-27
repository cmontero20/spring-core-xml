package cat.ilg.springdemo;

public class SkateGameStatsService implements GameStatsService{

    @Override
    public String getLastGameStats() {
        return "Penalitzacio per caiguda.";
    }

}
