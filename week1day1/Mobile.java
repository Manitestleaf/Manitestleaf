package week1day1;

public class Mobile {

	String mobileName="vivoz1x";
	int mobileNumber=917690409;
	short mobilePrice=25000;
	float mobileRange=12.9876f;
	double longfrequency=234567.098752;
	long imeiNumber=234567898876987996l;
		
	public static void main(String[] args) {
	
		Mobile mob=new Mobile();
		String mobileName2 = mob.mobileName;
		System.out.println(mobileName2);
		System.out.println(mob.mobileNumber);
		System.out.println(mob.imeiNumber);
		System.out.println(mob.longfrequency);
		System.out.println(mob.mobileRange);
			
	}

}
