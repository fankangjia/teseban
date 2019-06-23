package study.week3;

public class Message<M> {

	String status;//状态码00表示成功-- 01表示失败
	String errorInfo;
	M data;
	public Message(String status, M data) {
		super();
		this.status = status;
		this.data = data;
	}
	public Message(String status, String errorInfo) {
		super();
		this.status = status;
		this.errorInfo = errorInfo;
	}
	public Message(String status, String errorInfo, M data) {
		super();
		this.status = status;
		this.errorInfo = errorInfo;
		this.data = data;
	}
	@Override
	public String toString() {
		return "Message [status=" + status + ", errorInfo=" + errorInfo + ", data=" + data + "]";
	}
	

}
