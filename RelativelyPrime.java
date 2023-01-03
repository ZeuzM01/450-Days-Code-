import java.util.Scanner;

public class RelativelyPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long l = scan.nextLong();
        long r = scan.nextLong();

        for (long i =l;l<r;l+=2){
            System.out.println(Long.toString(i) + " " +Long.toString(l+1));
        }
    }
}
