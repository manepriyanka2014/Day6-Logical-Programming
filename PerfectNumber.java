package com.logical;

package com.bridgelabz.logicalPrograms;

import com.bridgelabz.utility.Utility;

public class PerfectNumber {
    public static void main(String[] args) {
        Utility utility = new Utility();
        System.out.println("Enter number till you want to check Fibonacci Series :");
        int a = utility.getIntValue();
        utility.perfectNumber(a);
    }
}
