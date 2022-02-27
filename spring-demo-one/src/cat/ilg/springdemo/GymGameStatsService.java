package cat.ilg.springdemo;

public class GymGameStatsService implements GameStatsService{

    @Override
    public String getLastGameStats() {
        return "Ha quedat en segona posicio.";
    }

}
