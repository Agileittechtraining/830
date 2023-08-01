package mypackage;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] i =new int[3][2];
i[0][0] = 10;
i[0][1] = 20;
i[1][0] = 20;
i[1][1] = 70;
i[2][0] = 300;
i[2][1] = 900;
i[2][2] = 1;
System.out.println(i[0][1]);
System.out.println(i.length); //row length
System.out.println(i[0].length);//col length
for(int x=0;x<i.length;x++) {
	for(int y=0;y<i[x].length;y++) {
System.out.println(i[x][y]);
}
	}
	}
}
