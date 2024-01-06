package oops;


class Account{
public	String name;
	protected String email;
	 private String password;
	
	public void password(String password) {
		this.password=password;
		System.out.println(password);
	}
}


public class PackagesSample {
	 
	
	public static void main(String[] args) {
		
		Account s = new Account();
		
		s.name = "Ahmed";
		s.email="ahmedqscb@gmail.com";
		s.password("abcd");
		
	}

}
