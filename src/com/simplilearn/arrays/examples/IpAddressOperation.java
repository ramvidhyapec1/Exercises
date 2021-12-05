package com.simplilearn.arrays.examples;

public class IpAddressOperation {

	public static void main(String[] args) {
		// TODO AWP for ip address find along with status check
		// hint : Tow String arrays ips =["192.12.13.01"], status=["active","inactive"]
		String[] ips= {"192.12.13.01","192.12.13.02","192.12.13.03","192.12.13.04"};
		String[] status= {"active","Inactive"};
		for (String string : ips) {
			for (String string2 : status) {
				System.out.println(string+" :"+string2);		
			}
			
		}
	}

}
