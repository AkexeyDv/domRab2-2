public class Slytherin extends Hogwarts{
    private int cunning;//хитрость
    private int determination;//решительность
    private  int ambition;//амбициозность
    private  int resourcefulness;//находчивость
    private  int thirstForPower;//жажда власти

    public Slytherin(int magic, int trasgessionOfDistance, int cunning, int determination,
                     int ambition, int resourcefulness, int thirstForPower) {
        super(magic, trasgessionOfDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }
}
