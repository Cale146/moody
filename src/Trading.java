import java.util.Scanner;

/**
 * Created by jonesdc on 9/30/16.
 */
public class Trading {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String trades = in.nextLine();
        String[] splitted = trades.split("\\s+");
        int n = Integer.parseInt(splitted[0]);
        int k = Integer.parseInt(splitted[1]);
        double[][] tradesArray = new double[3][n];
        double[] finalArray = new double[20];

        for(int i = 0; i <= 2; i++)
        {
            String rowString = in.nextLine();
            String[] rowArray = rowString.split("\\s+");
            for(int j = 0; j <= rowArray.length - 1; j++)
            {
                int test = rowArray.length;
                tradesArray[i][j] = Double.parseDouble(rowArray[j]);
                System.out.print(tradesArray[i][j] + " ");
            }
            System.out.print("\n");
        }

        for(int y = 0; y < n; y++)
        {
            double prob = tradesArray[0][y];
            double prof = tradesArray[1][y];
            double loss = tradesArray[2][y];
            finalArray[y] = (prob*prof) - (prob*loss);
            System.out.print(finalArray[y] + " ");
        }


    }
}
