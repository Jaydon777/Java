import java.util.*;
public class lcm{
    public static void main(String args[]){
        int a,b,lcm,gcd=1;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0)
            gcd = i;
        }
        lcm = (a*b)/gcd;
        System.out.println(lcm);
    }
}
