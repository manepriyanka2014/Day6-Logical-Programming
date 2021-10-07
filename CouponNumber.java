package com.logical;

	package com.bridgelabz.logicalPrograms;

	import com.bridgelabz.utility.Utility;

	public class CouponNumber {
	    public static void main(String[] args) {
	        Utility utility=new Utility();
	        System.out.println("Enter coupon code length : ");
	        int couponLength= utility.getIntValue();
	        System.out.println("Enter how many coup
	on codes you want : ");
	        int couponNumber= utility.getIntValue();

	        utility.couponCodeGenrator(couponLength,couponNumber);
	    }
	}

}
