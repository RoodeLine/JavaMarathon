package Day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Иванов П.И.", "История КПСС");
        Student student1 = new Student("Попов Е.К.");

        teacher1.evaluate(student1);
    }
}
