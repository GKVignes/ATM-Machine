package ATM;
import java.util.*;
public class Main {
		static List<CustomerDetails> d=new ArrayList<>();
		static Scanner sc=new Scanner(System.in);
		static LoadCash a=new LoadCash();
		public static void main(String[] args) {
			customerDetails();
			a.updateCash(20, 100, 100);
			int ch;
			do {
				System.out.println("-------------CustomerDetails&AtmProcess-------------");
				System.out.println("Enter 1 to Load Cash to ATM\nEnter 2 to check Atm Balance\nEnter 3 to know Customer Details\nEnter 4 to perform ATM Operations");
				ch=sc.nextInt();
				switch(ch) {
				case 1:
				    loadCash();
					break;
				case 2:
					displayATMDenomenation();
					break;
				case 3:
					displayDetails();
					break;
		 		case 4:
		 			ATMoperation();
		 			break;
		 		case 5:
		 		   break;
		 		 default:
		 			 System.out.println("Enter valid choice\n");
		 			 break;
				}
			}while(ch!=5);
		}
		static void ATMoperation() {
			
		}
		static void loadCash() {
			System.out.println("----------Load Cash---------");
		    System.out.println("Enter the count of rupees note:");
		    System.out.println("Enter count_2000");
		    int _2000=sc.nextInt();
		    System.out.println("Enter count_500");
		    int _500=sc.nextInt();
		    System.out.println("Enter count_100");
		    int _100=sc.nextInt();
		    a.updateCash(_2000,_500,_100);
		    displayATMDenomenation();
		}
		static void customerDetails() {
			CustomerDetails a1=new CustomerDetails(139,"Prince",2343,25234);
			CustomerDetails a2=new CustomerDetails(105,"Aravinth",5432,34123);
			CustomerDetails a3=new CustomerDetails(160,"Vignesh",7854,26100);
			CustomerDetails a4=new CustomerDetails(132,"Naresh",2345,80000);
			CustomerDetails a5=new CustomerDetails(146,"Sendhooran",1907,103400);
	        d.addAll(Arrays.asList(a1,a2,a3,a4,a5));
		}
	    static void displayDetails() {
	    	System.out.println("----------------------Customer Details---------------------");
			System.out.println("---------------------------------------------------------------");  
			System.out.printf("%8s %20s %12s %16s", "Acc No", "Account Holder", "Pin Number", "Account Balance");  
			System.out.println();  
			System.out.println("---------------------------------------------------------------");   
			for(CustomerDetails customerdeatail: d)  {  
				System.out.format("%7s %14s %14s %16s",customerdeatail.getAcNo(), customerdeatail.getHolderName(), customerdeatail.getPin(), customerdeatail.getBal());  
				System.out.println();  
			}  
			System.out.println("----------------------------------------------------------------");
			System.out.print("\n");
		}
	    static void displayATMDenomenation() {
	    	System.out.println("------------------Atm Balance-----------------");
			System.out.println("--------------------------------------------");  
			System.out.printf("%8s %12s %12s ", "Denomination", "Number", "Value");  
			System.out.println();  
			System.out.println("---------------------------------------------");  
			System.out.format("%7s %16s %12s ","2000", a.getNo_2000(),a.getTotal_2000());
			System.out.println();
			System.out.format("%7s %16s %12s ","500", a.getNo_500(),a.getTotal_500());  
			System.out.println();
			System.out.format("%7s %16s %12s ","100", a.getNo_100(),a.getTotal_100()); 
			System.out.println();
			System.out.println("---------------------------------------------- ");  
			System.out.print("\n");
	    }
}
