package Static;

import vechile.Vechile;
import vechile.VechileMain;

public class StaticMain {
	
	public static void main(String args[])
	{
		System.out.println(StaticChild.var);
		System.out.println(VechileMain.xyz);
		System.out.println(Vechile.abc);
		System.out.println(StaticChild.display());
		StaticChild s=new StaticChild();
		s.display1();
		
	}
	
}
