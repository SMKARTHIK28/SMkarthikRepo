package week1.day1;

public class Twowheeler {
	public int noOfWheels = 2;
	public short noOfMirrors = 2;
	public long chassisNumber = 34567;
	public boolean isPunctured = true;
	public String bikeName = "FZ";
	public double runningKM = 150;
	
	public static void main(String[] args)
	{
	Twowheeler frstasg1 = new Twowheeler();
	
	System.out.println(frstasg1.noOfWheels);
	System.out.println(frstasg1.noOfMirrors);
	System.out.println(frstasg1.chassisNumber);
	System.out.println(frstasg1.isPunctured);
	System.out.println(frstasg1.bikeName);
	System.out.println(frstasg1.runningKM);
	}
}
