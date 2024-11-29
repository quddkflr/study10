package ex28_enum;

public class SeperateVolume implements Lendable {

	String requestNo; //청구번호
	String bookTitle; //제목
	String writer; //저자
	String borrower; //대출인
	String checkOutDate; //대출일
	BookState state; //대출 상태
	
	SeperateVolume(String requestNo,String bookTitle,String writer){
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
		this.state = BookState.STATE_NORMAL;
	}
	
	public void checkOut(String borrower, String date) { //대출
		
		if(state != BookState.STATE_NORMAL ) {
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = date;
		state = BookState.STATE_BORROWED;
		System.out.println("*" + bookTitle + " 이(가) 대출되었습니다.");
		System.out.println("대출인:" + borrower);
        System.out.println("대출일:" + date + "\n"); 
	}
	
	public void checkIn() { //반납
		this.borrower = null;
		this.checkOutDate =null;
		this.state =BookState.STATE_NORMAL;
		System.out.println("*" + bookTitle + " 이(가) 반납되었습니다.\n");
		
	}
}