package ATM;
import java.util.*;
public class ATMOperations extends Main{
	CustomerDetails obj;
	Scanner sc=new Scanner(System.in);
	public ATMOperations() {
		System.out.println("-------------ATM Operations--------------");
	    System.out.println("1)Check Balance\n2)Withdraw Money\n3)Transfer Money\n4)Check ATM balance\n5)Deposit amount");
	    int ch=sc.nextInt();
	    switch(ch) {
	    case 1:
	    	checkBalance();
	    	break;
	    case 2:
	    	withdrawMoney();
	    	break;
	    case 3:
	    	transferMoney();
	    	break;
	    case 4:
	    	atmBalance();
	    	break;
	    case 5:
	    	DepositAmount();
	    	break;
	    }
	}
	void checkBalance() {
		System.out.println("Enter Secret Pin");
		int pin=sc.nextInt();
		for(CustomerDetails cd: d)  
		{  
			if(cd.getPin()==pin){
				System.out.println(cd.getBal());  
			}  
		}  	
	}
	void withdrawMoney() {
		System.out.println("Enter Secret Pin");
		int pin=sc.nextInt();
		for(CustomerDetails cd: d)  
		{  
			if(cd.getPin()==pin){
				obj=cd;
				int amt;
				int flag=1;
				do{
					System.out.println("Enter Amount Multiples of 100 and less than 10000:");
					amt=sc.nextInt();
					if(amt>=100&&amt<=10000 && amt%100==0) {
						flag=0;
					}
				}while(flag!=0);
				int _2000count=0,_500count=0,_100count=0;
				int amt_copy=amt;
				while(amt>=100){
					if(amt>=2000){
						_2000count++;
						amt-=2000;
					}
					else if(amt>=500&&amt<2000) {
						_500count++;
						amt-=500;
					}
					else if(amt>=100&&amt<500) {
			            _100count++;
			            amt-=100;
					}
				}
				cd.customercashupdate(obj,amt_copy, _2000count,_500count ,_100count);	 
			}		   
		}  	
	}
	void transferMoney() {
		System.out.println("Enter pin");
		int pin=sc.nextInt();
		for(CustomerDetails customerdeatail: d)  
		{  
			if(customerdeatail.getPin()==pin){
				CustomerDetails c=customerdeatail;
				moneyupdate(c);
			}
		}  		
	}
	void  moneyupdate(CustomerDetails obj) {
		System.out.println("Enter Account Holder Name:");
		System.out.println("Enter Account number to transfer:");
		int accno=sc.nextInt();
		for(CustomerDetails customerdeatail1: d){  
			if(customerdeatail1.getAcNo()==accno){
				int amt;
				do {
					System.out.println("Enter Amount less than 10000:");
					amt=sc.nextInt();
				}while(amt>10000);
				if(obj.Bal>=amt) {
					obj.Bal-=amt;
					customerdeatail1.Bal+=amt;
					System.out.println("Amount has been transfered successfully!");
				}
			}
		}
	}
	void atmBalance() {
		displayATMDenomenation();		
	}
	void DepositAmount() {
		System.out.println("Enter pin");
		int pin=sc.nextInt();
		for(CustomerDetails customerdeatail: d)  
		{  
			if(customerdeatail.getPin()==pin){
				System.out.println("Enter Amount to be Deposited:");
				int amount=sc.nextInt();
				customerdeatail.Bal+=amount;
			}
		}  		
	}
}
