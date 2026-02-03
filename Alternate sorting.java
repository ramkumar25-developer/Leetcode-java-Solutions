import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<=arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int l=0,r=n-1;
        int max = arr[n-1]+1;
        for(int i=0;i<n;i++){
            if(i%2==1){
                arr[i] = arr[i] + (arr[l++]%max)*max;
            }
            else{
                arr[i] = arr[i] + (arr[r--]%max)*max;
            }
        }
        for(int i=0;i<n;i++){
            arr[i] /= max;
            System.out.print(arr[i]+" ");
        }
    }
}
