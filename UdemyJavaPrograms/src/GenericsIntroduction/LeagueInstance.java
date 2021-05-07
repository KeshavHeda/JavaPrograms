package GenericsIntroduction;

public class LeagueInstance {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> footballLeague = new League<>("Australian Football League (AFL) ");

        Team<FootballPlayer> melbourne = new Team<FootballPlayer>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<FootballPlayer>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<FootballPlayer>("Fremantle");
        Team<FootballPlayer> adelaideCrows = new Team<FootballPlayer>("Adelaide-Crows");
        Team<BaseballPlayer> chicagoBulls = new Team<BaseballPlayer>("Chicago-Bulls");

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

//        footballLeague.addTeam(chicagoBulls);

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(fremantle, 2 , 1);

        System.out.println("***********************************");

        footballLeague.showLeagueTable(); // league status

    }
}
