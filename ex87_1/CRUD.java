package ex87_1;

import java.util.ArrayList;
import java.util.Scanner;

import ex84.Emp;

public class CRUD {
	static String menus[] = { "사원번호", "사원이름", "직급", "매니저", "입사일자", "급여", "커미션", "부서번호", "종료" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = menuselect(sc);
		String search_word = input(menu, sc);
		search(menu, search_word);
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

	private static void search(int menu, String search_word) {
		DAO dao = new DAO();
		ArrayList<Emp> list = dao.search(menu - 1, search_word);

		if (list.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.printf("%s\t%s\t%s\t\t%s\t%s\t\t%s\t%s\t%s\t\n", menus[0], menus[1], menus[2], menus[3],
					menus[4], menus[5], menus[6], menus[7]);
			for (Emp s : list) {
				System.out.println(s.toString());
			}
		}
	}
}
