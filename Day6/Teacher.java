package Day6;

import java.util.Random;

public class Teacher {

    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    public void setName(String name) { this.name = name; }
    public void setSubject(String subject) { this.subject = subject; }

    public void evaluate(Student student) {
        String grade = "";
        Random random = new Random();
        int gradeRan = random.nextInt(4) + 2;

//        if (gradeRan == 2) {
//            grade = "неудовлетворительно";
//        } else if (gradeRan == 3) {
//            grade = "удовлетворительно";
//        } else if (gradeRan == 4) {
//            grade = "хорошо";
//        } else {
//            grade = "отлично";
//        }

        switch (gradeRan){
            case 2:
                grade = "неудовлетворительно";
                break;
            case 3:
                grade = "удовлетворительно";
                break;
            case 4:
                grade = "хорошо";
                break;
            case 5:
            grade = "отлично";
        }
        System.out.println("Преподаватель " + this.name + " оценил студента " + student.getName() +
                " по предмету " + this.subject + " на оценку " + grade);
    }
}

