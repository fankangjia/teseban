package study.week2.oop;

public class Monkey extends Animal {

	String swing;
	
	public String getSwing() {
		System.out.println("bird swing"+swing);
		return swing;
	}

	public void setSwing(String swing) {
	
		this.swing = swing;
	}

	public void run(){
		
		System.out.println("monkey run");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Animal();
		a.run();
	}

}
