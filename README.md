# Java-Programming-Language
Introduction
------------------------------------------------------------
One of the most popular programming language.
Created in 1995 by James Goslin at Sun MicroSystems.
Now it is Owned by Oracle Corporation.
Java is Cross Platform.(easily run in Windows, Mac and linux)
It is open source and free.
It is an Object Oriented Programming Language.
Programming structure is almost close to C & C++.
It is very easy to learn.

Why use Java ?
------------------------------------------------------------
Android Mobile Applications
Desktop Applications
Web-based Applications
Enterprise Applications
Games
etc.


How Java Programs Work ?
------------------------------------------------------------


Create a java program ,that program extension is .java (say Source code)and then compile and the program
extension is .class (say Bytecode) and use a tool called JVM(Java Virtual Machine)
 and convert into Machine Code and the program executes.


JDK (Java Development Kit)
---------------------------------------------------------------

latest version :- Java 17 and Java 19

System Variable Setup:
(java program commands will be directly execute in the command prompt)
type the search bar :- environment(Edit the system environment variables)->environment variables->path:-edit->New->paste the path->ok
path:C:\Program Files\Java\jdk-19\bin

open the cmd
:-) java -version
java version "19.0.2" 2023-01-17
Java(TM) SE Runtime Environment (build 19.0.2+7-44)
Java HotSpot(TM) 64-Bit Server VM (build 19.0.2+7-44, mixed mode, sharing)



First Java Program
--------------------------------------------------------------

open the notepad.

java code should be written inside the class whether the object creates or not.

public class MyJava{
	public static void main(String[] args){

	System.out.println("Hello World");			//print
}
}



class name :MyJava
class style:camel case(First letter is Capital)

main method:entry point.This will run and execute.

The class name as same as saving the file:, here class name is MyJava , when saving this file, save filename as
MyJava.java, .java is the extension.

open the cmd:-
	javac MyJava.java (compile)
we get, MyJava.class (This is the ByteCode)
and then ,
	java MyJava (JVM)
it executes as the output:-
Hello World



IDE Installation (Intellij IDEA)
--------------------------------------------------------------

IDE means Integrated Development Environment:-An integrated development environment (IDE) is software for building applications that combines common developer tools into a single graphical user interface (GUI)
	has code editors,
	program compile and run



	Intellij IDEA:-
		Download Community(Windows)(650 mb)
		create java programs as well as android programs (default language:kotlin)


Comments
----------------------------------------------------------------

Comments in Java are the statements that are not executed by the compiler and interpreter.
It can be used to provide information or explanation about the variable, method, class or any statement. It can also be used to hide program code for a specific time.

public class MyJava{
	public static void main(String[] args){
	
	
	/*
	This is a 
	java
	example
	*/
	//Code for printing hello world
	System.out.println("Hello World");
	
}
}



Data Types and Variables
-----------------------------------------------------------------

Data Type:-

	byte:-	-128 to 127 (1 byte)
	short:-	- 32768 to 32767 (2 bytes)
	int:-  4 bytes
	long:- 8 bytes
	float:- 4 bytes
	double:- 8 bytes
	boolean:- true or false values (1 bit)
	char:- Single Character (2 bytes)
	Strings:- Store Texts(characters)



Variables:-	
	used for storing data.

	declare a variable(syntax):- data_type variable_name
	
   Rules for naming variable:-
	include letters,digits,underscores(_),and dollar sign($)
	starts with a lowercase letter,$ or _
	cannot contains whitespace
	case sensitive:- mynumber, myNumber
	Not use Java keywords


public class Example1{
	public static void main(String[] args){
	byte_myNumber = 120;
	System.out.println(myNumber);		
}
}


Arithmetic Operators
-----------------------------------------------------------

	+ Addition
	- Subtraction
	* Multiplication
	/ Division
	% Remainder
	++ Increment
	-- Decrement	


public class Example2{

	public static void main(String[] args){

	int x;
	x = 10 + 3;
	System.out.println(x);	
			
}
}

Assignment Operators
-------------------------------------------------

Assignment operators are used in Java to assign values to variables

	= -> x=10;
	+= -> x+=4 -> x=x+4;
	-= -> x-=4 -> x=x-4;
	*= -> x*=4 -> x=x*4;
	/= -> x/=4 -> x=x/4;
	%= -> x%=4 -> x=x%4;

public class Example3{

	public static void main(String[] args){
	
		int x;
		x = 10;
		System.out.println(x);

}

}


Comparison operators
------------------------------------------------------------

	'Equal to' -> == : a==b;
	'Not Equal to' -> != : a!=b;
	'Greater than' -> > : a>b;
	'Less than' -> < : a<b;
	'Greater than or equal to' -> >= : a>=b;
	'Less than or equal to' -> <= : a<=b;
	

public class Example4 {
    public static void main(String[] args){
        int a = 7, b = 9;
        System.out.println(a == b);
    }
}


