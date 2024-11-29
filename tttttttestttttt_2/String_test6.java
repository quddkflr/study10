package tttttttestttttt_2;

class String_test6 {
	public static void main(String[] args) {
		String jumin = "123456-4123456";

		String a = jumin.substring(7, 8);
		System.out.println("추출한 숫자는 "+ a + "이고 ");

		String result = switch (a) {
		case "1", "3" ->"남자";

		case "2", "4"-> "여자";

		default -> "외국인";
			
		};
		System.out.println(result +  "입니다.");
	}

}
