import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int n = a.length();
        int m = b.length();
        int i=0,j=0;
        while(i<n || j<m){
            int num1=0;
            int num2=0;
            while(i<n && a.charAt(i) != '.'){
                num1 = (num1*10) + (a.charAt(i)-'0');
                i++;
            }
            if(i<n && a.charAt(i)=='.') i++;
            while(j<m && b.charAt(j) != '.'){
                num2 = (num2*10) + (b.charAt(j)-'0');
                j++;
            }
            if(j<m && b.charAt(j)=='.') j++;
            if(num1<num2){
                System.out.print("Upgrade");
                return;
            }
            else if(num1>num2){
                System.out.print("Downgrade");
                return;
            }
        }
        System.out.print("Same Version");
    }
}
