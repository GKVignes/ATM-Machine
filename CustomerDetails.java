package ATM;

public class CustomerDetails {
	   int AcNo;
	   String HolderName;
	   int Pin;
	   int Bal;
	   public CustomerDetails()
	   {
	   
	   }
	   public CustomerDetails(int AcNo,String HolderName, int Pin, int Bal)
	   {
	       this.AcNo=AcNo;
	       this.HolderName=HolderName;
	       this.Pin=Pin;
	       this.Bal=Bal;
	   }
	   public void setAcNo(int AcNo)
	   {
	       this.AcNo=AcNo;
	   }
	   public int getAcNo()
	   {
	       return AcNo;
	   }
	   public void setHolderName(String HolderName)
	   {
		   this.HolderName=HolderName;
	   }
	   public String getHolderName()
	   {
		   return HolderName;
	   }
	   public void setPin(int Pin)
	   {
		   this.Pin=Pin;
	   }
	   public int getPin()
	   {
		   return Pin;
	   }
	   public void setBal(int Bal)
	   {
		   this.Bal=Bal;
	   }
	   public int getBal()
	   {
	        return Bal;
	   }
	   public void updateBalance(int Amt)
	   {
		   Bal-=Amt;
	   }
	   static LoadCash a12=new LoadCash();
	   void customercashupdate(CustomerDetails obj,int Amt,int No_2000,int No_500,int No_100) 
	   {
			if(Amt<=obj.Bal) 
			{
	    		if(a12.updateWithdraw(Amt,No_2000,No_500,No_100)) {
	    		  obj.updateBalance(Amt);
	    		} 
	    		else {
	    			System.out.println("Sorry! Atm Balance Is Low");
	    		}
	    	}
	    	else {
	    		System.out.println("Sorry! Your Account Balance Is Low");
	    	}
		}
		public String toString() {
			return  AcNo + HolderName + Pin + Bal;
		}
}
