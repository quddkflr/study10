package ex76;

public class BBSItem implements java.io.Serializable {
	private static int itemNum = 0;
	private String writer;
	private transient String passwd;
	private String title;
	private String content;
	
	BBSItem(String writer,String passwd,String title,String content){
		this.writer = writer;
		this.passwd = passwd;
		this.title = title;
		this.content = content;
		itemNum++;
	}
	void modifyContent(String content,String passwd) {
		if(!passwd.equals(this.passwd)) {
			return;
		}
			this.content = content;
		}
		public String  toString() {
			return "전체게시물의 수: " + itemNum+
					"\n글쓴이: " + writer +
					"\n패스워드: " + passwd +
					"\n제목: " + title +
					"\n내용: " + content;
					
		}
	}

