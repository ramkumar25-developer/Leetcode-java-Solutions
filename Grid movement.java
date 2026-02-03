import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        char arr[] = new char[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next().charAt(0);
        }
        for(int i=0;i<n;i++){
            char c = arr[i];
            if(c=='U'){
                y-=1;
            }
            else if(c=='D'){
                y+=1;
            }
            else if(c=='L'){
                x-=1;
            }
            else if(c=='R'){
                x+=1;
            }
        }
        System.out.print(x+" "+y);
    }
}
