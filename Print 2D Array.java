import java.util.*;

class Solution {
    public void printAllElements(int[][] arr,int n,int m) {
        for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
           
           System.out.print(arr[i][j]+" ");
             }
                System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.printAllElements(arr,n,m);
        sc.close();
    }
}