import java.util.*;
import java.io.*;

class Solution{
    static int solve(int a,int b){
        ArrayList<Integer> al=new ArrayList<>();
        for (int i=1;i<=a;i++){
            al.add(i);
        }
        int ans =kwr(al,b-1,0);
        return ans;
        }
    

        static  int kwr(ArrayList<Integer>al,int k,int idx){
            if (al.size()==1){
                return al.get(0);
            }
          idx=(idx+k)%al.size();
            al.remove(idx);
            int ans1=kwr(al,k,idx);
            return ans1;

    }
}
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Solution.solve(a,b));
    }
}