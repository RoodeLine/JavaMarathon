package Day6;

public class Airplane {

    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setProducer(String producer) { this.producer = producer; }
    public void setYear(int year) { this.year = year; }
    public void setLength(int length) { this.length = length; }
    public void setWeight(int weight) { this.weight = weight; }

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
}
