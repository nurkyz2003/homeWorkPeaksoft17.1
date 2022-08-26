public class Sheep extends Animal{
    public Sheep(double weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }
    @Override
    public String toString() {
        return "Sheep{" +
                "weight=" + getWeight() +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", nickName='" + getNickName() + '\'' +
                "}\n";
    }
}
