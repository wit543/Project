
public class MemberElderly extends Member {
	public MemberElderly(String id, String name, String lastname,
			String gender, int age, String NationID, String phonenumber,
			double dicountRate, int point,String type, 
			String province, String postal,String country, 
			String district, String email,double memberPrice) {
		
		super(id, name, lastname, gender,age, NationID, phonenumber,dicountRate,  point, type, 
				 province,postal,country, district, email, memberPrice);

	}
	public String toString() {
		return super.toString()+" Point: "+this.getPoint()+" NationID: "+this.getNationID()+" Email: "+this.getEmail()+" Country: "+this.getCountry()+" Province: "+this.getProvince()
				+" District: "+this.getDistrict()+" ZIP code: "+this.getPostal();
	}
}
