import java.util.*;
public class addelement
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        int arr[]=new int[n];
        int b[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int pos,el;
        pos=in.nextInt();
        el=in.nextInt();
        int ch=0;
        for(int i=0;i<=n;i++)
        {
            if((i+1)==pos)
            {
                System.out.print(el+" ");
            }
            else
            {
                System.out.print(arr[ch]+" ");
                ch=ch+1;
            }
        }
    }
}