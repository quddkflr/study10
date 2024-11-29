package ex17_messagesender;

abstract public class MessageSender {
	String title;
	String senderName;
	
	MessageSender(String title,String senderName){
		this.title = title;
		this.senderName = senderName;
	}
	abstract void sendMessage(String recipient);

}
