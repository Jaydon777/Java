import java.util.*;
public class surprise {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i1=0,i2=1;
        int temp;
        System.out.print(i1+" ");  
        System.out.print(i2+" ");
        for(int i=0;i<n-2;i++)
        {
            temp = i1+i2;
            System.out.print(temp+" ");
            i1=i2;
            i2=temp;
            temp=0;
        }
    }
}
