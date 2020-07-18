import java.util.Scanner;

public class samplearray4 {
    public static void main(String[] args){
        int row, col, i, j;
        int arr[][] = new int[10][10];
        Scanner scan = new Scanner(System.in);

        // enter row and column for array.
        System.out.print("Enter no.of rows: ");
        row = scan.nextInt();
        System.out.print("Enter no.of columns : ");
        col = scan.nextInt();
        // enter array elements.
        System.out.println("Enter " +(row*col)+ " Array Elements : ");
        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }

        // the 2D array is here.
        System.out.print("The Array is :\n");
        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++)
            {
                System.out.print(arr[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}


