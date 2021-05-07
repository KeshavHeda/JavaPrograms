package GenericsIntroduction;

public class TeamInstance {

    public static void main(String[] args) {
        FootballPlayer fp = new FootballPlayer("FootballPlayer1");
        BaseballPlayer bp = new BaseballPlayer("BaseballPlayer2");
        SoccerPlayer sp = new SoccerPlayer("SoccerPlayer3");

        Team NormalTeam = new Team("NormalTeam");
        NormalTeam.addPlayer(fp);
        NormalTeam.addPlayer(bp);
        NormalTeam.addPlayer(sp);

        System.out.println(NormalTeam.numPlayers());

        System.out.println("***********************************");

//        Team<FootballPlayer> footballTeam = new Team<FootballPlayer>("Football-Team");
//        footballTeam.addPlayer(fp);
//
//        Team<BaseballPlayer> baseballTeam = new Team<BaseballPlayer>("Baseball-Team");
//        baseballTeam.addPlayer(bp);
//
//        Team<SoccerPlayer> soccerTeam = new Team<SoccerPlayer>("Soccer-Team");
//        soccerTeam.addPlayer(sp);

//        Team<String> WrongTeam = new Team<String>("Wrong-Team");
//        WrongTeam.addPlayer("Someone");


        System.out.println("***********************************");

        Team<BaseballPlayer> chicagoClubs = new Team<BaseballPlayer>("Chicago-Clubs");
        BaseballPlayer johnson = new BaseballPlayer("Michael Johnson");
        chicagoClubs.addPlayer(johnson);

        Team<FootballPlayer> adelaideCrows = new Team<FootballPlayer>("Adelaide-Crows");
        FootballPlayer pat = new FootballPlayer("Samuel pat");
        adelaideCrows.addPlayer(pat);

        Team<FootballPlayer> melbourne = new Team<FootballPlayer>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon Banks");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<FootballPlayer>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<FootballPlayer>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(melbourne, 3, 8);

        adelaideCrows.matchResult(fremantle, 2 , 1);
//        adelaideCrows.matchResult(chicagoClubs, 2 , 1);

        System.out.println("************* Rankings **********************");
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());

        System.out.println("**************** Team Compare *******************");

        System.out.println(hawthorn.compareTo(fremantle));
        System.out.println(hawthorn.compareTo(melbourne));
        System.out.println(fremantle.compareTo(hawthorn));

    }
}
