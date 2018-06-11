import java.util.*;
import java.io.*;
class Troubleshooter
{	
	String str;int a; char choice;
	int opt;
	String space="";
	String s;
	String comp=" ";
	public static void main(String args[])throws IOException
	{	
		System.out.println("*****Welcome to the troubleshooter*****");
		Troubleshooter tr=new Troubleshooter();
		tr.userGuide();
		for(int i=1;i<4;i++)
		{
			System.out.println();
		}
		Scanner sc=new Scanner(System.in);
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("The user to please input his title ( technician or teacher)");
		String title=br.readLine();
		String title1="technician";
		String title2="teacher";
		if(title.equalsIgnoreCase(title1))
		{
			tr.technician();
		}
		else if(title.equalsIgnoreCase(title2))
		{
			tr.teacher();
		}
		else
		{
			System.out.println("Wrong Input\nThe Program will exit now");
			System.exit(0);
		}
	}
	public void technician()throws IOException
	{
		Troubleshooter tr=new Troubleshooter();
		Scanner sc=new Scanner(System.in);
		int sLab,jLab,kLab,acc,lib,av,off,spor;
		System.out.println("Enter a to view the complaint log from the senior computer lab");
		System.out.println("Enter b to view the complaint log from the junior computer lab");
		System.out.println("Enter c to view the complaint log from the kindergarden computer lab");
		System.out.println("Enter d to view the complaint log from the user in the Accounts Section");
		System.out.println("Enter e to view the complaint log from the user in the Library");
		System.out.println("Enter f to view the complaint log from the user in the AV Room");
		System.out.println("Enter g to view the complaint log from the user in the office section ");
		System.out.println("Enter h to view the complaint log from the user in the sports room ");
		System.out.println("Enter i to enter the comment");
		choice=sc.next().charAt(0);
		switch(choice)
		{
			case 'a':
			{
				FileReader fr=new FileReader("Problem_List1.txt");
				BufferedReader br=new BufferedReader(fr);
				while((s = br.readLine()) != null)
					{
						System.out.println(s);
					}
				fr.close(); 
				break;
			}
			case'b':
			{
				FileReader fr=new FileReader("Problem_List2.txt");
				BufferedReader br=new BufferedReader(fr);
				while((s = br.readLine()) != null)  
				System.out.println(s); 
			fr.close();
			break;
			}
			case'c':
			{
				
				FileReader fr=new FileReader("Problem_List3.txt");
				BufferedReader br=new BufferedReader(fr);
				while((s = br.readLine()) != null) 
					System.out.println(s); 
				fr.close();
				break;
			}
			case'd':
			{
				FileReader fr=new FileReader("Problem_List4.txt");
				BufferedReader br=new BufferedReader(fr);
				while((s = br.readLine()) != null) 
					System.out.println(s); 
				fr.close();
				break;
			}
			case'e':
			{
				
				FileReader fr=new FileReader("Problem_List5.txt");
				BufferedReader br=new BufferedReader(fr);
				while((s = br.readLine()) != null) 
				System.out.println(s); 
				fr.close();
				break;
			}
				case'f':
			{
				
				FileReader fr=new FileReader("Problem_List6.txt");
				BufferedReader br=new BufferedReader(fr);
				while((s = br.readLine()) != null) 
				System.out.println(s); 
				fr.close();
				break;
			}
			case'g':
			{
				System.out.println("Enter the number of computers ");
				off=sc.nextInt();
				FileReader fr=new FileReader("Problem_List7.txt");
				BufferedReader br=new BufferedReader(fr);
				while((s = br.readLine()) != null) 
				System.out.println(s); 
				fr.close();
				break;
			}
			case'h':
			{
				System.out.println("Enter the number of computers ");
				spor=sc.nextInt();
				FileReader fr=new FileReader("Problem_List8.txt");
				BufferedReader br=new BufferedReader(fr);
				while((s = br.readLine()) != null) 
				System.out.println(s); 
				fr.close();
				break;
			}
				case'i':
			{
				System.out.println("Enter the comment please");
				String comment=sc.nextLine();
				FileWriter fw=new FileWriter("Comments.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				fw.write(comment);
				fw.close();
			}
				
		}
		System.out.println("Thank you for using Troubleshooter\nGoodbye!!!");
	}
	public void teacher()throws IOException
	{
		Troubleshooter tr=new Troubleshooter();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Senior Computer Lab\n2.Junior Computer Lab\n3.Kindergarten Section\n4.A.V.Room");
		System.out.println("5.Accounts section\n6.Library\n7.Office section\n8.Sports room\n9.Read comments");
		System.out.println("Please enter the number as to the location of the computer");
		opt=sc.nextInt();
		switch(opt)
		{
			case 1:
			{
				
				tr.SCLab();
				break;
			}
			case 2:
			{
				
				tr.JCLab();
				break;
				}
			case 3:
			{
				
				tr.KS();
				break;
			}
			case 4:
			{
				
				tr.AV();
				break;
			}
			case 5:
			{
				
				tr.Accounts();
				break;
			}
			case 6:
			{
				
				tr.Library();
				break;
			}
			case 7:
			{
				
				tr.Office();
				break;
			}
			case 8:
			{
				
				tr.Sports();
				break;
			}
			case 9:
			{
				FileReader fr=new FileReader("Comments.txt");
				BufferedReader br=new BufferedReader(fr);
				while((s = br.readLine()) != null) 
				System.out.println(s); 
				fr.close();
				break;
			}
			default:
			{
				System.out.println("The choice does not match with the index numbers");
				System.out.println("The program will exit now");
				System.exit(0);
			}	
		}
	}
		public void SCLab()throws IOException
		{
			Scanner sc=new Scanner(System.in);
			Troubleshooter tr=new Troubleshooter();
			System.out.println("Please enter the password");
			String password="Goldeneye";
			String s=sc.next();
			if(s.equalsIgnoreCase(password))
			{
				System.out.println("Password accepted");
			}
			else
			{
				System.out.println("Wrong Password\nProgram will terminate now");
				System.exit(0);
			}
			System.out.println("Enter the index number of the computer");
			int a=sc.nextInt();
			if(a<0 || a>51)
			{
				System.out.println("There is no computer in position "+a);
				System.out.println("Program will exit now");
				System.exit(0);
			}
			System.out.println("Please specify if problem is software or hardware");
			System.out.println("'s' for software and 'h' for hardware");
			char ch=sc.next().charAt(0);
			String details="Senior Computer Lab";
			if(ch=='s')
			{
				tr.softwareProb(a,details);
			}
			else if(ch=='h')
			{
				tr.hardwareProb(a,details);
			}
			else
			{
				System.out.println("Wrong input\nProgram will exit now");
				System.exit(0);
			}
			System.out.println("Your problem has saved in the file");
			System.out.println("The program will exit now");
			System.out.println("Thank You\n Goodbye!!!");
			
		}
		public void Sports()throws IOException
		{
			Scanner sc=new Scanner(System.in);
			Troubleshooter tr=new Troubleshooter();
			System.out.println("******Welcome to the Troubleshooter******");
			System.out.println("Please enter the password");
			String password="Goldeneye";
			String s=sc.next();
			if(s.equalsIgnoreCase(password))
			{
				System.out.println("Password accepted");
			}
			else
			{
				System.out.println("Wrong Password\nProgram will terminate now");
				System.exit(0);
			}
			System.out.println("Enter the index number of the computer");
			int a=sc.nextInt();
			if(a<0 || a>2)
			{
				System.out.println("There is no computer in position "+a);
				System.out.println("Program will exit now");
				System.exit(0);
			}
			System.out.println("Please specify if problem is software or hardware");
			System.out.println("'s' for software and 'h' for hardware");
			char ch=sc.next().charAt(0);
			String details="Sports Room";
			if(ch=='s')
			{
				tr.softwareProb(a,details);
			}
			else if(ch=='h')
			{
				tr.hardwareProb(a,details);
			}
			else
			{
				System.out.println("Wrong input\nProgram will exit now");
				System.exit(0);
			}
			System.out.println("Your problem has saved in the file");
			System.out.println("The program will exit now");
			System.out.println("Thank You\n Goodbye!!!");
		}
		public void Office()throws IOException
		{
			Scanner sc=new Scanner(System.in);
			Troubleshooter tr=new Troubleshooter();
			System.out.println("******Welcome to the Troubleshooter******");
			System.out.println("Please enter the password");
			String password="Goldeneye";
			String s=sc.next();
			if(s.equalsIgnoreCase(password))
			{
				System.out.println("Password accepted");
			}
			else
			{
				System.out.println("Wrong Password\nProgram will terminate now");
				System.exit(0);
			}
			System.out.println("Enter the index number of the computer");
		 a=sc.nextInt();
			if(a<0 || a>10)
			{
				System.out.println("There is no computer in position "+a);
				System.out.println("Program will exit now");
				System.exit(0);
			}
			System.out.println("Please specify if problem is software or hardware");
			System.out.println("'s' for software and 'h' for hardware");
			char ch=sc.next().charAt(0);
			String details="Office";
			if(ch=='s')
			{
				tr.softwareProb(a,details);
			}
			else if(ch=='h')
			{
				tr.hardwareProb(a,details);
			}
			else
			{
				System.out.println("Wrong input\nProgram will exit now");
				System.exit(0);
			}
			System.out.println("Your problem has saved in the file");
			System.out.println("The program will exit now");
			System.out.println("Thank You\n Goodbye!!!");
		}
		public void AV()throws IOException
		{
			Scanner sc=new Scanner(System.in);
			Troubleshooter tr=new Troubleshooter();
			System.out.println("******Welcome to the Troubleshooter******");
			System.out.println("Please enter the password");
			String password="Goldeneye";
			String s=sc.next();
			if(s.equalsIgnoreCase(password))
			{
				System.out.println("Password accepted");
			}
			else
			{
				System.out.println("Wrong Password\nProgram will terminate now");
				System.exit(0);
			}
			System.out.println("Please specify if problem is software or hardware");
			System.out.println("'s' for software and 'h' for hardware");
			char ch=sc.next().charAt(0);
			String details="A.V. Room";
			if(ch=='s')
			{
				tr.softwareProb(a,details);
			}
			else if(ch=='h')
			{
				tr.hardwareProb(a,details);
			}
			else
			{
				System.out.println("Wrong input\nProgram will exit now");
				System.exit(0);
			}
			System.out.println("Your problem has saved in the file");
			System.out.println("The program will exit now");
			System.out.println("Thank You\n Goodbye!!!");
		}
		public void Library()throws IOException
		{
			Scanner sc=new Scanner(System.in);
			Troubleshooter tr=new Troubleshooter();
			System.out.println("******Welcome to the Troubleshooter******");
			System.out.println("Please enter the password");
			String password="Goldeneye";
			String s=sc.next();
			if(s.equalsIgnoreCase(password))
			{
				System.out.println("Password accepted");
			}
			else
			{
				System.out.println("Wrong Password\nProgram will terminate now");
				System.exit(0);
			}
			System.out.println("Enter the index number of the computer");
			int a=sc.nextInt();
			String details="Library";
			if(a<0 || a>3)
			{
				System.out.println("There is no computer in position "+a);
				System.out.println("Program will exit now");
				System.exit(0);
			}
			System.out.println("Please specify if problem is software or hardware");
			System.out.println("'s' for software and 'h' for hardware");
			char ch=sc.next().charAt(0);
			if(ch=='s')
			{
				tr.softwareProb(a,details);
			}
			else if(ch=='h')
			{
				tr.hardwareProb(a,details);
			}
			else
			{
				System.out.println("Wrong input\nProgram will exit now");
				System.exit(0);
			}
			System.out.println("Your problem has saved in the file");
			System.out.println("The program will exit now");
			System.out.println("Thank You\n Goodbye!!!");
		}
		public void Accounts()throws IOException
		{
			Scanner sc=new Scanner(System.in);
			Troubleshooter tr=new Troubleshooter();
			System.out.println("******Welcome to the Troubleshooter******");
			System.out.println("Please enter the password");
			String password="Goldeneye";
			String s=sc.next();
			if(s.equalsIgnoreCase(password))
			{
				System.out.println("Password accepted");
			}
			else
			{
				System.out.println("Wrong Password\nProgram will terminate now");
				System.exit(0);
			}
			System.out.println("Enter the index number of the computer");
			int a=sc.nextInt();
			if(a<0 || a>3)
			{
				System.out.println("There is no computer in position "+a);
				System.out.println("Program will exit now");
				System.exit(0);
			}
			System.out.println("Please specify if problem is software or hardware");
			System.out.println("'s' for software and 'h' for hardware");
			char ch=sc.next().charAt(0);
			String details="Accounts";
			if(ch=='s')
			{
				tr.softwareProb(a,details);
			}
			else if(ch=='h')
			{
				tr.hardwareProb(a,details);
			}
			else
			{
				System.out.println("Wrong input\nProgram will exit now");
				System.exit(0);
			}
			System.out.println("Your problem has saved in the file");
			System.out.println("The program will exit now");
			System.out.println("Thank You\n Goodbye!!!");
		}
		public void JCLab()throws IOException
		{
			Scanner sc=new Scanner(System.in);
			Troubleshooter tr=new Troubleshooter();
			System.out.println("******Welcome to the Troubleshooter******");
			System.out.println("Please enter the password");
			String password="Goldeneye";
			String s=sc.next();
			if(s.equalsIgnoreCase(password))
			{
				System.out.println("Password accepted");
			}
			else
			{
				System.out.println("Wrong Password\nProgram will terminate now");
				System.exit(0);
			}
			System.out.println("Enter the index number of the computer");
			int a=sc.nextInt();
			if(a<0 || a>51)
			{
				System.out.println("There is no computer in position "+a);
				System.out.println("Program will exit now");
				System.exit(0);
			}
			System.out.println("Please specify if problem is software or hardware");
			System.out.println("'s' for software and 'h' for hardware");
			char ch=sc.next().charAt(0);
			String details="Junior Computer Lab";
			if(ch=='s')
			{
				tr.softwareProb(a,details);
			}
			else if(ch=='h')
			{
				tr.hardwareProb(a,details);
			}
			else
			{
				System.out.println("Wrong input\nProgram will exit now");
				System.exit(0);
			}
			System.out.println("Your problem has saved in the file");
			System.out.println("The program will exit now");
			System.out.println("Thank You\n Goodbye!!!");
		}
		public void KS()throws IOException
		{
			Scanner sc=new Scanner(System.in);
			Troubleshooter tr=new Troubleshooter();
			System.out.println("******Welcome to the Troubleshooter******");
			System.out.println("Please enter the password");
			String password="Goldeneye";
			String s=sc.next();
			if(s.equalsIgnoreCase(password))
			{
				System.out.println("Password accepted");
			}
			else
			{
				System.out.println("Wrong Password\nProgram will terminate now");
				System.exit(0);
			}
			System.out.println("Enter the index number of the computer");
			int a=sc.nextInt();
			if(a<0 || a>51)
			{
				System.out.println("There is no computer in position "+a);
				System.out.println("Program will exit now");
				System.exit(0);
			}
			System.out.println("Please specify if problem is software or hardware");
			System.out.println("'s' for software and 'h' for hardware");
			char ch=sc.next().charAt(0);
			String details="Kindergarten Section";
			if(ch=='s')
			{
				tr.softwareProb(a,details);
			}
			else if(ch=='h')
			{
				tr.hardwareProb(a,details);
			}
			else
			{
				System.out.println("Wrong input");
				System.exit(0);
			}
			System.out.println("Your problem has saved in the file");
			System.out.println("The program will exit now");
			System.out.println("Thank You\n Goodbye!!!");
		}
		public void softwareProb(int z,String detail)throws IOException
	{
			Scanner sc=new Scanner(System.in);			
			Troubleshooter tr=new Troubleshooter();
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			System.out.println("Enter a to add a complaint \n b to remove a complaint \n c to view the complaints");
			choice=sc.next().charAt(0);
			String comp=" ";
			if(choice=='a')
		{
			System.out.println("Enter the problem");
			str=br.readLine();
			System.out.println("Enter the complaint number");
			int num=sc.nextInt();
			String cNum=Integer.toString(num);
			String s2=" , Computer number "+z+" ,";
			String hp=" Software Problem :";
			String complaint=cNum +") Complaint number, " ;
			comp=complaint;
			System.out.println("Enter the filename along with the extension(.txt)" );	
			String fn=sc.next();
			int i=0;
			tr.lineByLine(complaint,fn,i);
			tr.lineByLine(detail,fn,i);
			tr.lineByLine(s2,fn,i);
			tr.lineByLine(hp,fn,i);
			i=1;
			tr.lineByLine(str,fn,i);
		}
			else if(choice=='b')
		{
			//String s1=this.comp;
			tr.remove(comp);
		}
			else if(choice=='c')
		{
			tr.view();
		}	
	}
		
		public void hardwareProb(int z,String detail) throws IOException
	{
			Scanner sc=new Scanner(System.in);
			Troubleshooter tr=new Troubleshooter();
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			System.out.println("Enter a to add a complaint \n b to remove a complaint \n c to view the complaints");
			choice=sc.next().charAt(0);
			String comp=" ";
			if(choice=='a')
		{
			System.out.println("Enter the problem");
			str=br.readLine();
			System.out.println("Enter the complaint number");
			int num=sc.nextInt();
			String cNum=Integer.toString(num);
			String s2=" , Computer number "+z+" ,";
			String hp=" Hardware Problem :";
			String complaint=cNum +") Complaint number, " ;
			comp=complaint;
			System.out.println("Enter the filename along with the extension(.txt)" );	
			String fn=sc.next();
			int i=0;
			tr.lineByLine(complaint,fn,i);
			tr.lineByLine(detail,fn,i);
			tr.lineByLine(s2,fn,i);
			tr.lineByLine(hp,fn,i);
			i=1;
			tr.lineByLine(str,fn,i);
		}
			else if(choice=='b')
		{
			//String s1=this.comp;
			tr.remove(comp);
		}
			else if(choice=='c')
		{
			tr.view();
		}	
	}
		public void lineByLine(String n,String f,int j)throws IOException
		{
			Scanner sc=new Scanner(System.in);
			FileWriter fw=new FileWriter(f,true);
			BufferedWriter bw=new BufferedWriter(fw);
			//bw.newLine();
			bw.write(n);
			if(j==1)
			{
				bw.newLine();
			}
			//fw.close();
			bw.close();
		}	
			void remove(String s10) throws IOException
{		 
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the filename along with the extension(.txt)" );	
			String fn=sc.next();
			FileWriter fw=new FileWriter(fn,true);
			BufferedWriter bw=new BufferedWriter(fw);
			FileReader fr=new FileReader(fn);
			BufferedReader br=new BufferedReader(fr);
			System.out.println("Enter the number of complaints solved");
			int sol=sc.nextInt();
			for(int i=1;i<=sol;i++)
		{
				System.out.println("Enter the complaint number");
				int com=sc.nextInt();
				String con=Integer.toString(com);
				con="Problem no "+con;
				for(int k=1;k<=com;k++)
				{
				if(( s=br.readLine())!=null)
				{		
					
					   String solved=" $0LVED";
					   String old=con+" "+solved;
					   fw.write(old);
					   bw.newLine();
					   bw.close();
					   fw.close();
					  
				}	
				}		
		}				fw.close();
						fr.close();

}					void view() throws IOException
		{
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter the filename along with the extension(.txt)" );	
					String fn=sc.next();
					FileReader fr=new FileReader(fn);
						BufferedReader br=new BufferedReader(fr);
						while((s=br.readLine()) !=null)
				{		
						System.out.println(s);
				}
							
		}
		
	void userGuide()
				{
					System.out.println("\t Guide for the technician \n  You have to specify your options in small case i.e a,b etc \n   wrong choice causes the program to exit \n \t General Guide for the teacher or office staff \n Remove the word wrap feature in your text editor \n Add the problems with the complaint and computer number \n First enter the complaint number and then the computer number \n Do not give the same complaint number\n Any wrong choice causes the program to exit. ");
					System.out.println(" Guide for the Senior lab user: Your filename is Problem_List1.txt");
					System.out.println(" Guide for the Junior lab user: Your filename is Problem_List2.txt");
					System.out.println(" Guide for the Kindergarden lab user: Your filename is Problem_List3.txt");
					System.out.println(" Guide for the Accounts section user: Your filename is Problem_List4.txt");
					System.out.println(" Guide for the Library user: Your filename is Problem_List5.txt");
					System.out.println(" Guide for the AV room user: Your filename is Problem_List6.txt");
					System.out.println(" Guide for the Office Section user: Your filename is Problem_List7.txt");
					System.out.println(" Guide for the Sports room user: Your filename is Problem_List8.txt");
					System.out.println("\n");
					System.out.println("If the file name is entered other than what is specified it causes inconvinience to the technician. Please type the filename that is specified for the particulur user when you are asked to type the file name");
					
			}
}
		