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


}

