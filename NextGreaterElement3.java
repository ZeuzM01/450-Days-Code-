import java.util.Arrays;
import java.util.Scanner;

public class NextGreaterElement3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        char[] chars = String.valueOf(n).toCharArray();
        int len = chars.length;


        int i ;

        for (i = len-1;i>=0;i--){
            if(chars[i] > chars[i-1]){
                break;
            }
        }
        if (i<=0){
            System.out.println("InValid");
        }
        else {
            int x = chars[i-1];
            int min = i;

            for (int j =i+1;j<len;j++){
                if(chars[j] > chars[x] && chars[j]< chars[min]){
                    min= j;
                }
            }

            swap(chars,i-1,min);
            Arrays.sort(chars,i,len);

            long res = Long.valueOf(new String(chars));
            if(res>Integer.MAX_VALUE) System.out.println(-1);
            System.out.println(res);
        }

    }
    private static void swap(char array[], int i, int j){
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
