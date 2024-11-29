package ex09_1object;

public class SubscriberInfo {
	String name, id, password;
	String phoneNo, address;

	SubscriberInfo(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;

	}

	SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	void changePassword(String name) {
		this.name = name;
	}

	void setphoneNo(String id) {
		this.id = id;
	}

	void set(String password) {
			this.password = password;
}
}
