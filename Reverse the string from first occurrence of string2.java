import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String arr[] = a.split("\\s+");
        int n = a.length();
        int m = b.length();
        int index = -1;
        for(int i=0;i<arr.length;i++){
            String s = arr[i];
            for(int j=0;j<=s.length()-m;j++) {
                int k = 0;
                while (k < m && s.charAt(j + k) == b.charAt(k)) {
                    k++;
                }
                if (k == m) {
                    index = i;
                    break;
                }
            }
            if(index != -1){
                break;
            }
        }
        if(index == -1){
            System.out.print(a);
        }
        else{
            for(int i=0;i<index;i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=arr.length-1;i>=index;i--){
                if(i == index){
                    System.out.print(arr[i]);
                }
                else{
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
