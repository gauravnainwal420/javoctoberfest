import java.util.Scanner;
import java.lang.Math;

class file3{

// 111
public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);
	int value = scan.nextInt();
	int i=0;
	int result,output=0;

	while(value!=0)
	{
		result = value%10;
		output=output+(int)(result*Math.pow(2,i));
		value = value /10;
		i++;	
	}
	System.out.println(output);

//end of main
}
//end of class
}
