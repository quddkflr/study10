package ex27_enum;

public class EnumExample3 {
	public static void main(String args[]) {
		printSeason(Season.SPRING);
	}
	static void printSeason(Season season) {
		System.out.println();
		
		System.out.println("season.value() = " + season.value());
		System.out.println("season.name() = " + season.name());
		System.out.println("season.ordinal() = " + season.ordinal());
	}
}
