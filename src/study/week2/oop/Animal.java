package study.week2.oop;

/**
 * 
 * @author pc
 *动物类
 */
public class Animal {

	private String eye;

	public String getEye() {
		return eye;
	}

	public void setEye(String eye) {
		this.eye = eye;
	}
	
	/**
	 *  动物跑
	 */
	protected void run(){
		System.out.println("animal run...");
	}
	
	
}
