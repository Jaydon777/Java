import java.util.*;
public class square{
    public static void main(String args[]){
        int sq;
        for(int i = 1;i<=10;i++){
            sq = i*i;
              if(i==10){
               System.out.print(sq);
           }
           else{
                System.out.print(sq+" ");
           }
        }
        System.out.println();
        int num = 0;
        while(num++<10){
              if(num==10){
               System.out.print(num*num);
           }
           else{
                System.out.print(num*num+" ");
           }
            
        }
        System.out.println();
        
        num=1;
        
        
       do{
           if(num==10){
               System.out.print(num*num);
           }
           else{
                System.out.print(num*num+" ");
           }
        }
        
        while(num++<10); 
    
    
}
}