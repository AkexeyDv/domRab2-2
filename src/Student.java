import java.util.Arrays;
import java.util.Objects;

public abstract class Student extends Hogwarts {

    private final String name;
    private final String surname;


    public Student(int magic, int trasgessionOfDistance, String name, String surname) {
        super(magic, trasgessionOfDistance);
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public void characteristic() {
    }

    public int sumProperty() {
        return 0;
    }

    public static void comparisonFacultet(Student student1, Student student2) {
        String classFacultet = null;
        int sumProperty1=0;
        int sumProperty2=0;
        sumProperty1=student1.sumProperty();
        sumProperty2=student2.sumProperty();
        if (student1.getClass().equals(Ravenclaw.class)) {
            classFacultet = "Коктевранец";
        }
        if (student1.getClass().equals(Slytherin.class)) {
            classFacultet = "Слизеринец";
        }
        if (student1.getClass().equals(Hufflepuff.class)) {
            classFacultet = "Пуффендуец";
        }
        if (student1.getClass().equals(Gryffindor.class)) {
            classFacultet = "Гриффендорец";
        }

        if (student1.getClass() == student2.getClass()) {
            if (sumProperty1 > sumProperty2) {
                System.out.println(student1.getName() + " лучший " + classFacultet+", чем "+student2.getName());

            } else if (sumProperty1 < sumProperty2) {
                System.out.println(student2.getName() + " лучший " + classFacultet+", чем "+student1.getName());
            } else {
                System.out.println(student1.getName() + " и " + student2.getName() + " одинаковы");
            }
        }else {System.out.println("Вы сравниваете студентов разных факультетов");}


    }
}

