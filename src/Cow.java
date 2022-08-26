public class Cow extends Animal{
    public Cow(double weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }
    @Override
    public String toString() {
        return "Cow{" +
                "weight=" + getWeight() +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", nickName='" + getNickName() + '\'' +
                "}\n";
    }
}
