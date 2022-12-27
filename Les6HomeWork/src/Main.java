public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		PersisterConsole persisterConsole = new PersisterConsole(user);
		persisterConsole.report();
		persisterConsole.save();
	}
}