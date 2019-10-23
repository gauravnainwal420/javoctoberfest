import java.util.Scanner;

class Time
{
	int hrs;
	int mins;
	int sec;

	void input(int hh, int mm ,int ss)
	{
		hrs= hh;
		mins = mm;
		sec = ss;
	}
	void show()
	{
		System.out.println("Hours = "+hrs);
		System.out.println("Minutes = "+mins);
		System.out.println("Seconds = "+sec);
	}		

	Time add(Time t1,Time t2)
	{
		int h,m,s;
		Time t = new Time();
		s = t1.sec + t2.sec;
		m = t1.mins + t2.mins + s/60;
		h = t1.hrs + t2.hrs + m/60; 
		t.sec = s % 60;
		t.mins = m % 60;
		t.hrs = h;
		return t;		
	}
}
// --------------------------------------------------------------------------------------------------------------------------------
//						End of a class 	
// --------------------------------------------------------------------------------------------------------------------------------
class Main
{
	public static void main(String args[])
	{
	    Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Time in format hh, mm, ss");
        int s1,s2,m1,m2,h1,h2;
        h1 = scan.nextInt();
        m1 = scan.nextInt();
        s1 = scan.nextInt();
        
        System.out.println("Enter a Time in format hh, mm, ss");
        h2 = scan.nextInt();
        m2 = scan.nextInt();
        s2 = scan.nextInt();
        
		Time ob1,ob2,ob3;
		ob1 = new Time();
		ob2 = new Time();
		ob3 = new Time();	// I dont need to allocate memory because at the end it will be garbage
		ob1.input(h1,m1,s1);
		ob2.input(h2,m2,s2);
		ob3 = ob3.add(ob1,ob2);
		ob1.show();
		ob2.show();
		System.out.println("Sum of both the times are\n");
		ob3.show();
	}
}