Logical Operators
-------------------------------------------------------------
 	'Logical and' -> && : True (Both statements are True)
	'Logical or' -> || : True  (One of the statement is True)
	'Logical not' -> ! : Opposite Result(if condition True: result is False, condition is False:the result is True)


public class Example5 {
    public static void main(String[] args){
        int a = 7, b = 10;
        System.out.println(a>5 && b<12);
    }
}


public class Example6 {
    public static void main(String[] args){
        int a = 7;
        System.out.println(!(a>5));
    }
}


if..else..if.. statements
-------------------------------------------------------------------

	if statement - Conditional Statement
    --------------------------------------------------------
	
	condition -> True -> Execute Code
		
			if (condition){
				execute code
			}

public class Example7 {
    public static void main(String[] args){
        int a = 5;

        if(a>0){
            System.out.println("It is a Positive Number");
        }
    }
}

	if else Statement
	-------------------------

public class Example8 {
    public static void main(String[] args){
        int a = -5;

        if(a>0){
            System.out.println("It is a Positive Number");
        }else{
            System.out.println("It is a Negative Number");
        }
    }
}

	if else if statement
     ------------------------------------

public class Example9 {
    public static void main(String[] args){
        int a = 0;

        if(a>0){
            System.out.println("It is a Positive Number");
        }else if (a==0){
            System.out.println("It is Zero");
        }
        else{
            System.out.println("It is a Negative Number");
        }
    }
}



Switch Statement
------------------------------------------------------------------

The Java switch statement executes one statement from multiple conditions.
It is like if-else-if ladder statement.

switch (expression){
            case 1:
                code 1;
                break;
            case 2:
                code 2;
                break;
            case 3:
                code 3;
                break;
            default:
                code default;
                break;
}





public class Example10 {
    public static void main(String[] args){
        int myNumber = 5;
        switch (myNumber){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid Number");
                break;
        }
    }
}


While Loop and Do While Loop
--------------------------------------------


Loops in Java is a feature used to execute a particular part of the program repeatedly if a given condition evaluates to be true.

A "While" Loop is used to repeat a specific block of code an unknown number of times, until a condition is met.

Do-while loop is used to execute a block of statements continuously until the given condition is true.

	While Loop
    ------------------------
public class Example11 {
    public static void main(String[] args){
        int i = 1;
        while(i<=5){
            System.out.println(i);
            ++i;
        }
    }
}

	Do while
    -------------------------
public class Example12 {
    public static void main(String[] args){
        int i =1;
        do{
            System.out.println(i);
            ++i;
        }
        while(i<=5);
    }
}

	For loop
    --------------------------------
public class Example13 {
    public static void main(String[] args){
        for(int i = 1; i<=5;++i){
            System.out.println(i);

        }

    }
}


String Methods
----------------------------------------------------------------

Store text 
In java, it is an object.

	Length()
     ----------------------
public class Example14 {
    public static void main(String[] args){
        String message = "Hello World";
        System.out.println(message.length());
    }
}

	Upper Case()
    ---------------------------------

public class Example14 {
    public static void main(String[] args){
        String message = "hello world";
        System.out.println(message.toUpperCase());
    }
}

	Lower Case()
    ---------------------------------------

public class Example14 {
    public static void main(String[] args){
        String message = "HELLO WORLD";
        System.out.println(message.toLowerCase());
    }
}

	Concat()
     ---------------------------

public class Example15 {
    public static void main(String[] args){
        String fName = "John";
        String sName = " Paul";
        System.out.println(fName.concat(sName));
    }
}



Math Methods
--------------------------------------------------------------

		Max()
	-----------------------------------
public class Example16 {
    public static void main(String[] args){
        System.out.println(Math.max(10, 20));

    }
}



		Min()
	------------------------------------

public class Example16 {
    public static void main(String[] args){
        System.out.println(Math.min(10, 20));

    }
}


		Square Root
	-------------------------------------
public class Example17 {
    public static void main(String[] args){
        System.out.println(Math.sqrt(9));

    }
}



		Absolute Value
	--------------------------------------
public class Example17 {
    public static void main(String[] args){
        System.out.println(Math.abs(-9));

    }
}


		Random Numbers
	--------------------------------------
public class Example18 {
    public static void main(String[] args){
        System.out.println((int)(Math.random()*100));

    }
}


Arrays
-----------------------------------------------------------------------------------

An array is a container object that holds a fixed number of values of a single type.

public class Example19 {
    public static void main(String[] args){
        String[] fruits = {"banana", "apple", "orange", "watermelon", "pineapple"};
        System.out.println(fruits[3]);

        int numbers[] = {10,20,30,40,50};
        System.out.println(numbers[4]);

        System.out.println(numbers[0]+numbers[4]+numbers[3]);

        System.out.println(numbers.length);
        System.out.println(fruits.length);
    }
}


public class Example20 {
    public static void main(String[] args){
        int [][]num = {{10,20,30,40},{1,2,3,4}};
        System.out.println(num[1][3]);
    }
}


