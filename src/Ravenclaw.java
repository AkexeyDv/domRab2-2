import java.util.Objects;

public class Ravenclaw extends Student {
    private final int Intelligence;//ум
    private final int wisdom; //мудрость
    private final int wit;//остроумие
    private final int creativity;//творчество

    public Ravenclaw(int magic, int trasgessionOfDistance, String name, String surname,
                     int intelligence, int wisdom, int wit, int creativity) {
        super(magic, trasgessionOfDistance, name, surname);
        Intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void characteristic() {
        System.out.println(getName() + " " + getSurname());
        System.out.println("Имеет следующие навыки:");
        System.out.println("Магия: " + getMagic() + ", трансгрессия: " + getTrasgessionOfDistance());
        System.out.println("Обучается на факультете Коктевран и обладает следующими характеристиками: ");
        System.out.println("Ум: " + getIntelligence() + ", мудрость: " + getWisdom() +
                ", остроумие: " + getWit() + ", творчество: " + getCreativity());
    }

    public int sumProperty() {
        return getIntelligence() + getWisdom() + getWit() + getCreativity();
    }
}
