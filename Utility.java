package com.utility;
import java.util.Random;
import java.util.Scanner;
public class Utility {
	    Scanner scanner;
	    public Utility(){
	        scanner=new Scanner(System.in);
	    }
	    public int getIntValue(){
	        return scanner.nextInt();
	    }
	    public String getStringInput(){
	        return scanner.next();
	    }

	    public void FibonacciSeries(int a) {
	        int n1=0,n2=1,n3;
	        System.out.print(n1+" "+n2);

	        for (int i=0;i<a;i++){
	            n3=n1+n2;
	            System.out.print(" "+n3);
	            n1=n2;
	            n2=n3;
	        }
	    }

	    public void perfectNumber(int a) {
	        int sum = 1;

	        for (int i = 2; i * i <= a; i++)
	        {
	            if (a % i==0)
	            {
	                if(i * i != a)
	                    sum = sum + i + a / i;
	                else
	                    sum = sum + i;
	            }
	        }

	        if (sum == a && a != 1)
	            System.out.println(" Perfect Number !");
	        else
	            System.out.println("Not Perfect Number !");;
	    }

	    public void primeNumber(int a) {
	        int flag=0;
	        for (int i=2;i<a;i++){
	            if (a%i==0){
	                flag=1;
	            }
	        }
	        if (flag==0)
	            System.out.println("Prime Number !");
	        else
	            System.out.println("Not Prime Number !");
	    }

	    public void reverseNumber(int a) {
	        int rem=0,rev=0;
	        while (a>0){
	            rem=(a%10);
	            rev=(rev*10)+rem;
	            a=(a/10);
	        }
	        System.out.println("Reverse of Entered Number : "+rev);
	    }

	    public void couponCodeGenrator(int couponLength, int couponNumber) {
	        for(int j = 0; j < couponNumber; ++j) {
	            String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
	            String randomString = "";
	            Random rand = new Random();
	            char[] text = new char[couponLength];

	            int i;
	            for(i = 0; i < couponLength; ++i) {
	                text[i] = characters.charAt(rand.nextInt(characters.length()));
	            }

	            for(i = 0; i < text.length; ++i) {
	                randomString = randomString + text[i];
	            }

	            System.out.println(randomString);
	        }

	    }

	    public void stopWatch(String input1) {

	        long start = System.currentTimeMillis();
	        if (input1.equals("start")) {
	            System.out.print("Type 'stop' to stop the stopwatch: ");
	            String stopStr = getStringInput().toLowerCase();
	            while (!stopStr.equals("stop")) {
	                System.out.print("Type 'stop' to stop the stopwatch: ");
	                stopStr = getStringInput().toLowerCase();
	            }
	            long stop = System.currentTimeMillis();
	            long timeElapsed =  stop - start;
	            System.out.println("Time = " + timeElapsed + " ms");
	        } else {
	            System.out.println("Wrong input.");
	        }
	    }
	    }





