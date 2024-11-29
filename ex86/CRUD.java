package ex86;

import java.util.Scanner;

public class CRUD {
	// CRUD:컴퓨터 소프트웨어가 가지는 기본적인 데이터 처리 기능
	// C(Create-insert), R(Read-select)
	// U(Update-update), D(Delete-delete)
	static String menus[] = { "사원번호", "사원이름", "직급", "매니저", "입사일자", "급여", "커미션", "부서번호", "종료" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = menuselect(sc);
		String search_word = input(menu, sc);
		System.out.println(search_word);
		sc.close();	
	}


	static int menuselect(Scanner sc) {
		int i = 0;
		for (String m : menus) {
			System.out.println(++i + "." + m);
		}

		System.out.println("조회할 칼럼을 선택하세요>");
		return inputNumber(sc);
	}

	static int inputNumber(Scanner sc) {
		int input = 0;
		int lowNumber = 1;
		int hiNumber = menus.length;//9
		while (true)
			try {
				input = Integer.parseInt(sc.nextLine());
				if (input <= hiNumber && input >= lowNumber) {
					break;
				} else {
					System.out.print(lowNumber + "~" + hiNumber + "사이에 숫자를 입력하세요>");
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자로 입력하세요>");
			}
		return input;
	}
	static String input(int menu, Scanner sc) {
		String search_word = "";
		if (menu != 9)
			search_word = searchData(sc,menu);
		return search_word;		
	}
	static String searchData(Scanner sc,int menu) {
		System.out.print("조회할 " + menus[menu - 1] + "를(을) 입력하세요>");
		return sc.next();
	}
}