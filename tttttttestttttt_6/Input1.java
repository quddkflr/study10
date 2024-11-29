package tttttttestttttt_6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import ex09_5object.Student;

public class Input1 {
	public static void main(String agre[]) {
	BufferedReader reader = null;
	try{
		reader=new BufferedReader(
				new FileReader("src/tttttttestttttt_6/jumsu.txt"));
	ArrayList<Student> list = new ArrayList<Student>();while(true)
	{
			String str = reader.readLine();
			if (str == null)
				break;
			String[] sep = str.split(" ");
			list.add(new Student)(
					sep[0],
					Integer.parseInt(sep[1]),
					Integer.parseInt(sep[2]),
					Integer.parseInt(sep[3])
					)
			);
		}
	print(list);

	}catch(
	FileNotFoundException fnfe)
	{
		System.out.println("파일이 존재하지 않습니다.");
	}catch(IOException e)System.out.println();

}
}
