/*Matrix Diagonal sum
Given a matrix print the largest of the sums of the two triangles split by diagonal from top right to bottom left
I/P:
3 3
1 2 3
4 5 6
7 8 9
O/P: 38
*/

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int left = 0;
        int right = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i+j <= n-1){
                    left+=arr[i][j];
                }
                if(i+j >= n-1){
                    right+=arr[i][j];
                }
            }
        }
        int ans = Math.max(left,right);
        System.out.print(ans);
    }
}
