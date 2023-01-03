import java.util.Scanner;

public class SquaresofArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ques [] = new int[n];
        for (int i =0;i<n;i++){
            ques[i] = scan.nextInt();
        }
        int res [] = new int[n];
        int start = 0;
        int end = n-1;
        for(int i =n-1;i>=0;i--){
            if(Math.abs(start) > Math.abs(end)){
                res[i] = start*start;
                start++;
            }
            else {
                res[i] = end*end;
                end--;
            }
        }

        for (int i =0;i<n;i++){
            System.out.println(res[i]);
        }
    }
}
