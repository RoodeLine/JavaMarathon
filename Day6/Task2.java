package Day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane737 = new Airplane("Boing", 2020,45, 41200);
        airplane737.setYear(2019);
        airplane737.setLength(40);
        airplane737.fillUp(10000);
        airplane737.fillUp(12000);
        airplane737.info();
    }
}
