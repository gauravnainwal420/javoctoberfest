class CompImg{
/*
    Write a java program to create class complex having member variables real and imaginary
    create a contructor to initialize them and write methods add and sub for addition and subtraction
    of complex numbers.
*/
    public static void main(String ars[])
    {
        ComplexNums c1,c2,c3;
        c1 = new ComplexNums(10,20);
        c2 = new ComplexNums(30,40);
        c3 = new ComplexNums();

        c3 = c3.add(c1,c2);
        c3.show();
        c3 = c3.sub(c1,c2);
        c3.show();
        
    }


}
