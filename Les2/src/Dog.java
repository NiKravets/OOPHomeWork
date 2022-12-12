public class Dog extends Animal implements Speakable,Runable{

    public Dog(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    }


    public String speak() {
        return "Woof!";
    }
    @Override
    public String run() {
        return "30 km/h";
    }
}
