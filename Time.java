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
		System.out.println("Minuates = "+mins);
		System.out.println("Seconds = "+sec);
	}		

	Time add(Time d1,Time d2)
	{
		int h,m,s;
		Time t = new Time();
		s = t1.sec + t2.sec;
		m = t1.min + t2.min + s/60;
		h = t1.hrs + t2.hrs + m/60; 
		t.sec = s % 60;
		t.mins = m % 60;
		t.hrs = h;
		return t;		
	}
}
