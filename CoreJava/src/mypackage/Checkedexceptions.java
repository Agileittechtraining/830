package mypackage;
import java.io.File;

public class Checkedexceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File f = new File("C:\\Filehandling\\myfile.txt");
try {
f.createNewFile();
	}catch(Exception e) {
		System.out.println("There is an exception");
	}
	}
}
