// Add Two Matrix
import java.util.Scanner;

class AddTwoMatrix{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of matrix");
        int sizex = scan.nextInt();
        int sizey = scan.nextInt();
        int mat1[][] = new int[sizex][sizey]; 
        int mat2[][] = new int[sizex][sizey];
        int sum[][] = new int[sizex][sizey];
        System.out.println("Enter Values in Matrix 1");
        for(int i = 0 ; i < sizex ; i++)
        {
            for(int j = 0 ; j < sizey ; j++)
            {
                mat1[i][j] = scan.nextInt();
            }
            System.out.println("");
        }
        System.out.println("Enter Values in Matrix 2");
        for(int i = 0 ; i < sizex ; i++)
        {
            for(int j = 0 ; j < sizey ; j++)
            {
                mat2[i][j] = scan.nextInt();
            }
            System.out.println("");
        }

        for(int i = 0 ; i < sizex ; i++)
        {
            for(int j = 0 ; j < sizey ; j++)
            {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("The added Matrix is ");
        for(int i = 0 ; i < sizex ; i++)
        {
            for(int j = 0 ; j < sizey ; j++)
            {
                System.out.println(sum[i][j]);
            }
            System.out.println("");
        }

    }
}
