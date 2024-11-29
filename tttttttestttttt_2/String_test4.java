package tttttttestttttt_2;

class String_test4 {
	public static void main(String[] args) {
		String jumin = "123456-4123456";

		char a = jumin.charAt(7);

		// 성별 정보에 따라 출력문 결정
		switch (a) {
		case '1':
		case '3':
			System.out.println("추출한 숫자는 " + a + "이고 남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("추출한 숫자는 " + a + "이고 여자입니다.");
			break;
		default:
			System.out.println("추출한 숫자는 " + a + "이고 외국인입니다.");
			break;
		}
	}

}