package vechile;

public class VechileMain {
	public static int xyz=1340;
				public static void main(String args[]) {
			 
			int y=5;
			y=y*3+7;
			System.out.println(y);
			Vechile car=new Car();
			car.moves();//run time polymorphism
			
			Vechile bike=new Bike();
			bike.moves();
		
			int k=10;
			String s=Integer.toString(k);
			Vechile vehicles[]=new Vechile[2];
			vehicles[0]=car;
			vehicles[1]=bike;
			System.out.println("moving all vehicles in array");
			for(int i=0;i <vehicles.length; i++) {
				Vechile vehicle=vehicles[i];
				vehicle.moves();
			}
			
		}
	

}