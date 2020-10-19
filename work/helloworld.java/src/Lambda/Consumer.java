package Lambda;

public class Consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IComsumer ic=new IComsumer() {
			public void greet(String k)
			{
				System.out.println(k);
			}
		};
		ic.greet("welcome.......");
		
		
		
		
		
		IComsumer ik=(String msg)->System.out.println(msg);
		ik.greet("bye");
		
		
		
		IComsumer ig=(String msg)->
		{
			System.out.print(msg);
		};
		ig.greet("shjhjsjhs");
		
	}

}
