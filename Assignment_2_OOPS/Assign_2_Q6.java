package Assignment_2_OOPS;

abstract class Persistence{
	
	abstract void persist();
}

class FilePersistence extends Persistence{
	public void persist() {
		System.out.println("File Persistence");
	}
}

class DatabasePersistence extends Persistence{
	public void persist() {
		System.out.println("Database Persistence");
	}
}

public class Assign_2_Q6 {

	public static void main(String[] args) {
		
		FilePersistence f = new FilePersistence();
		DatabasePersistence d = new DatabasePersistence();
		
		f.persist();
		d.persist();

	}

}
