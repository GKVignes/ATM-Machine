package ATM;

public class LoadCash {
	int No_2000=0;
	int No_500=0;
	int No_100=0;
    int Total_2000=0;
	int Total_500=0;
 	int Total_100=0;
    int Bal=0;
	public void setNo_2000(int No_2000)
	{
		this.No_2000=No_2000;
	}
	public void setNo_500(int No_500)
	{
		this.No_500=No_500;
	}
	public void setNo_100(int No_100)
	{
		this.No_100=No_100;
	}
	public int getNo_2000()
	{
		return No_2000;
	}
	public int getNo_500()
	{
		return No_500;
	}
	public int getNo_100()
	{
		return No_100;
	}
	public int getTotal_2000()
	{
		Total_2000=No_2000*2000;
		return Total_2000;
	}
	public int getTotal_500()
	{
		Total_500=No_500*500;
		return Total_500;
	}
	public int getTotal_100()
	{
		Total_100=No_100*100;
		return Total_100;
	}
	public int getBal()
	{
		Bal=Total_2000+Total_500+Total_100;
		return Bal;
	}
	public void updateCash(int No_2000,int No_500,int No_100)
	{
		this.No_2000+=No_2000;
		this.No_500+=No_500;
		this.No_100+=No_100;
		Total_2000+=No_2000*2000;
		Total_500+=No_500*500;
		Total_100+=No_100*100;
		Bal=Total_2000+Total_500+Total_100;
	}
	public boolean updateWithdraw(int Amt,int No_2000,int No_500,int No_100)
	{
		if(No_2000<=this.No_2000&&No_500<=this.No_500&&No_100<=this.No_100)
		{
			this.No_2000-=No_2000;
			this.No_500-=No_500;
			this.No_100-=No_100;
			Total_2000=this.No_2000*2000;
			Total_500=this.No_500*500;
			Total_100=this.No_100*100;
			Bal-=Amt;
			return true;
		}
		return false;
	}
}
