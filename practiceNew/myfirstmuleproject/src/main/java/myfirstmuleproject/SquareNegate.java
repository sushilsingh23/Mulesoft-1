package myfirstmuleproject;

public class SquareNegate {
	public Integer square(Integer num){
		org.mule.el.context.ServerContext context=
				new org.mule.el.context.ServerContext();

		return num*num;
	}
	public Integer negate(Integer num){
		Integer result=-num;
		return result;
	}
}
