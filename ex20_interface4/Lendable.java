package ex20_interface4;

public interface Lendable {
	final static byte STATE_BORROWED = 1; // 대출 중
	final static byte STATE_NORMAL = 0;   // 대출되지 않은 상태
	abstract void checkOut(String borrower, String date) throws Exception;
    abstract void checkIn();
     }
