import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        printboundaryTraversal(m, n, matrix);
        sc.close();
    }

    public static void printboundaryTraversal(int m, int n, int[][] mat) {
                if(m==1){
                   for(int i=0;i<n;i++){
                       System.out.print(mat[0][i]+" ");
          }
          }else if(n==1){
                  for(int i=0;i<m;i++){
                      System.out.print(mat[i][0]+" ");
                  
                  }
                  }else
                      for(int col=0;col<n-1;col++){
                          System.out.print(mat[0][col]+" ");
                      }
                      for(int row=0;row<m-1;row++){
                          System.out.print(mat[row][n-1]+" ");
                      }if(m>-1){
                      for(int col=n-1;col>0;col--){
                          System.out.print(mat[m-1][col]+" ");
                      }
                      }if(n>-2){
                      for(int row=m-1;row>0;row--){
                          System.out.print(mat[row][0]+" ");
          	}
       	    }   
	}
    }
      