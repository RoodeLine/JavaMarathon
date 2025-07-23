package Day8;

import java.time.Duration;
import java.time.Instant;

public class Task1 {
    public static void main(String[] args) {

        Instant start1 = Instant.now();
        String numbers = "";

        for (int i=0; i <=20000; i++)
            numbers += i + " ";

        System.out.println(numbers);

        Instant finish1 = Instant.now();
        long elapsed1 = Duration.between(start1, finish1).toMillis();
        System.out.println();
        System.out.println("Прошло времени, мс: " + elapsed1);

        Instant start2 = Instant.now();

        StringBuilder sb = new StringBuilder();
        for (int i=0; i <=20000; i++)
            sb.append(i).append(" ");

        System.out.println(sb);

        Instant finish2 = Instant.now();
        long elapsed2 = Duration.between(start2, finish2).toMillis();
        System.out.println();
        System.out.println("Прошло времени, мс: " + elapsed2);
    }
}
