
public class RepeatedString {
    // Complete the repeatedString function below.
    //Parameters: 
    // s: a string to repeat
    // n: the number of characters to consider
    //Return: 
    // int: the frequency of a in the substring
    static long repeatedString(String s, long n) {    
    	long size = s.length();
    	long repeated = n/size;
        long left = n - (size * repeated);
        int extra = 0;

        int count = 0;
        for(int i = 0; i < size; i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }

        for(int i = 0; i < left; i++){
            if(s.charAt(i) == 'a'){
                extra++;
            }
        }

        repeated = (repeated * count) + extra;

        return repeated;
    }
}
