import java.util.Scanner;

public class hien20SoNguyen {
    public static void main(String[] args) {
        int count = 0;
        int N = 2;
        boolean check;
        while (count<20){
            check = false;
            for (int i = 2; i < N; i++) {
                if(N%i==0){
                    check = true;
                    break;
                }
            }
            if(!check){
                System.out.printf("%d,",N);
                count++;
            }
            N++;
        }
    }
}
