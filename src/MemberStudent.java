
public class MemberStudent extends Member{
	
	private String studentID;
	private String school;
	private String year;
	
	public MemberStudent(String id, String name, String lastname,
			String gender, int age, String NationID, String phonenumber,
			 double dicountRate, int point,
			String type,String province, String postal,
			String country, String district, String email,
			double memberPrice, String studentID, String school, String year) {
		super(id, name, lastname, gender, age, NationID, phonenumber,
			 dicountRate,  point, type, province,
				postal, country, district, email, memberPrice);
		this.studentID = studentID;
		this.school = school;
		this.year = year;
	}
	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	public String toString() {
		return super.toString()+" Point: "+this.getPoint()+" NationID: "+this.getNationID()+" Email: "+this.getEmail()+" Country: "+this.getCountry()+" Province: "+this.getProvince()
				+" District: "+this.getDistrict()+" ZIP code: "+this.getPostal()+" Student ID: "+this.studentID+" School: "+this.school+" Year: "+this.year;
	}
}