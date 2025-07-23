package Day7;

public class Airplane {

    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;
    static int numberAirplanes;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
        numberAirplanes++;
    }

    public void setProducer(String producer) { this.producer = producer; }
    public void setYear(int year) { this.year = year; }
    public void setLength(int length) { this.length = length; }
    public void setWeight(int weight) { this.weight = weight; }

    public int getLength() { return length; }
    public double getFuel() { return fuel; }

    public void info() {
        System.out.println("Изготовитель: " + producer +
                        ", год выпуска: " + year +
                        ", длина: " + length +
                        ", вес: " + weight +
                        ", количество топлива в баке: " + fuel);
    }
    public int fillUp(int inputFuel) {
        return fuel += inputFuel;
    }

    public static int compareAirplanes (Airplane airplane1, Airplane airplane2) {
        return Math.abs(airplane1.length - airplane2.length);
    }

    public int compareTo (Airplane airplane1) {
        return Math.abs(airplane1.length - this.length);
    }

    public static void compareThree (Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("Первый самолет длиннее");
        } else if (airplane1.getLength() < airplane2.getLength()) {
            System.out.println("Второй самолет длиннее");
        } else {
            System.out.println("Длина самолетов равная");
        }
     }
}
