package project.project_week_one.preview;
/**
 * 使用final的属性不能被更改，必须赋初值
 * 使用final的方法不能被重写
 * 使用final的class不能被继承
 * @author da_fa
 *
 */
final class Finall{//不能被继承
	final String a;//必须赋初值
	public final void f() {}//不能被重写
	
}
class aa extends Finall{vv
	@Override
	public void f() {};
}
public class Final6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

 