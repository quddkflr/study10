package ex26_enum_method;

public class EnumExample2 {
	public static void main(String args[]) {
		printDay("MONDAY");
		printDay("WEDNESDAY");
		printDay("FRIDAY");
		
	}
	static void printDay(String name) {
		Day day = Day.valueOf(name);
		System.out.print(day + " : ");
		
		int value=day.ordinal();
		System.out.println(value);
	}

}
