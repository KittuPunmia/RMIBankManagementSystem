import java.rmi.*;
import java.util.ArrayList;
public interface Inter extends Remote
{  
	public int[] accnoshow() throws RemoteException;
public String[] acctypeshow() throws RemoteException;
public ArrayList<ArrayList<Integer>> accamountshow() throws RemoteException;
public int withdraw(int withdrawamount,int Useriteration) throws RemoteException;
	public int deposit(int depositamount,int Useriteration) throws RemoteException;
 public ArrayList<ArrayList<Integer>> transaction() throws RemoteException;



}
