import java.util.ArrayList;

import java.util.List;

public class Zoo {

    List<Animal> animals;

    public Zoo(){
        animals = new ArrayList<>(List.of(new Cat("Murzik","brit","grey",4,8 ),
        new Dog("Bob","pitbul","black",4,5), new Fish("Dori","blur","blue",0,2),
                new Duck("Pikin","wild","green",2,3),
                new Beaver("Bobr","river","brown",4,7)));
    }

    public void talk(){
        for (Speakable animal:getSpeakable()) {
            System.out.printf("%s\n",animal.speak());

        }
    }

    public List<Speakable> getSpeakable(){
        List<Speakable> result = new ArrayList<>();
        for (Animal animal:animals) {
            if(animal instanceof Speakable) result.add((Speakable)animal);
        }
        result.add(new Radio());
        return result;
    }

    public List<Runable> getRunable(){
        List<Runable> result = new ArrayList<>();
        for (Animal animal:animals) {
            if(animal instanceof Runable) result.add((Runable)animal);
        }
        return result;
    }

    public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>();
        for (Animal animal:animals) {
            if(animal instanceof Flyable) result.add((Flyable)animal);
        }
        return result;
    }
    public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>();
        for (Animal animal:animals) {
            if(animal instanceof Swimable) result.add((Swimable)animal);
        }
        return result;
    }

    public void run(){
        for (Runable animal:getRunable()) {
            System.out.printf("%s %s\n", animal.toString(), animal.run());
        }
    }
    public void fly(){
        for (Flyable animal:getFlyable()) {
            System.out.printf("%s %s\n", animal.toString(), animal.fly());
        }
    }

    public void swim(){
        for (Swimable animal:getSwimable()) {
            System.out.printf("%s %s\n", animal.toString(), animal.swim());
        }
    }


}
