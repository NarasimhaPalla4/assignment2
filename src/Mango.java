import java.util.*;
public class Mango {
    public static void main(String[] args){
        int r,c,n,i,f=0;
        int[][] x;
        x=new int[1000][1000];
        Scanner s= new Scanner(System.in);
        r=s.nextInt();
        c=s.nextInt();
        n=s.nextInt();
        for(i=1;i<=c;i++){
            if (n == (i * c + 1)) {
                f = 1;
                break;
            } else if (n == (c * (i+1))) {
                f = 1;
                break;
            }
        }
        if(n<=c){
            f=1;
        }
        if(f==1) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
