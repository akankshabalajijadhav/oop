/*
Implement a robust Java calculator program that captures user input dynamically,
processes mathematical operations using conditional logic and looping constructs,
and ensures efficient error handling.
*/
import java.util.*;
class main {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
String ans = &quot;yes&quot;; // Initialize ans before while loop
while (ans.equalsIgnoreCase(&quot;yes&quot;) ||
ans.equalsIgnoreCase(&quot;y&quot;)) {
System.out.print(&quot;Enter the first number: &quot;);
int num1 = sc.nextInt();
System.out.print(&quot;Enter the second number: &quot;);
int num2 = sc.nextInt();
System.out.println(&quot;\n1. Addition&quot;);
System.out.println(&quot;2. Subtraction&quot;);
System.out.println(&quot;3. Multiplication&quot;);
System.out.println(&quot;4. Division&quot;);
System.out.println(&quot;5. Modulo&quot;);
System.out.print(&quot;Enter your choice: &quot;);
int ch = sc.nextInt();
int result;
switch (ch) {
case 1:
result = num1 + num2;
System.out.println(&quot;Addition is :- &quot; + result);
break;
case 2:

result = num1 - num2;
System.out.println(&quot;Subtraction is :- &quot; + result);
break;
case 3:
result = num1 * num2;
System.out.println(&quot;Multiplication is :- &quot; + result);
break;
case 4:
if (num2 != 0) {
result = num1 / num2;
System.out.println(&quot;Division is :- &quot; + result);
} else {
System.out.println(&quot;Arithmetic Exception: Cannot divide by zero.&quot;);
}
break;
case 5:
if (num2 != 0) {
result = num1 % num2;
System.out.println(&quot;Modulo is :- &quot; + result);
} else {
System.out.println(&quot;Arithmetic Exception: Cannot perform modulo by zero.&quot;);
}
break;
default:
System.out.println(&quot;Invalid choice&quot;);
}
System.out.print(&quot;\nDo you want to perform another operation (yes/no): &quot;);
ans = sc.next();
}
System.out.println(&quot;Thank you for using the calculator.&quot;);
sc.close();
}
}
