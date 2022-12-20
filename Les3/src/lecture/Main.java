package lecture;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User boss = new User("Anatli","Bigbosov",45);
        User littleBoss = new User("Oleg","letov",38);
        List<User> users = Arrays.asList(new User("Valera","Petrov",25),
                new User("Lena","Lenina",32),
                new User("Lena","Poleno",30),
                new User("Alesha","Makaronov",40));
        Personal personal = new Personal(users);
        Collections.sort(users);
        Company company = new Company(boss);
        littleBoss.setSubordinates(users);
        boss.setSubordinates(Arrays.asList(littleBoss));
        for (User user:company) {
            System.out.println(user);
        }

    }



}
