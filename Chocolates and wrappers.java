import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int price = sc.nextInt();
        int wrapper = sc.nextInt();
        int choco = sc.nextInt();
        int maxVisit = sc.nextInt();

        if(maxVisit == 0){
            maxVisit = -1;
        }

        int eat = money/price;
        int cover = money/price;
        while(cover>=wrapper && maxVisit != 0){
            eat = eat + ((cover/wrapper)*choco);
            int newWrapper = cover/wrapper;
            cover = cover%wrapper;
            cover += newWrapper*choco;
            maxVisit--;
        }
        System.out.print(eat+" "+cover);
    }
}
