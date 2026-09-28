/*Create a Java program demonstrating single inheritance where a subclass extends a
superclass and calls its methods.
*/
import java.util.Scanner;
import java.util.*;
class superclass{
Scanner sc=new Scanner(System.in);
void departmentinfo()
{

System.out.println(&quot;Enter your Department name&quot;);
String deptname =sc.next();
System.out.println(&quot;name of department is:-&quot;+deptname);
}
}
class subclass extends superclass{
void studentinfo()
{

System.out.println(&quot;Enter Student RollNo&quot;);
int rollno=sc.nextInt();
System.out.println(&quot; Student RollNo is&quot;+rollno);

}

}
public class Main {
public static void main(String[] args)
{

subclass s=new subclass();
s.studentinfo();
s.departmentinfo();
}
}
