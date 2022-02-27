package cat.ilg.springdemo;

public class BasketballGameStatsService implements GameStatsService{

    @Override
    public String getLastGameStats() {
        return "19 de 23 tirs lliures, 29 rebots, 25 faltes personals.";
    }

}
