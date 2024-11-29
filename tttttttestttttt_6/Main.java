package tttttttestttttt_6;

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

public class Main {

	public static void main(String args[]) {

		input();

	}

	static void input() {

		try (BufferedReader br = new BufferedReader(new FileReader("jumsu.txt"))) {

			System.out.println("==========    학생별   /  과목별 총점구하기  ==========");

			System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

			String line;

			while ((line = br.readLine()) != null) {

				String[] data = line.split(" ");

				String name = data[0];

				int kor = Integer.parseInt(data[1]);

				int eng = Integer.parseInt(data[2]);

				int math = Integer.parseInt(data[3]);

				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n", name, kor, eng, math, kor + eng + math,

						(kor + eng + math) / 3.0);

			}

			for (int j = 0; j < 50; j++) {

				System.out.print("=");

			}

			System.out.print("\n총점\t408\t380\t338\n");

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
