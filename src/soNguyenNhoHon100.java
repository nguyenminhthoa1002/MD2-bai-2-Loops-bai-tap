public class soNguyenNhoHon100 {
    public static void main(String[] args) {
        int N = 2;
        boolean check;
        while (N<100){
            check = false;
            for (int i = 2; i < N; i++) {
                if(N%i==0){
                    check = true;
                    break;
                }
            }
            if(!check){
                System.out.printf("%d,",N);
            }
            N++;
        }
    }
}
