import java.util.*;

public class matrixmul {
    public static void main(String args[]) {
        int m, n, i, j, p, q;
        Scanner s = new Scanner(System.in);
        m = s.nextInt();
        n = s.nextInt();
        int m1[][] = new int[m][n];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                m1[i][j] = s.nextInt();
            }
        }
        p = s.nextInt();
        q = s.nextInt();
        int m2[][] = new int[p][q];
        for (i = 0; i < p; i++) {
            for (j = 0; j < q; j++) {
                m2[i][j] = s.nextInt();
            }
        }
        if (n != p){
            System.out.println("matrix multiplication not possible");
        } else {
            int mul[][] = new int[m][p];
            for (i = 0; i < m; i++) {
                for (j = 0; j < q; j++) {
                    mul[i][j] = 0;
                }
                for(int k = 0; k<p;k++){
                    mul[i][j] += m1[i][k] * m2[i][k];
                }
            }
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    System.out.print(mul[i][j] + " ".trim());
                }   
                System.out.println();
            }
        }

    }
}
public static void main()