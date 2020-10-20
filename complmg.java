class ComplexNums{
    private int real, imaginary;
    public ComplexNums(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public ComplexNums(){
        this.real = 1;
        this.imaginary = 1;
    }
    public int getRealPart(){
        return real;
    }
    public void setRealPart(int real){
        this.real = real;
    }
    public int getImaginaryPart(){
        return imaginary;
    }
    public void setImaginaryPart(int imaginary){
        this.imaginary = imaginary;
    }
    public ComplexNums add(ComplexNums c1, ComplexNums c2){
        ComplexNums c3= new ComplexNums();
        c3.real = c1.real + c2.real;
        c3.imaginary = c1.imaginary + c2.imaginary;
        return c3;
    }
    public ComplexNums sub(ComplexNums c1, ComplexNums c2){
        ComplexNums c3= new ComplexNums();
        c3.real = c1.real - c2.real;
        c3.imaginary = c1.imaginary - c2.imaginary;
        return c3;
    }
    public void show(){
        System.out.println(this.real + " " + this.imaginary + "i");
    }
}

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
