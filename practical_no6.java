/*Develop a Java program for simulation of any real time application with required
functionalities. For eg. ATM machine with functionalities like checking account balance,
withdrawing, and depositing money. Use try, catch, and finally blocks to handle potential
exceptions such as insufficient funds (throwing ArithmeticException) and invalid input
(throwing IllegalArgumentException). Ensure that the application continues to run
smoothly after handling exceptions.
*/

public class ATM
{
int balance=5000;
int withdrawing=400;
int depositing=500;
void withdraw()
{
if(withdrawing&gt;balance)
{
throw new ArithmeticException(&quot;Insufficient funds&quot;);
}
balance=balance-withdrawing;
System.out.println(&quot;Withdrawal amount is:-&quot;+withdrawing);
System.out.println(&quot;Total Balance is:-&quot;+balance);
}
void deposit()
{
balance=balance+depositing;
System.out.println(&quot;Deposit amount is:-&quot;+depositing);
System.out.println(&quot;Total Balance is:-&quot;+balance);
}
public static void main(String args[])
{
ATM a=new ATM();
try
{
a.withdraw();
a.deposit();

}
catch(ArithmeticException e)
{
System.out.println(&quot;Error:-&quot;+e.getMessage());
}
catch(IllegalArgumentException e)
{
System.out.println(&quot;Error:-&quot;+e.getMessage());
}
finally
{
System.out.println(&quot;Thank you for using ATM&quot;);
}
}
}
