package Encapsulation;

public class EnhancedPlayer {

    private String name;
    private String weapon;
    private int health = 100;

    public EnhancedPlayer(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if(health > 0 && health <= 100) {
            this.health = health;
        }
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Encapsulation.Player knocked out");
            // reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return health;
    }

}
