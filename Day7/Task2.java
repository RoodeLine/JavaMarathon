package Day7;

public class Task2 {
    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player.info();

        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();
        Player.info();

        Player player8 = new Player();
        System.out.println(player8.getStamina());
        Player.info();

        for (int i = 0; i < Player.MAX_STAMINA ;i++ ) {
            player1.run();
            System.out.println(player1.getStamina());
        }

        Player.info();

        Player player9 = new Player();
        Player.info();

    }
}
