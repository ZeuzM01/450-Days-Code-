import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int [] a = new int[n];
        for (int i =0;i<n;i++){
            a[i] = scan.nextInt();
        }

        if(k > n )
            k%=n;

        reverse(a,0,n-1);
        reverse(a,0,k-1);
        reverse(a,k,n-1);

        for (int i =0;i<n;i++){
            System.out.println(a[i]);
        }

    }

    private static void reverse(int []a, int start, int end){

        while (start<=end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = a[start];

            start++;
            end--;
        }
    }
}
