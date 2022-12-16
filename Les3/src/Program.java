public class Program {
    public static void main(String[] args) {
        UserList<User> users = new UserList<>();
        users.add(new User("Oleg","letov",38));
        users.add(new User("Valera","Petrov",25));
        users.add(new User("Lena","Lenina",32));
        users.add(new User("Alesha","Makaronov",40));
        for (Node item:users) {
            System.out.println(item.getItem());
        }
    }
}
