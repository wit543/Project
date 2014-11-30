import java.util.ArrayList;


public class Member extends Person {
	private double dicountRate;
	private int point =0;
	private String type;
	private String province;
	private String postal;
	private String country;
	private String district;
	private String email;
	private double memberPrice;

	public Member(String id, String name, String lastname, String gender,
			int age, String NationID, String phonenumber,
			double dicountRate, int point, String type,
		 String province, String postal,
			String country, String district, String email, double memberPrice) {
		super(id, name, lastname, gender,age, NationID, phonenumber);
		this.dicountRate = dicountRate;
		this.point = point;
		this.type = type;
		this.province = province;
		this.postal = postal;
		this.country = country;
		this.district = district;
		this.email = email;
		this.memberPrice = memberPrice;
	}
	public double getDicountRate() {
		return dicountRate;
	}



	public void setDicountRate(double dicountRate) {
		this.dicountRate = dicountRate;
	}



	public int getPoint() {
		return point;
	}



	public void setPoint(int point) {
		this.point = point;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}


	public String getProvince() {
		return province;
	}



	public void setProvince(String province) {
		this.province = province;
	}



	public String getPostal() {
		return postal;
	}



	public void setPostal(String postal) {
		this.postal = postal;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getDistrict() {
		return district;
	}



	public void setDistrict(String district) {
		this.district = district;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public double getMemberPrice() {
		return memberPrice;
	}



	public void setMemberPrice(double memberPrice) {
		this.memberPrice = memberPrice;
	}

	public void addPoint(int point){
		this.point+=point;
	}
	
	public void sortName(ArrayList<Member> member){
		for (int k = 0; k < member.size() - 1; k++) {
			for (int i = 0; i < member.size() - 1-k; i++) {

				if (member.get(i).compareTo(member.get(i+1)) >0) {
					Member temp = member.get(i);
					member.set(i, member.get(i+1));
					member.set(i+1, temp);

				}
			}
		}
	}
	
	public void sortType(ArrayList<Member> member){
		for (int k = 0; k < member.size() - 1; k++) {
			for (int i = 0; i < member.size() - 1-k; i++) {

				if (member.get(i).compareTo1(member.get(i+1)) >0) {
					Member temp = member.get(i);
					member.set(i, member.get(i+1));
					member.set(i+1, temp);

				}
			}
		}
	}
	
	public void sortID(ArrayList<Member> member){
		for (int k = 0; k < member.size() - 1; k++) {
			for (int i = 0; i < member.size() - 1-k; i++) {

				if (member.get(i).compareTo2(member.get(i+1)) >0) {
					Member temp = member.get(i);
					member.set(i, member.get(i+1));
					member.set(i+1, temp);

				}
			}
		}
	}
	
	public int compareTo(Object obj){
		Member other = (Member)obj;
		return this.getName().compareTo(other.getName());
		
	}
	
	public int compareTo1(Object obj){
		Member other = (Member)obj;
		return this.getType().compareTo(other.getType());
		
	}
	
	public int compareTo2(Object obj){
		Member other = (Member)obj;
		return this.getId().compareTo(other.getId());
		
	}
	
	public ArrayList<Member> searchMember(ArrayList<Member> member,String word){
		ArrayList<Member> found = new ArrayList<Member>();
		for(int i=0;i<member.size();i++){
			if(member.get(i).getName().equalsIgnoreCase(word)){
				found.add(member.get(i));
			}
			else if(member.get(i).getLastname().equalsIgnoreCase(word)){
				found.add(member.get(i));
			}
			else if(member.get(i).getId().equalsIgnoreCase(word)){
				found.add(member.get(i));
			}
			else if(member.get(i).getType().equalsIgnoreCase(word)){
				found.add(member.get(i));
			}
			else if(member.get(i).getGender().equalsIgnoreCase(word)){
				found.add(member.get(i));
			}
		}
		return found;
		
	}
	
	public String toString() {
		
		return super.toString()+(" "+this.getType()+" Member");
	}
	
}
