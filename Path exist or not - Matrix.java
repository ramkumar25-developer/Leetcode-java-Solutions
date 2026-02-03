import java.util.*;

class Main{

    public static boolean checkPath(int arr[][],int i, int j,int n, int m){
        if(i>=n || j>=m){
            return false;
        }
        if(arr[i][j] != 1){
            return false;
        }
        if(i==n-1 && j==m-1){
            return true;
        }
        if(arr[i][j] == 1){
            return checkPath(arr,i+1,j,n,m) || checkPath(arr,i,j+1,n,m);
        }

        return false;
    }
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
        if(checkPath(arr,0,0,n,m)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
