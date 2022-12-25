import java.util.*;
public class duplicate
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=-100)
            {
                if(i!=n-1)
                {
                    System.out.print(arr[i]+" ");
                }
                else
                {
                    System.out.print(arr[i]);
                }
            }
            int temp=arr[i];
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    if(arr[j]==arr[k] && arr[k]==temp)
                    {
                        arr[k]=-100;
                    }
                }
            }
        }
    }
}