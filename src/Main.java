public class Main {
    public static void main(String[] args) {
        Sheep sheep1 = new Sheep(9.2,4,"Male","Sheep 1");
        Sheep sheep2 = new Sheep(7.6,5,"Male","Sheep 2");
        Sheep sheep3 = new Sheep(8.9,4,"Female","Sheep 3");
        Cow cow1 = new Cow(56.7,7,"Female","Cow 1");
        Cow cow2 = new Cow(68.1,5,"Male","Cow 2");
        Cow cow3 = new Cow(65.3,6,"Female","Cow 3");
        Cow cow4 = new Cow(78.9,8,"Male","Cow 4");
        Cow cow5 = new Cow(61.7,5,"Female","Cow 5");
        Horse horse1 = new Horse(100.2,9,"Male","Horse 1","Black");
        Horse horse2 = new Horse(120.5,8,"Female","Horse 2","Black");

        Sheep[] sheep11 = {sheep1,sheep2,sheep3};
        Cow[] cows1 = {cow1,cow2,cow3,cow4,cow5};
        Horse[] horses1 = {horse1,horse2};

        Farm farm1 = new Farm("Djailoo Suusamyr","Kurbanbek Alimov",cows1,sheep11,horses1);
        System.out.println("----------------------------------------INFORMATION ABOUT FARM.1------------------------------------");
        System.out.println(farm1);

        Sheep sheep4 = new Sheep(9.4,3,"Female","Sheep 4");
        Cow cow6 = new Cow(87.1,8,"Male","Cow 6");
        Horse horse3 = new Horse(156.4,9,"Female","Horse 3","Brown");

        Sheep[] sheep12 = {sheep4};
        Cow[] cows2 = {cow6};
        Horse[] horses2 = {horse3};

        Farm farm2 = new Farm("Djailoo Donmon","Islam Aliev",cows2,sheep12,horses2);
        System.out.println("----------------------------------------INFORMATION ABOUT FARM.2------------------------------------");
        System.out.println(farm2);
    }
}