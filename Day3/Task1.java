package Day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        for ( ; ; ) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название города с большой буквы");
            String city = scanner.nextLine();
            String stop = "Stop";

            if (city.equals(stop)) break;

            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }

    }
}
