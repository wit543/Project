

public class Person {
	private String ID;
	private String name;
	private String lastname;
	private String gender;
	private int[] age =new int [3];
	Person(){
		
	}
	Person(String id, String name,String lastname,String gender,int[] age){
		this.ID=id;
		this.name=name;
		this .lastname=lastname;
		this.gender=gender;
		this.age =age;
	}
	public void setId(String id){
		this.ID=id; 
	}
	public void setName(String name){
		this.name=name;
	}
	public void setLastname(String lastname){
		this.lastname=lastname;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
	public String getId(){
		return this.ID;
	}
	public String getName(){
		return this.name;
	}
	public String getLastname(){
		return this.lastname;
	}
	
	public String getGender(){
		return this.gender;
	}
	public String toString(){
		return this.ID+", "+this.name+" "+this.lastname+", "+this.gender;
	}
	public boolean equals(Person key){
		if(this.ID.equals(key.ID)&&this.name.equals(key.name)&&this.lastname.equals(key.lastname)&&this.gender.equals(key.gender))
			return true;
		return false;
	}
	
}