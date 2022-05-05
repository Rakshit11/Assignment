package assignment;

public class Room {
	int roomNo;
	String roomType;
	int roomArea;
	boolean acMachine;
	
	void setData(int No, String Type, int Area, boolean Machine) {
		roomNo = No;
		roomType = Type;
		roomArea =  Area;
        acMachine = Machine;
	}
	void displayData() {
		System.out.println("The room no. is : "+ roomNo);
		System.out.println("The room type is : " + roomType);
		System.out.println("The room area is : " + roomArea );
		if (acMachine==true) {
			System.out.println("AcMachine is availaible");
		}else{
				System.out.println("AcMachine is not availaible");
		}
	}
	public static void main(String[] args) {
		Room r = new Room();
		r.setData(11, "WorkStation", 350 , true);
		r.displayData();
	}
}
