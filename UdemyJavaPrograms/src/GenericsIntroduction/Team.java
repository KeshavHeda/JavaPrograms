package GenericsIntroduction;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    private ArrayList<T> members = new ArrayList<T>();

    public Team(String teamName) {
        this.name = teamName;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
//            System.out.println(((Player)player).getPlayerName() + " is already on this team.");
            System.out.println(player.getPlayerName() + " is already on this team.");
            return false;
        } else {
            members.add(player);
//            System.out.println(((Player)player).getPlayerName() + " picked for team " + this.getTeamName());
            System.out.println(player.getPlayerName() + " picked for team " + this.getName());
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String matchMessage = "";
        if (ourScore > theirScore) {
            won++;
            matchMessage = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            matchMessage = " drew with ";
        } else {
            lost++;
            matchMessage = " lost to ";
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getName() + matchMessage + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }

}
