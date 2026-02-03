import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        boolean used[] = new boolean[36];
        StringBuilder sb = new StringBuilder();
        int numCount = 0;
        int letterCount = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                letterCount++;
                if(letterCount>26){
                    System.out.print("Invalid input");
                    return;
                }
                if(ch>='a' && ch<='z'){
                    if(used[ch-'a'] == true){
                        while(true){
                            ch++;
                            if(ch>'z'){
                                ch = 'a';
                            }
                            if(used[ch-'a'] == false){
                                used[ch-'a'] = true;
                                sb.append(ch);
                                break;
                            }
                        }
                    }
                    else{
                        used[ch-'a'] = true;
                        sb.append(ch);
                    }
                }
                else{
                    ch = Character.toLowerCase(ch);
                    if(used[ch-'a'] == true){
                        while(true){
                            ch++;
                            if(ch>'z'){
                                ch = 'a';
                            }
                            if(used[ch-'a'] == false){
                                used[ch-'a'] = true;
                                sb.append(Character.toUpperCase(ch));
                                break;
                            }
                        }
                    }
                    else{
                        used[ch-'a'] = true;
                        sb.append(Character.toUpperCase(ch));
                    }
                }
            }
            else if(Character.isDigit(ch)){
                numCount++;
                if(numCount>10){
                    System.out.print("Invalid input");
                    return;
                }
                int num = ch-'0';
                if(used[num+26]){
                    while(true){
                        num++;
                        if(num>9){
                            num=0;
                        }
                        if(!used[num+26]){
                            used[num+26] = true;
                            sb.append((char) (num+'0'));
                            break;
                        }
                    }
                }
                else{
                    used[num+26] = true;
                    sb.append(ch);
                }
            }
        }
        System.out.print(sb.toString());
    }
}
