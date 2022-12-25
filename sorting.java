import java.util.*;
public class sorting
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n,temp=0;
        n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[j]>=a[i])
                {
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(i!=n)
            {
                System.out.print(a[i]+" ");
            }
            else
            {
                System.out.print(a[i]);
            }
        }
    }
}