package ex09_2object;

public class SubscriberInfo {
	String name,id,password;	
	String phoneNo,address;

	SubscriberInfo(){
		
	}
	SubscriberInfo(String name,String id,String password){
		this.name = name;
		this.id = id;
		this.password = password;
		
	}
	SubscriberInfo(String name,String id,String password
			,String phoneNo, String address){
		this(name,id,password);//첫번째에 있어야함
		this.phoneNo = phoneNo;
		this.address = address;
	}
	void changePassword(String password) {
		this.password = password;
	}
	void setphoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	void setAddress(String address) {
		this.address = address;
	}
		
}
		
}
