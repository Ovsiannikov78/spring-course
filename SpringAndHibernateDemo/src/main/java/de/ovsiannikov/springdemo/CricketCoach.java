package de.ovsiannikov.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach() {
    }

    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Practice fast bowling for 15 min";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