Java Methods
--------------------------------------------------------------------------------


A method is a block of code which only runs when it is called. You can pass data, known as parameters, into a method. Methods are used to perform certain actions, and they are also known as functions.

public class Example21 {
    static void printmessage(){
        System.out.println("This is example 21");
    }
    public static void main(String[] args){
        printmessage();
    }
}


			Method with Parameters
		-------------------------------------------------

Information can be passed to methods as parameter. Parameters act as variables inside the method. Parameters are specified after the method name, inside the parentheses.

public class Example22 {
    static void printmessage(String name){
        System.out.println("Hello " + name);
    }
    public static void main(String[] args){
        printmessage("John");
        printmessage("George");
        printmessage("Xavier");
    }
}


			Method with Parameters and return value
		----------------------------------------------------------

In Java, every method is declared with a return type such as int, float, double, string, etc. These return types required a return statement at the end of the method.
A return keyword is used for returning the resulted value. The void return type doesn't require any return statement.


public class Example23 {
    static int findsquare(int a){
        return a*a;
    }
    public static void main(String[] args){
        //findsquare(10);
        System.out.println(findsquare(10));
        //findsquare(100);
        System.out.println(findsquare(100));
    }
}


Method Overloading
------------------------------------------------------------------------------

Method overloading in java is a feature that allows a class to have more than one method with the same name, but with different parameters.

public class Example24 {
    static int findSum(int a, int b){
        return a+b;
    }
    static int findSum(int x, int y, int z){
        return x+y+z;
    }
    static double findSum(double c, double d){
        return c+d;
    }
    public static void main(String[] args){
        int sum1 = findSum(10,1);
        int sum2 = findSum(32,-2,10);
        double sum3 = findSum(5.23,45.10);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}




Recursion
------------------------------------------------------------------------------


Recursion is the technique of making a function call itself.
This technique provides a way to break complicated problems down into simple problems which are easier to solve


public class Example25 {
    static int sum(int a){
        if(a>0){
            return a+sum(a-1);
        }else{
            return 0;
        }

    }
    public static void main(String[] args){
        int result = sum(5);
        System.out.println(result);

    }
}


Object Oriented Programming System
--------------------------------------------------------------------

Object Oriented Programming is a programming paradigm (methodology) which uses objects in programming

Major Concepts of OOP are:
	Class
	Object
	Encapsulation
	Abstraction
	Inheritance
	Polymorphism

Class:- Template for object
	eg:- electronic items,vehicles

Object:- Member of a class
	eg:- car,smartphone,laptop

   Attributes:- properties  
   Methods:- functions
eg:- Like smartphone here, the attributes are make,Model name,and Price.and the methods are
	call,message,take picture.


Inheritance 
	One class acquires the properties of another class.
Parent Class(Base/Super class)
Child Class(Sub/Derived Class):- Child class inherits the properties of parent class.

Advantages:
Code Reusability
Increase Readability
Easy Modification (Parent class changes )

Polymorphism 
perform single action in different ways.

Achieve Polymorphism in following ways:
-> Method Overriding:- In Java, method overriding occurs when a subclass (child class) has the same method as the parent class
-> Method Overloading
-> Operator Overloading:- Operator overloading is a programming method where operators are implemented in user-defined types with specific logic dependent on the types of given arguments.

Advantages:
Code Reusability



Encapsulation
Binding of datas (attributes and methods) in a class into a single unit.

To achieve Encapsulation in Java:- 
Declare variables as private
View and Modify variables values through Public
	Getter (read-only) and setter(write-only) methods


the above mention as the Data Hiding

Advantages
Increase Data Security(prevent unwanted access of variables from outside the class)
Increase Readability and Flexibility
Reusability





Abstraction (Abstract class and interface)
---------------------------------------------------------

Hiding the implementation details from the user
only the functionality will be provided to the user.

eg:- Remote, Google website,whatsapp
 
Achieve Abstraction in following ways:
Abstract Classes(0-100%)
Interfaces(100%)

advantages:
Increase security of application
reduce complexity

Abstract classes:
	use abstract keyword to declare abstract class and method
	can have both abstract methods(method without body) and non-abstract methods.
	cannot create objects
	implement abstract method using inheritance(extended by a class).


interfaces:
	use interface keyword to declare an interface.
	All methods in interface are abstract
	cannot create objects
	interface is implemented by a class using implements keyword.
	Multiple inheritance can achieved through interface.


User Inputs
------------------------------------------------------
import java.util.Scanner;

public class Example26 {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        String name = e.nextLine();
        System.out.println("Enter Phone Number:");
        int number = e.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Phone: " + number);

    }
}


Java Exceptions
--------------------------------------------------------
An exception (or exceptional event) is a problem that arises during the execution of a program. 

There are three types of exception—the checked exception, the error and the runtime exception.



File Handling
-----------------------------------------------------------


File handling in Java is defined as reading and writing data to a file. The particular file class from the package called java.io allows us to handle and work with different formats of files.
