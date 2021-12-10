package com.simplilearn.innerclass;

import java.util.Scanner;

public class BankSystem {
	
	class Finance {
		// properties & methods
		//Balance in the account
		//cust id
		//cust name
		//withdrawal amount --> Balance after that
		//deposit anount --> Balance after that
		String custId, custName;
		double balance,withdrawAmount, depositAmount;
		Finance(String CustId, String CustName,double Balance){
			this.custId=CustId;
			this.custName=CustName;
			this.balance=Balance;
			System.out.println("Customer id is "+custId);
			System.out.println("Customer id is "+custName);
			System.out.println("Balance is "+balance);
		};
		public double withdrawal(){
			double withdrawalamount;
			withdrawal();{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the amount to withdraw : ");
				withdrawalamount=sc.nextDouble();
				balance=balance-withdrawalamount;
				return balance;
			}	
			
		}
		
	}
	
	class Insurance {
		//Data members
		//premium, Insured amount, deductible,Type of policy
		public double premium,insuredAmount, deductible;
		public String typeOfPolicy;
		//Methods
		double CalculatePremium(){
			if (typeOfPolicy.equalsIgnoreCase("Regular")) {
				return premium=10000.00;
			}
			else if (typeOfPolicy.equalsIgnoreCase("VIP")) {
				return premium=20000.00;
			}
			return premium;
		};
		
	}
	
	class Loans {
		// data members
		double principle;
		int years, interestpercent;
		//method
		void interest(double principle, int interestpercent, int years) {
			this.interestpercent=interestpercent;
			this.principle=principle;
			this.years=years;
			double interestearned = principle * years * interestpercent ;
			System.out.println("Interest earned is "+interestearned);
			System.out.println("Total balance is "+(principle+interestearned));
			
		}
	}
	
	class Lockers {
		//Data members
		//Locker type = 'Single' 'Double'
		//Account type = 'Single account' 
		//Status = 'Active' 'Inactive'
		//Methods
		//if locker type is single , per year rent is 1000
		//if locker type is double, per year rent is 5000
		
		String[] lockerType={"Single", "Double"};
		String[] accountType= {"Single", "Multiple"};
		String[] statusOfLocker= {"Active", "Not active"};
		double rent;
		double calculateRent(String lockertype) {
			if (lockertype.equals("Single")) {
				rent=1000;
				}
			else if (lockertype.equals("Double")) {
				rent=5000;
			}
			return rent;
		}
		
	
		
	}
}
