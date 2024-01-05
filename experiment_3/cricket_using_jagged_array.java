import java.util.*;
class cricket
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n, i, m, j, sc;
        System.out.println("Enter the number of players: ");
        n = in.nextInt();
        int p[][] = new int[n][];
        int sum[] = new int[n];
        for(i = 0; i < n; i++) //the length of array p is n
        {
            System.out.println("Enter the number of matches played by player "+(i+1)+": ");
            m = in.nextInt();
            p[i] = new int[m];
        }
        for(i = 0; i < n; i++)
        {
            sum[i] = 0;
            for(j = 0; j < p[i].length; j++)
            {
                System.out.println("For match "+(j+1)+" played by player "+(i+1)+", enter the score: ");
                sc = in.nextInt();
                p[i][j] = sc;//ith player, jth match
                sum[i] = sum[i] + sc;//sum of scores scored by ith player
            }
        }
        System.out.println("The entered details are being displayed now: ");
        for(i = 0; i < n; i++)
        {
            System.out.println("Player No.: "+(i+1)+"\tBatting Average: "+sum[i]);
            System.out.println("Runs scored in individual matches are:\nMatch no.\tRuns Scored");
            for(j = 0; j < p[i].length; j++)
            {
                System.out.println((j+1)+"\t\t"+p[i][j]);
            }
            sum[i] = 0;
        }
        in.close();
    }
}