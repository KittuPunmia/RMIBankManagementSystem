import java.rmi.Naming;
import java.util.*;
public class Client
{
	public static void main(String args[])
	{
		try
		{
			Inter ai=(Inter)Naming.lookup("//localhost/Implement");
			String name;
			int no;
			int ch;
			String type="C";
            int count=0,l=0;
            int c;
            int Useriteration=0;
			String acctype[]=new String[7];
			int accno[]=new int[7];
            int remainingbal;
			ArrayList<ArrayList<Integer>> accamount=new ArrayList<ArrayList<Integer>>();

			accno=ai.accnoshow();
			acctype=ai.acctypeshow();
			accamount=ai.accamountshow();


			Scanner s= new Scanner(System.in);
			System.out.println("\n\nPlease provide your details to Login");
			System.out.println("Enter your name:");
			name=s.nextLine();
			System.out.println("Enter Account Type:");
			type=s.nextLine();
			System.out.println("Enter Account No:");
			no=s.nextInt();
			
           for(l=0;l<accno.length;l++)
			{
                 if(accno[l]==no)
                 { 
                     if(type.equals(acctype[l]))
                             {
					System.out.println("You have successfully logged in. Enjoy shopping");			
					count=1	;
					Useriteration=l;	
				     }
			    }
            }
							
					if(count==1)
					{

						System.out.println("1.Show Balance");
								System.out.println("2.Withdraw Money");
								System.out.println("3.Deposit Money");
								System.out.println("4.Transaction details");
								System.out.println("5.Log Out");
								
					do
								{
									System.out.println("Enter your choice(i.e 1 or 2 or 3 or 4or 5)");
									ch=s.nextInt();
									switch(ch)
									{
										case 1:System.out.println("Account no  "+accno[Useriteration]+" Account Type  "+acctype[Useriteration]
                                                                                        +" Balance  "+accamount.get(Useriteration).get(accamount.get(Useriteration).size()-1)+"\n");
										 		
												break;
										case 2: System.out.println("How much money do u want to withdraw");
												c=s.nextInt();
												remainingbal=ai.withdraw(c,Useriteration);
												System.out.println("Account no   "+accno[Useriteration]+" Account Type  "+acctype[Useriteration]+
													" Remaning Balance  "+remainingbal+"\n");
												break;
										case 3:
										System.out.println("How much money do u want to Deposit");
												c=s.nextInt();
												remainingbal=ai.deposit(c,Useriteration);
												System.out.println("Account no  "+accno[Useriteration]+" Account Type   "+acctype[Useriteration]+
													" Balance  "+remainingbal+"\n");
												 break;
										case 4: 
										          accamount=ai.transaction();
										          System.out.println(accamount.get(Useriteration));
												break;
										case 5: System.out.println(name+" thank You for Visiting\n");
												break;
									}
								}while(ch!=5);
					}
else
{
	System.out.println("Invalid Login");
}
		}
		catch(Exception e)
		{
			System.out.println("Client Exception: "+e);
		}
	}
}