import java.util.*;

class Main{
    public static void check(int arr[][], int i, int j, int newColor, int oldColor){
        if(i<0 || i>arr.length-1 || j<0 || j>arr[0].length-1){
            return;
        }
        if(arr[i][j] != oldColor){
            return;
        }

        arr[i][j] = newColor;

        check(arr,i+1,j,newColor,oldColor);
        check(arr,i,j+1,newColor,oldColor);
        check(arr,i-1,j,newColor,oldColor);
        check(arr,i,j-1,newColor,oldColor);
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
        int x = sc.nextInt();
        int y = sc.nextInt();
        int newColor = sc.nextInt();
        int oldColor = arr[x][y];

        check(arr,x,y,newColor,oldColor);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
