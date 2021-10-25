
public class Admin {
	private String name;
	private String gender;
	private int age;
	private String address;
	
	private LoginInfo credentials;
	
	

	public Admin() {
	}

	public Admin(String name, String gender, int age, String address, LoginInfo credentials) throws Exception {
		try {
			if(credentials.getEmail().isEmpty()) {
				throw new EmptyStringException("Email cannot be empty");
			}
			String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

			if(!credentials.getEmail().matches(regex)) {
				throw new InvalidEmailException("Email is Invalid");
			}
			if(credentials.getPassword().isEmpty()) {
				throw new EmptyStringException("Password cannot be empty");
			}
		}
		catch(Exception e) {
			
		}
		if(name.isEmpty()) {
			throw new EmptyStringException("Name cannot be empty");
		}
		if(age<=0) {
			throw new LessThanZeroException("Age Should not be less than or equal to 0");
			
		}
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.credentials = credentials;
	}

	public LoginInfo getCredentials() {
		return credentials;
	}
	public void setCredentials(LoginInfo credentials) throws Exception{
		if(credentials.getEmail().isEmpty()) {
			throw new EmptyStringException("Email cannot be empty");
		}
		if(credentials.getPassword().isEmpty()) {
			throw new EmptyStringException("Passwrd cannot be empty");
		}
		this.credentials = credentials;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception {
		if(name.isEmpty()) {
			throw new EmptyStringException("Name cannot be empty");
		}
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception {
		if(age<=0) {
			throw new LessThanZeroException("Age Should not be less than or equal to 0");
			
		}
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
