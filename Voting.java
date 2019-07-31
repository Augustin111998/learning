import java.util.Scanner;
public class Voting
{
	public static void displayResult()
	{
		@SuppressWarnings("resource")
		Scanner asa = new Scanner(System.in);

	float total=a + b + c;
System.out.println("\nPRESIDENTIAL ELECTION");
System.out.println("Candidates\tResult\t% of Total Votes");
System.out.println("\nA: jeyalalitha\t" + a + "\t" + a/total * 100);
System.out.println("B: karunanithi\t" + b + "\t" + b/total * 100);
System.out.println("C: vijay\t\t" + c + "\t" + c/total * 100);
System.out.println("\nTOTAL VOTES: " + total);
String winner="";
if(a>b && a>c)
winner="jeyalalitha";
if(b>a && b>c)
winner="karunanithi";
if(c>a && c>b)
winner="";
System.out.println("\nAnd the winner is: " + winner);
System.out.println("----------------------");
System.out.println("Type V-vote, R-result, Q-quit");
System.out.print("Enter your choice: ");
choice = asa.nextLine();
	}
	
	
	public static void displayVote()
	{
		@SuppressWarnings("resource")
		Scanner asa = new Scanner(System.in);
		System.out.print("Enter your vote: ");
candid = asa.next();
candidcode = candid.charAt(0);
switch(candidcode)
{
case 'A':
case 'a': a++; break;
case 'B':
case 'b': b++; break;
case 'C': 
case 'c': c++; break;
default: System.out.println("Invalid candidates code");
}

	}
	
	
	
static	String choice, candid;
static char candidcode;
static int a=0, b=0, c=0;	
	
	
public static void main( String[] args )
{ 
@SuppressWarnings("resource")
Scanner asa = new Scanner(System.in);

do
{
System.out.println("\nPRESIDENTIAL ELECTION");
System.out.println("Candidates");
System.out.println("\nA: jeyalalitha");
System.out.println("B: karunanithi");
System.out.println("C:vijay");
System.out.println("----------------------");
System.out.println("Type V-vote, R-result, Q-quit");
System.out.print("Enter your choice: ");
choice = asa.nextLine();



if(choice.equalsIgnoreCase("V"))
{
displayVote();

}



if(choice.equalsIgnoreCase("R"))
{
displayResult();
} 
}
while(!(choice.equalsIgnoreCase("Q"))); 
}
}
