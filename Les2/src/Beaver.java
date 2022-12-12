public class Beaver extends Animal implements Runable,Swimable{

    public Beaver(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String run() {
        return "10 km/h";
    }

    @Override
    public String swim() {
        return "20 km/h";
    }
}
