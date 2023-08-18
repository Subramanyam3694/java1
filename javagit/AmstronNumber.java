package com.kn.ArrayTask;

public class AmstronNumber {
	public int amstrong(int n) {
		int sum=0,dig;
		dig=n%10;
		sum=sum+dig*dig*dig;
		return sum;
	}
	

}
