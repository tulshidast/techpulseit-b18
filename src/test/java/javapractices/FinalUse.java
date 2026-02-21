package javapractices;

public class FinalUse {

	public static void main(String[] args) {
		FinalUse2 finalUse2 = new FinalUse2(10);
		finalUse2.displayStudentInfo();

	}

}

class FinalUse2 {

	float weight = 65.5f;
	String name = "sachin";
	int rollNo = 10;
	final int adharNumber;

//	{
//		adharNumber=1233;
//	}

	public FinalUse2(int aNo) {
		this.adharNumber = aNo;
	}

	public final void displayStudentInfo() {
		rollNo = 9;
		// adharNumber = 2877866;
		System.out.println(name + " : " + "\n" + rollNo + " : " + "\n" + adharNumber);
	}
}

final class ChildOfFinalUse2 extends FinalUse2 {

	public ChildOfFinalUse2(int aNo) {
		super(aNo);
	}

//	public void displayStudentInfo() {
//		System.out.println(name + " : " + "\n" + rollNo + " : " + "\n" + adharNumber + "\n" + " : " + weight);
//	}

}

//class ChildOfChildOfFinalUse2 extends ChildOfFinalUse2 {
//
//	public ChildOfChildOfFinalUse2(int aNo) {
//		super(aNo);
//	}
//
//}
