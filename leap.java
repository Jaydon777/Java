import java.util.*;
public class leap{
    public static void main(String args[]){
        int year;
        Scanner s = new Scanner (System.in);
        year = s.nextInt();
        int leap = 0;
        if (year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0)
                    leap = 1;
                else
                leap = 0;
            }
            else
                leap = 1;
        }
        else
                leap = 0;
    if(leap == 1)
        System.out.println("Leap Year");
    else
        System.out.println("Not a Leap Year");

    }
}
