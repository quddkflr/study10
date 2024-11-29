package ex09_1object;

public class SubscriberInfo_make {
	public static void main(String[]arms) {
		
		SubscriberInfo a = new SubscriberInfo("연흥부","poorman","zebi");
		
		System.out.println("이름:" + a.name);
		System.out.println("아이디:" + a.id);
		System.out.println("패스워드:" + a.password);
		System.out.println("전화번호:" + a.phoneNo);
		System.out.println("주소:" + a.address);
		System.out.println("========================");
		
		a.setAddress("서울시 종로구");
		a.setPhoneNo("010-1234-1234");
		System.out.println("이름:" + a.name);
		System.out.println("아이디:" + a.id);
		System.out.println("패스워드:" + a.password);
		System.out.println("전화번호:" + a.phoneNo);
		System.out.println("주소:" + a.address);
		System.out.println("========================");
		
		
	}

	
}
