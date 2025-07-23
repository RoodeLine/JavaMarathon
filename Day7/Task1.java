package Day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane airplane737 = new Airplane("Boing", 2020,45, 41200);
        airplane737.fillUp(10000);
        airplane737.info();

        Airplane airplane747 = new Airplane("Boing", 2018,47, 44600);
        airplane747.fillUp(15000);
        airplane747.info();

        System.out.println("Самолетов: " + Airplane.numberAirplanes);
        Airplane.compareThree(airplane737, airplane747);
        System.out.println("Разница в длине самолетов: " + Airplane.compareAirplanes(airplane737, airplane747));
        System.out.println("Разница в длине самолетов: " + airplane737.compareTo(airplane747));

        }
}
