//Sort the given elements in decending order based on the number of factors of each element

import java.util.*;

class Main{
    public static int factors(int n){
        int count = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i==n/i) {
                    count++;
                }
                else{
                    count+=2;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(factors(arr[j])>factors(arr[j-1])){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
