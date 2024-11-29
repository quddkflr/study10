package ex28_enum;

public interface Lendable {
		//final static byte STATE_BORROWED=1;//대출중
		//final static byte STATE_NORMAL=0;//대출가능
		void checkOut(String borrower,String date);
		void checkIn();

	}

