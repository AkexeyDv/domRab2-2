public class Main {


    public static void main(String[] args) {
        Student[] students = {
                new Gryffindor(94, 99,
                        "Гарри", "Поттер", 92, 99, 100),
                new Gryffindor(62, 95,
                        "Рон", "Уизли", 87, 75, 100),
                new Gryffindor(100, 90,
                        "Гермиона", "Грейнжер", 85, 95, 90),
                new Ravenclaw(60, 82,
                        "Джоу", "Чанг", 88, 92, 65, 96),
                new Ravenclaw(64, 55,
                        "Падма", "Патил", 89, 90, 66, 93),
                new Ravenclaw(68, 54,
                        "Маркус", "Белби", 91, 90, 67, 94),
                new Hufflepuff(69, 82,
                        "Захария", "Смитт", 95, 87, 92),
                new Hufflepuff(91, 77,
                        "Седерик", "Деггори", 99, 100, 95),
                new Hufflepuff(92, 78,
                        "Джастин", "Финч-Флетчли", 90, 90, 98),
                new Slytherin(51, 22,
                        "Драко", "Малфой", 82, 45, 100, 99, 90),
                new Slytherin(65, 28,
                        "Грэхэм", "Монтегю", 80, 49, 80, 85, 88),
                new Slytherin(50, 40,
                        "Грегори", "Гойл", 81, 52, 53, 84, 81)};
        students[10].characteristic();
        students[0].characteristic();
        students[3].characteristic();
        students[7].characteristic();
        System.out.println(students[1].getClass());
        Student.comparisonFacultet(students[2], students[1]);
        Student.comparisonFacultet(students[4], students[5]);
        Student.comparisonFacultet(students[6], students[8]);
        Student.comparisonFacultet(students[9], students[10]);
        Student.comparation(students[0], students[6]);


        System.out.println();
    }


}




