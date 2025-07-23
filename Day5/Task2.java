package Day5;

public class Task2 {

    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike(2021, "black", "Bmw");
        System.out.println("Наш мотоцикл:" + "\n" +
                            "год выпуска: " + motorbike1.getYear() + "\n" +
                            "цвет " + motorbike1.getColor() + "\n" +
                            "модель " + motorbike1.getModel());

    }


}
