import java.util.Objects;

public class Gryffindor extends Student {
    private final int nobility; //благородство
    private final int honor;//честь
    private final int bravery;//храбрость

    public Gryffindor(int magic, int trasgessionOfDistance, String name, String surname, int nobility, int honor, int bravery) {
        super(magic, trasgessionOfDistance, name, surname);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void characteristic() {
        System.out.println(getName() + " " + getSurname());
        System.out.println("Имеет следующие навыки:");
        System.out.println("Магия: " + getMagic() + ", трансгрессия: " + getTrasgessionOfDistance());
        System.out.println("Обучается на факультете Коктевран и обладает следующими характеристиками: ");
        System.out.println("Благородство: " + getNobility() + ", честь: " + getHonor() +
                ", храбрость: " + getBravery());
    }

    public int sumProperty() {
        return getNobility() + getHonor() + getBravery();
    }

}
