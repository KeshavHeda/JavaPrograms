package Encapsulation;

public class Player {

    public String name;
    public String weapon;
    public int health;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
            // reduce number of lives remaining for the player
        }
    }

    public int healthRemaining() {
        return health;
    }
}
