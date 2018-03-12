import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

public class Implement extends UnicastRemoteObject implements Inter
{
private static ArrayList<ArrayList<Integer>> amount=new ArrayList<ArrayList<Integer>>();

private static int accno[]={101,102,103,104,105,106,107};
private static String []acctype={"S","C","S","C","S","C","S"};
int currentamount;
     
	int Useriteration=0;			

	public Implement() throws RemoteException
	{

	 
	}
public int[] accnoshow()
	{
		
		return accno ;
	}
	public ArrayList<ArrayList<Integer>> accamountshow()
	{
	 amount.add(new ArrayList<Integer>());
      amount.add(new ArrayList<Integer>());
      amount.add(new ArrayList<Integer>());
	amount.add(new ArrayList<Integer>());
	amount.add(new ArrayList<Integer>());
	amount.add(new ArrayList<Integer>());
	amount.add(new ArrayList<Integer>());
	amount.get(0).add(2000);
	amount.get(1).add(12000);
	amount.get(2).add(20000);
	amount.get(3).add(2100);
	amount.get(4).add(1000);
	amount.get(5).add(15000);
	amount.get(6).add(56600);
		
      
		return amount ;
	}


	public String[] acctypeshow()
	{
		 
		return acctype;
	}
	public int withdraw(int withdrawamount,int Useriteration)
	{
    
currentamount=amount.get(Useriteration).get(amount.get(Useriteration).size()-1);
		amount.get(Useriteration).add(currentamount-withdrawamount);
		return (currentamount-withdrawamount);
	}
	
	public int deposit(int depositamount,int Useriteration)
	{
    
currentamount=amount.get(Useriteration).get(amount.get(Useriteration).size()-1);
		amount.get(Useriteration).add(currentamount+depositamount);
		return (currentamount+depositamount);
	}
public ArrayList<ArrayList<Integer>> transaction()
{
	return amount;
}

	
}