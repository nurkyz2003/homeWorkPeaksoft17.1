import java.util.Arrays;

public class Farm {
    private String adress,ownerName;
    Cow[] cows;
    Sheep[] sheep;
    Horse[] horses;

    public Farm(String adress, String ownerName, Cow[] cows, Sheep[] sheep, Horse[] horses) {
        this.adress = adress;
        this.ownerName = ownerName;
        this.cows = cows;
        this.sheep = sheep;
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "adress='" + adress + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", \ncows=" + Arrays.toString(cows) +
                ", \nsheep=" + Arrays.toString(sheep) +
                ", \nhorses=" + Arrays.toString(horses) +
                '}';
    }
}
