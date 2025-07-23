package Day7;

import java.util.Random;

public class Player {
    private int stamina;

    public final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player() {
        Random random = new Random();

        if (countPlayers < 6) {
            countPlayers++;
            this.stamina = random.nextInt(11)+90;
        } else {
            System.out.println("Играют только 6 человек" );
            this.stamina = MIN_STAMINA;
        }
    }

    public int getStamina() { return stamina; }

    public static void info () {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. Количество свободных мест - " + (6 - countPlayers));
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

    public void run () {
        if (stamina == MIN_STAMINA)
            return;

        stamina--;
        if (stamina == MIN_STAMINA)
            countPlayers--;
    }
}
