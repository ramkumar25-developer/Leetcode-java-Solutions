/*There is a circular queue of processes. Every time there will be certain no of process skipped and a particular start position. Find the safe position.
Input: Number of process:5
       Start position:3
       Skip: 2nd
Output: 1 will be the safest position
(Logic: 1 2 3 4 5 starting from 3, 5th process will be skipped
        1 2 3 4 5 process 2 will be skipped
        1 2 3 4 5 process 4 will be skipped
        1 2 3 4 5 process 3 will be skipped, so safest process is 1.*/

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int start = sc.nextInt();
        int skip = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=num;i++){
            arr.add(i);
        }
        int index = start-1;
        while(arr.size()>1){
            index = (index+skip)%arr.size();
            arr.remove(index);
        }
        System.out.print(arr.get(0));
    }
}
