package week1.day1;

public class Mobile {
	
	public void makeCall (String mobileModel,Float mobileWeight) {
		
		System.out.println("This is my mobile:" +mobileModel+","+mobileWeight);
	}
	
public void sendMsg(int mobileCost , boolean isFullCharged) {
		
		System.out.println("Sent message success:" +mobileCost+","+isFullCharged);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile get = new Mobile ();
		get.makeCall("samsung", 4.8f);
		get.sendMsg(2000, true);

	}

}
