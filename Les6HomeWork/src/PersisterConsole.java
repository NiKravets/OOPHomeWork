public class PersisterConsole
		extends Persister implements Savable,Reportable{


	public PersisterConsole(User user) {
		super(user);
	}
	@Override
	public void save(){
		System.out.println("Save user: " + user.getName());
	}
	@Override
	public void report(){
		System.out.println("Report for user: " + user.getName());
	}


}