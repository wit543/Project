
public class Person {
	private String ID;
	private String name;
	private String lastname;
	private String gender;
	private String NationID;
	private String phonenumber;
	private int age;


	Person(String id, String name,String lastname,String gender,int age,String NationID,String phonenumber){
		this.ID=id;
		this.name=name;
		this .lastname=lastname;
		this.gender=gender;
		this.NationID = NationID;
		this.phonenumber = phonenumber;
		this.age = age;
	}
	public void ChangePhoneNumber(String phonenumber){
		this.phonenumber = phonenumber;
	}

	public String getNationID() {
		return NationID;
	}
	public void setNationID(String nationID) {
		NationID = nationID;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
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
	
	public boolean equals(Person key){
		if(this.ID.equals(key.ID)&&this.name.equals(key.name)&&this.lastname.equals(key.lastname)&&this.gender.equals(key.gender)&&this.age==key.age&&this.NationID.equals(key.NationID)&&this.phonenumber.equals(key.phonenumber))
			return true;
		return false;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString(){
		return "ID: "+this.ID+"  Name: "+this.name+" "+this.lastname+"  Gender: "+this.gender+"  Age: "+this.age+" years old "+"Phone: "+this.phonenumber;
	}

}