package tttttttestttttt_2;

class String_test3 {
	public static void main(String[] args) {
		String jumin = "123456-4123456";

		char a = jumin.charAt(7);

		if (a == '1' || a == '3') {
			System.out.println("추출한 숫자는 " + a + "이고 남자입니다.");
		} else if (a == '2' || a == '4') {
			System.out.println("추출한 숫자는 " + a + "이고 여자입니다.");
		} else {
			System.out.println("추출한 숫자는 " + a + "이고 외국인입니다.");
		}
	}
}