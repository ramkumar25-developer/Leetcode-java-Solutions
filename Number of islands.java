import java.util.*;

class Main{

    public static void floodfill(int arr[][],int i, int j){
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length){
            return;
        }
        if(arr[i][j] == 0){
            return;
        }
        if(arr[i][j] == 1){
            arr[i][j] = 0;
        }

        floodfill(arr,i+1,j);
        floodfill(arr,i,j+1);
        floodfill(arr,i-1,j);
        floodfill(arr,i,j-1);
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
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == 1){
                    count++;
                    floodfill(arr,i,j);
                }
            }
        }
        System.out.print(count);
    }
}
