import java.util.*;
class jaggedarray {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i, n, j;
        System.out.println("Enter the value of n: ");
        n = in.nextInt();
        int ar[][] = new int[n][];
        for(i = 0; i < n; i++)
        {	
            ar[i] = new int[i];
        }
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < ar[i].length; j++)
            {
                ar[i][j] = j;
            }
        }
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < ar[i].length; j++)
            {
                System.out.print("\t"+ar[i][j]);
            }
            System.out.print("\n");
        }
        in.close();
    }
}