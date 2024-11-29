package ex90;

import java.util.ArrayList;
import java.util.Scanner;

import ex91.Board;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DAO dao = new DAO();
		do {
			int menu = menuselect(sc);
			switch (menu) {
			case 1:
				insert(sc, dao);
				break;
			case 2:
				select(sc, dao);
				break;
			case 3:
				update(sc, dao);
				break;
			case 4:
				delete(sc, dao);
				break;
			case 5:
				selectAll(dao);
				break;
			case 6:
				sc.close();
				return;
			}
		} while (true);
	}
	private static void printTitle() {
		System.out.println("번호\t이름\t국어\t수학\t영어\t총점\t평균\t학점");
	}

	private static void selectAll(DAO dao) {
		ArrayList<Student3> list = dao.selectAll();
		if (list.isEmpty()) {
			System.out.println("테이블에 데이터가 없습니다.");
		} else {
			printTitle();
			for (Student3 s : list) {
				System.out.println(s.toString());
			}
		}
	}

	private static void delete(Scanner sc, DAO dao) {
		System.out.print("삭제할 번호를 입력하세요>");
		int no = inputNumber(sc);
		if(isExist(no, dao)) {
			int result = dao.delete(no);
			if(result == 1)
				System.out.println("삭제 되었습니다.");
			else {
				System.out.println("삭제 되지 않았습니다.");
			}
			
		}else {
			System.out.println("테이블에 없는 번호 입니다");
		}
	}
	private static boolean isExist(int no,DAO dao) {
		return dao.select(no) != null;
	}

	private static void update(Scanner sc, DAO dao) {
		System.out.print("수정할 번호를 입력하세요>");
		int no = inputNumber(sc);
		if(isExist(no, dao)) {			
			System.out.print("이름을 입력하세요>");
			String name = sc.nextLine();
			
			System.out.print("국어점수를 입력하세요>");
			int kor = inputNumber(sc, 0, 100);

			System.out.print("수학점수를 입력하세요>");
			int math = inputNumber(sc, 0, 100);

			System.out.print("영어점수를 입력하세요>");
			int eng = inputNumber(sc, 0, 100);
			
			Student3 student3 = new Student3(name, kor, math, eng);
			student3.setNo(no);
			
			int result = dao.update(student3);
			if(result == 1)
				System.out.println("수정이 되었습니다.");
			else {
				System.out.println("수정 중 오류 발생했습니다.");
			}
		}else {
			System.out.println("테이블에 없는 번호 입니다");
		}
	}
	private static int inputNumber(Scanner sc) {
		return inputNumber(sc, 0, 0);
	}

	private static void select(Scanner sc, DAO dao) {
		System.out.print("조회할 번호를 입력하세요>");
		int no = inputNumber(sc);
		Student3 st = dao.select(no);
		if(st != null) {
			printTitle();
			System.out.println(st.toString());
		}else {
			System.out.println("해당 번호로 조회된 학생이 없습니다.");
		}
	}

	private static void insert(Scanner sc, DAO dao) {
		System.out.print("이름을 입력하세요>");
		String name = sc.nextLine();

		System.out.print("국어점수를 입력하세요>");
		int kor = inputNumber(sc, 0, 100);

		System.out.print("수학점수를 입력하세요>");
		int math = inputNumber(sc, 0, 100);

		System.out.print("영어점수를 입력하세요>");
		int eng = inputNumber(sc, 0, 100);

		Student3 student3 = new Student3(name, kor, math, eng);
		int result = dao.insert(student3);
		if (result == 1)
			System.out.println("삽입 되었습니다.");
		else {
			System.out.println("삽입 실패되었습니다.");
		}

	}

	static int menuselect(Scanner sc) {
		String[] menus = { "입력", "조회", "수정", "삭제", "모두조회", "종료" };
		int i = 0;
		System.out.println("=================================================");
		for (String m : menus) {
			System.out.println(++i + "." + m);
		}
		System.out.println("=================================================");
		System.out.println("메뉴를 선택하세요>");
		return inputNumber(sc, 1, menus.length);
	}

	static int inputNumber(Scanner sc, int start, int end) {
		int input = 0;
		while (true)
			try {
				input = Integer.parseInt(sc.nextLine());
				if (input <= end && input >= start || start==0 && end==0) {
					break;
				} else{
					System.out.print(start + "~" + end + "사이에 숫자를 입력하세요>");
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자로 입력하세요>");
			}
		return input;
	}
}
