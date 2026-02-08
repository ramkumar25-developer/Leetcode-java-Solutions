/*👉 Given a list of non-negative integers, arrange them such that they form the largest number when concatenated.

Example:
Input: [3, 30, 34, 5, 9]
Output: "9534330"*/

import java.util.*;
class Main{
    static boolean swap(String a, String b){
        for(int i=0;i<a.length();i++){
            if(b.charAt(i)>a.charAt(i)) return true;
            if(b.charAt(i)<a.charAt(i)) return false;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp[] = new int[n];
        for(int i=0;i<n;i++){
            temp[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                String a = ""+temp[i]+temp[j];
                String b = ""+temp[j]+temp[i];
                if(swap(a,b)){
                    int tem = temp[i];
                    temp[i] = temp[j];
                    temp[j] = tem;
                }
            }
        }
        if(temp[0]==0){
            System.out.print("0");
        }else{
            for(int i=0;i<n;i++){
                System.out.print(temp[i]);
            }
        }
    }
}
