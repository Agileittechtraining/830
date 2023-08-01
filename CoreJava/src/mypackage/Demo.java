package mypackage;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(1+1);
    System.out.println(2+2);
    try {
    System.out.println(3/3);
    }catch(Exception e) {
    	System.out.println("There is an exception");
    }
    System.out.println("Hello hi how are you");
	//Calculator.print();
	Calculator d =new Calculator();
	d.add(12, 120, 100);
	}

}
