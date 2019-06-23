package project.project_week_one.preview;
/**
 * 工厂设计模式
 * @author da_fa
 *@since2019-6-12
 */
enum ReturnType{//退货清单列表
	FaultReturn,//质量问题退货
	NoQuibblesReturn//无条件退货
}
class ReturnOrder{//退货单
	public ReturnType retuentype;
}
abstract class ReturnProcessTemplate{//抽象退货处理类
	//下面是两个抽象方法
	protected abstract void GenerateReturn(ReturnOrder returnorder);
	protected abstract void CalculateRefund(ReturnOrder returnorder);
	//下面是具体实现的方法
	public void process(ReturnOrder returnorder) {
		GenerateReturn(returnorder);
		CalculateRefund(returnorder);
	}
}
//无条件退货类
class NoQuibblesReturnPross extends ReturnProcessTemplate{

	@Override
	protected void GenerateReturn(ReturnOrder returnorder) {
		System.out.println("将商品添加到库存中去。");
		
	}

	@Override
	protected void CalculateRefund(ReturnOrder returnorder) {
		System.out.println("只退货款。");
	}
	
}
//有缺陷退货类
class FaultReturnPross extends ReturnProcessTemplate{

	@Override
	protected void GenerateReturn(ReturnOrder returnorder) {
		System.out.println("将商品返厂。");
	}

	@Override
	protected void CalculateRefund(ReturnOrder returnorder) {
		System.out.println("全额退款。");
	}
	
}
//退货处理类的对象的工厂类
class ReturnProcessFactory{
	public static ReturnProcessTemplate createReturnProcess(ReturnType returnType) {
		switch (returnType) {
		case FaultReturn:
			return new FaultReturnPross();
		case NoQuibblesReturn:
			return new NoQuibblesReturnPross();
		default:return null;
		}
	}
}
//退货处理服务类
class ReturnService{
	public void process(ReturnOrder returnorder) {
		ReturnProcessTemplate returnProcess=ReturnProcessFactory.createReturnProcess(returnorder.retuentype);
		returnProcess.process(returnorder);
	}
}
public class TemplateMethodPatteernDemo {

	public static void main(String[] args) {
		ReturnOrder re=new ReturnOrder();
		re.retuentype=ReturnType.NoQuibblesReturn;
		new ReturnService().process(re);
		re.retuentype=ReturnType.FaultReturn;
		new ReturnService().process(re);
	}

}
