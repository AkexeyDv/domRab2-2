import java.util.Objects;

public class Slytherin extends Student {
    private final int cunning;//хитрость
    private final int determination;//решительность
    private final int ambition;//амбициозность
    private final int resourcefulness;//находчивость
    private final int thirstForPower;//жажда власти

    public Slytherin(int magic, int trasgessionOfDistance, String name, String surname,
                     int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(magic, trasgessionOfDistance, name, surname);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void characteristic() {
        System.out.println(getName() + " " + getSurname());
        System.out.println("Имеет следующие навыки:");
        System.out.println("Магия: " + getMagic() + ", трансгрессия: " + getTrasgessionOfDistance());
        System.out.println("Обучается на факультете Слизерен и обладает следующими характеристиками: ");
        System.out.println("Хитрость: " + getCunning() + ", решительность: " + getDetermination() +
                ", амбициозность: " + getAmbition() + ", находчивость: " + getResourcefulness() + ", жажда власти: " + getThirstForPower());
    }

    public int sumProperty() {
        return getCunning() + getDetermination() + getAmbition() + getResourcefulness() + getThirstForPower();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && thirstForPower == slytherin.thirstForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cunning, determination, ambition, resourcefulness, thirstForPower);
    }
}
