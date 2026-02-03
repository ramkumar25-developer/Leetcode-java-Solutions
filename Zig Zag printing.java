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
        int size = n+m-1;
        for(int d=0;d<size;d++){

            int i = d<m?0:d-m+1;
            int j = d<m?d:m-1;

            if(d%2==0){
                while(i<n && j>=0){
                    System.out.print(arr[i++][j--]+" ");
                }
            }
            else{
                int ri = i;
                int rj = j;
                while(ri<n && rj>=0){
                    ri++;
                    rj--;
                }
                ri--;
                rj++;
                while(ri>=0 && rj<m){
                    System.out.print(arr[ri--][rj++]+" ");
                }
            }
        }
    }
}
