package ex09_2object;

import ex09_1object.SubscriberInfo;

public class SubscriberInfo_make {
	public static void main(String[] arms) {

		SubscriberInfo a = new SubscriberInfo("제임스 고슬링", "java", "java", "010-111-2222", "나를 찾기 마세요~");
		printSubscriberInfo(a);

		a.setAddress("서울시 강남구 역삼동");
		printSubscriberInfo(a);

	}

	public static void printSubscriberInfo(SubscriberInfo a) {
		System.out.println("이름:" + a.name);
		System.out.println("아이디:" + a.id);
		System.out.println("패스워드:" + a.password);
		System.out.println("전화번호:" + a.phoneNo);
		System.out.println("주소:" + a.address);
		System.out.println("========================");

	}
}
