package assignment;

public class OverRiding {
	public static void main(String[] args) {
		Cs a= new Cs();
		a.run();
	}

}
class Game{  
	void run()
	{
		System.out.println("Game is running");}  
	}  
class Cs extends Vehicle{  

	void run(){System.out.println("Cs Works fine");}  
	  
	  public static void main(String args[]){  
	  Cs obj = new Cs();  
	  obj.run(); 
	  }  
	}  