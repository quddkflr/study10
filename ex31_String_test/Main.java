package ex31_String_test;

public class Main {
	public static void main(String args[]) {
		String zumin = "123456-7890123";
		print(zumin);

	}

	static void print(String zumin) {
		String message = "주민등록번호는 14자리 입니다.";
		if (check_length(zumin) == true) {
			if (check_hyphen(zumin) == true) {
				message = inNumber_Message(zumin);
			} else {
				System.out.println("-을 넣어주세요");
			}
		} else
			System.out.println("주민등록번호는 14자리 입니다.");

	}

	static boolean check_length(String zumin) {
		return zumin.length() == 14;
	}

	static String pandan_gender(String zumin) {
		String a = zumin.substring(7, 8);
		String result = "외국인";
		switch (a) {
		case "1":
		case "3":
			result = "남자";
			break;
		case "2":
		case "4":
			result = "여자";

		}
		return result;
	}

	static boolean check_hyphen(String zumin) {
		return zumin.substring(6, 7).equals("-");
	}
	
	static int isNumber(String zumin) {
		int index = -1;
		int len = zumin.length();
		
		for(int i = 0; i < len; i++) {
			if( i == 6)
				continue;
			
			char test = zumin.charAt(i);
			if(test<'0' || test > '9') {
				index = i;
				break;
			}
		}
				
		return index;
		
	}
	static String inNumber_Message(String zumin) {
		int index = isNumber(zumin);
		String message="";
		if(index >=0 && index <= 5) {
			message = "주민번호 앞자리를 숫자로 입력하세요";
		} else if(index >=7 && index <= 13) {
			message = "주민번호 뒷자리를 숫자로 입력하세요";
		} else if(index == -1) {
			message=pandan_gender(zumin) + " 입니다.";
		}
		return message;
		}
	
	}
