package mypackage;

public class Calculator {
int i = 10; //non static global variable
static int j = 20; //static global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator(); //object is created
print(); //method call
c.add(1,1,1);

int x =add(1,2); //method call with args
System.out.println("the return value is"+ x);
	}
    public static void print() { //method without arguments
    //accessmodifiers --> public private protected  and default	
    //type of method --> static  non-static
    //return type  --> void non-void 
    //userdefined name
    	Calculator c = new Calculator();
    	System.out.println("This is from print method");
    	System.out.println(j);
    	System.out.println(c.i);
    
    }
    public static int add(int a , int b) { //method with arguments
    	int c = a+b;
    	System.out.println(c);
    	return a;
    }
    public void add(int a, int b,int c) { //overloaded method
    	int d = a+b+c;
    	System.out.println(d);
    }
}
