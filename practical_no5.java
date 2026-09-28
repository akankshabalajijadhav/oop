/*Implement Multiple Inheritance using interface in Java to demonstrate polymorphism.
*/

import java.util.Scanner;
interface Department {
void departmentInfo();
}
interface Teacher {
void teacherInfo();
}
interface Student extends Department, Teacher {
void studentInfo();
}
class Person implements Student {
private Scanner sc = new Scanner(System.in);
@Override
public void departmentInfo() {
System.out.print(&quot;Enter your Department name: &quot;);
String deptName = sc.nextLine();
System.out.println(&quot;Name of department is: &quot; + deptName);
}

@Override
public void teacherInfo() {
System.out.print(&quot;Enter teacher name: &quot;);
String teacherName = sc.nextLine();

System.out.println(&quot;Name of teacher is: &quot; + teacherName);
}

@Override
public void studentInfo() {
System.out.print(&quot;Enter Student Roll No: &quot;);
int rollNo;
try {
rollNo = Integer.parseInt(sc.nextLine());
System.out.println(&quot;Student Roll No is: &quot; + rollNo);
} catch (NumberFormatException e) {
System.out.println(&quot;Invalid roll number. Please enter a valid integer.&quot;);
}
}
}

// Main class
public class Main {
public static void main(String[] args) {
// Polymorphism: reference of interface type pointing to implementing class
Student s = new Person();
s.departmentInfo();
s.teacherInfo();
s.studentInfo();
}
}
