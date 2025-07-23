package Day5;

public class Task1 {
    public static void main(String[] args) {

    Car car1 = new Car();
    car1.setYear(2020);
    car1.setColor("red");
    car1.setModel("Lada");

        System.out.println("Наш автомобиль:" + "\n" +
                "год выпуска: " + car1.getYear() + "\n" +
                "цвет: " + car1.getColor() + "\n" +
                "модель: " + car1.getModel());

    }
}
