package ex20_interface3;

public interface Lendable {
	final static byte STATE_BORROWED = 1; // 대출 중
	final static byte STATE_NORMAL = 0;   // 대출되지 않은 상태
    void checkOut(String borrower, String date);
    void checkIn();
     }
