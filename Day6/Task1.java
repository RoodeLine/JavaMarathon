package Day6;

public class Task1 {
    public static void main(String[] args) {

            Car car1 = new Car();
            car1.setYear(2020);
            car1.setColor("red");
            car1.setModel("Lada");

            Motorbike motorbike1 = new Motorbike(2021, "black", "Bmw");

            car1.info();
            motorbike1.info();

            System.out.println("Автомобилю " + car1.yearDifference(2022) + " г.");
            System.out.println("Мотоциклу " + motorbike1.yearDifference(2022) + " г.");
    }
}
