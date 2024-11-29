package ex91;

public class Board {
	private int BOARD_NUM;
	private String BOARD_NAME;
	private String BOARD_PASS;
	private String BOARD_SUBJECT;
	private String BOARD_CONTENT;
	private String BOARD_FILE;
	private String BOARD_ORIGINAL;
	private int BOARD_RE_REF;
	private int BOARD_RE_LEV;
	private int BOARD_RE_SEQ;
	private int BOARD_READCOUNT;
	private String BOARD_DATE;
	
	public Board() {

	}

	public Board(int BOARD_NUM, String BOARD_NAME, String BOARD_PASS, String BOARD_SUBJECT,
			String BOARD_CONTENT,String BOARD_FILE,String BOARD_ORIGINAL,int BOARD_RE_REF,
			int BOARD_RE_LEV,int BOARD_RE_SEQ,int BOARD_READCOUNT,String BOARD_DATE) {
		this.BOARD_NUM = BOARD_NUM;
		this.BOARD_NAME = BOARD_NAME;
		this.BOARD_PASS = BOARD_PASS;
		this.BOARD_SUBJECT = BOARD_SUBJECT;
		this.BOARD_CONTENT = BOARD_CONTENT;
		this.BOARD_FILE = BOARD_FILE;
		this.BOARD_ORIGINAL = BOARD_ORIGINAL;
		this.BOARD_RE_REF = BOARD_RE_REF;
		this.BOARD_RE_LEV = BOARD_RE_LEV;
		this.BOARD_RE_SEQ = BOARD_RE_SEQ;
		this.BOARD_READCOUNT = BOARD_READCOUNT;
		this.BOARD_DATE = BOARD_DATE;

	}


	public int getBOARD_NUM() {
		return BOARD_NUM;
	}

	public void setBOARD_NUM(int bOARD_NUM) {
		BOARD_NUM = bOARD_NUM;
	}

	public String getBOARD_NAME() {
		return BOARD_NAME;
	}

	public void setBOARD_NAME(String bOARD_NAME) {
		BOARD_NAME = bOARD_NAME;
	}

	public String getBOARD_PASS() {
		return BOARD_PASS;
	}

	public void setBOARD_PASS(String bOARD_PASS) {
		BOARD_PASS = bOARD_PASS;
	}

	public String getBOARD_SUBJECT() {
		return BOARD_SUBJECT;
	}

	public void setBOARD_SUBJECT(String bOARD_SUBJECT) {
		BOARD_SUBJECT = bOARD_SUBJECT;
	}

	public String getBOARD_CONTENT() {
		return BOARD_CONTENT;
	}

	public void setBOARD_CONTENT(String bOARD_CONTENT) {
		BOARD_CONTENT = bOARD_CONTENT;
	}

	public String getBOARD_FILE() {
		return BOARD_FILE;
	}

	public void setBOARD_FILE(String bOARD_FILE) {
		BOARD_FILE = bOARD_FILE;
	}

	public String getBOARD_ORIGINAL() {
		return BOARD_ORIGINAL;
	}

	public void setBOARD_ORIGINAL(String bOARD_ORIGINAL) {
		BOARD_ORIGINAL = bOARD_ORIGINAL;
	}

	public int getBOARD_RE_REF() {
		return BOARD_RE_REF;
	}

	public void setBOARD_RE_REF(int bOARD_RE_REF) {
		BOARD_RE_REF = bOARD_RE_REF;
	}

	public int getBOARD_RE_LEV() {
		return BOARD_RE_LEV;
	}

	public void setBOARD_RE_LEV(int bOARD_RE_LEV) {
		BOARD_RE_LEV = bOARD_RE_LEV;
	}

	public int getBOARD_RE_SEQ() {
		return BOARD_RE_SEQ;
	}

	public void setBOARD_RE_SEQ(int bOARD_RE_SEQ) {
		BOARD_RE_SEQ = bOARD_RE_SEQ;
	}

	public int getBOARD_READCOUNT() {
		return BOARD_READCOUNT;
	}

	public void setBOARD_READCOUNT(int bOARD_READCOUNT) {
		BOARD_READCOUNT = bOARD_READCOUNT;
	}

	public String getBOARD_DATE() {
		return BOARD_DATE;
	}

	public void setBOARD_DATE(String bOARD_DATE) {
		BOARD_DATE = bOARD_DATE;
	}

	public String toString() {
		String re = "";
		if(BOARD_RE_LEV>0) {
			for(int i=0;i<BOARD_RE_LEV * 2;i++)
				re += " ";
			
			re += "re:";
		}
		return String.format("%s\t%s\t\t%-16s\t%-16s\t%s\t%s\t%s\t%s", BOARD_NUM,BOARD_NAME,( re + BOARD_SUBJECT),BOARD_CONTENT,
				BOARD_RE_REF,BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_DATE.substring(0,10));
	}
}
