/*Given a matrix where 0 = empty, 1 = fresh orange, and 2 = rotten orange, compute the minimum time to rot all oranges. Return -1 if not all can rot.
Example:
Input:
2 1 1  
1 1 0  
0 1 1
Output: 4*/

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int qr[] = new int[n*m];
        int qc[] = new int[n*m];
        int front = 0;
        int rear = 0;
        int fresh = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == 2){
                    qr[rear] = i;
                    qc[rear] = j;
                    rear++;
                }
                else if(arr[i][j] == 1){
                    fresh++;
                }
            }
        }

        int dr[] = {-1,1,0,0};
        int dc[] = {0,0,-1,1};
        int time = 0;

        while(front<rear && fresh>0){
            int size = rear - front;
            boolean rotten = false;
            for(int i=0;i<size;i++) {
                int x = qr[front];
                int y = qc[front];
                front++;
                for(int d=0;d<4;d++){
                    int nx = x+dr[d];
                    int ny = y+dc[d];
                    if(nx>=0 && nx<n && ny>=0 && ny<m && arr[nx][ny] == 1){
                        arr[nx][ny] = 2;
                        qr[rear] = nx;
                        qc[rear] = ny;
                        rear++;
                        fresh--;
                        rotten = true;
                    }
                }
            }
            if(rotten){
                time++;
            }
        }
        if(fresh>0){
            System.out.print("-1");
        }
        else{
            System.out.print(time);
        }
    }
}
