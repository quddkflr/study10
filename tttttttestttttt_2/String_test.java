package tttttttestttttt_2;

class String_test {
	public static void main(String args[]) {
		String jumin = "123456-4123456";

		String a = jumin.substring(7, 8);

		if (a.equals("2") || a.equals("4"))
			System.out.println("추출한 숫자는" + a + "이고 여자입니다.");
		else if (a.equals("1") || a.equals("3"))
			System.out.println("추출한 숫자는" + a + "이고 남자입니다.");
		else
			System.out.println("외국인 입니다.");
	}
}
