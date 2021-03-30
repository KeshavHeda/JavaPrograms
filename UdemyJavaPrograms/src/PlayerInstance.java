public class PlayerInstance {

    public static void main(String[] args) {
        Player player = new Player();

        player.name = "Myself"; // variable name change affects here
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health : " + player.healthRemaining());

        damage = 11;
        player.health = 200; // change health
        player.loseHealth(damage);
        System.out.println("Remaining health : " + player.healthRemaining());

    }



}
