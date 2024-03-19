package P5;

public class Faktorial {
    int nilai;


    int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1, j = n; i <= n; i++){
            int a = j;
            j--;
            fakto *= a;
        }
        return fakto;
    }

    int faktorialDC(int n) {
        if(n==1){
            return 1;
        } else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}
