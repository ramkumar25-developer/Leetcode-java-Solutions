/* Given a list of daily temperatures, return an array where each element tells you how many days you have to wait until a warmer temperature.
If there is no future warmer day, put 0.

Example:
Input: [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]*/

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp[] = new int[n];
        for(int i=0;i<n;i++){
            temp[i] = sc.nextInt();
        }
        int arr[] = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty() && temp[stk.peek()]<=temp[i]){
                stk.pop();
            }
            if(!stk.isEmpty()){
                arr[i] = stk.peek()-i;
            }
            else{
                arr[i] = 0;
            }
            stk.push(i);
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
