import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingOnTheClouds {

	//MY FIRST ATTEMPT:
	
    //Complete the jumpingOnClouds function below.
    //Parameters: int c[n]: an array of binary integers
    //Returns: int: the minimum number of jumps required
    //sample input: 0 0 1 0 0 1 0
    //sample output: 4
	//Possible combinations to consider.
    //0 1 0 0 
    //0 0 0 0 
    //0 0 1 0 
    static int jumpingOnClouds(int[] c) {
    //we know that c[0] and c[n-1] will always be 0.
    //hence, int[]c always starts and ends on a zero.
    assert(c[0] == 0);
    assert(c[c.length-1] == 0);
    int minJumps = 0;
    
    // 0 0 0 1 0 0 
    for(int i = 0; i < c.length; i++){ //iterating through the array.
    if(i == c.length - 1){
        if(c[i] == 0){
            break;
        }
        else{
            break;
        }
    }
    if(i == c.length - 2){
        if(c[i] == 0){
            if(c[i + 1] == 1){
                break;
            }
            else{
               minJumps++; 
               break;
            }
        }
        else if(c[i] == 1){
            if(c[i+1] == 0){
                minJumps++;
                i++;
                break;
            }
        }
    }
        if(c[i+1] == 0){
            if(c[i+2] == 0){
                i++;
                minJumps++;
            }
            else{
                minJumps++;
            }
        }
        
        else if(c[i+1] == 1){
            if(c[i+2] == 0){
                i++;
                minJumps++;
            }
            else{
                //should never happen (no two 1's one after another)
            }
        }
    }

    return minJumps;
    }
    
    
    //more efficient solution
    static int JumpingOnTheClouds(int[] c) {
    //make count = -1 because the count++ happens each time we jump off the i-th cloud, 
    //even the last one, the (n-1)-th cloud, which we don't need to count.
    	
    //in this solution we simply check if [i+2] is 0 (an acceptable cloud to land on), and skip two places if so.
    //if [i+2] is not 0, then we simply move one space. 
    //while we do this, we make sure we aren't on the second last element in the array, in that case we can't check [i+2] (would cause arrayoutofboundsexceptions)
    int count = -1;
    for (int i = 0; i < c.length; i++, count++) {
            if (i<(c.length)-2 && c[i+2]==0) {
                  i++;
        }
    }
    return count; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
