import java.text.DecimalFormat;
import java.util.Arrays;
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
        double[] calcArray = new double[n];
        double[] finalArray = new double[k];
        double finalValue = 0;

        for(int i = 0; i <= 2; i++)
        {
            String rowString = in.nextLine();
            String[] rowArray = rowString.split("\\s+");
            for(int j = 0; j <= rowArray.length - 1; j++)
            {
                int test = rowArray.length;
                tradesArray[i][j] = Double.parseDouble(rowArray[j]);
            }
        }

        for(int y = 0; y < n; y++)
        {
            double prob = tradesArray[0][y];
            double prof = tradesArray[1][y];
            double loss = tradesArray[2][y];
            calcArray[y] = prob*prof-(1-prob)*loss;
        }

        //sort the array from lowest to highest
        Arrays.sort(calcArray);

        for(int x = 0; x < k; x++)
        {
            finalArray[x] = calcArray[calcArray.length - x - 1];
            if(finalArray[x] > 0)
            {
                finalValue += finalArray[x];
            }
        }

        DecimalFormat f = new DecimalFormat("#0.00");
        System.out.print(f.format(finalValue));
    }
}
