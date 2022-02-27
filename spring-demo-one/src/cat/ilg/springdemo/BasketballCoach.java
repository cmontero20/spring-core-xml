package cat.ilg.springdemo;

public class BasketballCoach implements Coach{

    private String emailAddress;

    private String team;

    private GameStatsService gameStatsService;

    public BasketballCoach(GameStatsService gameStatsService){
        this.gameStatsService = gameStatsService;
    }

    // Getters
    public String getEmailAddress() {
        return emailAddress;
    }
    public String getTeam() {
        return team;
    }

    // Setters
    public void setEmailAddress(String emailAddress) {
        System.out.println("Basket coach: dins del setter de l'email.");
        this.emailAddress = emailAddress;
    }
    public void setTeam(String team) {
        System.out.println("Basket coach: dins del setter de team.");
        this.team = team;
    }

    @Override
    public String getDailyPractice() {
        return "Entrena defensa mitja hora i 100 tirs lliures.";
    }

    @Override
    public String getLastGameStats() {
        return gameStatsService.getLastGameStats();
    }

    // add init method
    public void doMyStartupStuff() {
        System.out.println("Basket coach: dins del init method");
        System.out.println("Obrint conexions a BD ...");
    }

    // add destroy method
    public void doMyCleanupStuff() {
        System.out.println("Basket coach: dins del destroy method");
        System.out.println("Tancant conexions a BD ...");
    }
}
