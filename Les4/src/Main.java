public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Valera",150,new BastardSword(),new HeaterShield());
        Team<Archer> red = new Team<>(hero1);
        red.add(new Archer("Ctrelok", 50,new Bow(),40));
        red.add(new Archer("Kosoy", 40,new Bow(),25));
        red.add(new Archer("Krivoy", 30,new Bow(),35));

        Hero hero2 = new Hero("Plut",120,new LongBow());
        Team<Warrior> blue = new Team<>(hero2);
        blue.add(new Archer("RobinHood", 100,new LongBow(),50));
        blue.add(new Mage("Merlin", 100,new Staff(),40,200));

        Hero hero3 = new Hero("Goon",180,new Mace(),new HeavyShield());
        Team<Warrior> green = new Team<>(hero3);
        green.add(new Knight("Holyman",80,new BastardSword(),new HeaterShield()));
        green.add(new Bandit("Liar",60,new Mace(),new BucklerShield()));

        System.out.println(red);
        System.out.println(red.getTeamHP()+"\n");
        System.out.println(blue);
        System.out.println(blue.getTeamHP()+"\n");
        System.out.println(green);
        System.out.println(green.getTeamHP()+"\n");



        }

    }

