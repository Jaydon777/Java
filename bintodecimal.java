import java.util.*;

public class bintodecimal {
    
  public static void main(String[] args) {

    int num;
    Scanner s = new Scanner(System.in);
    num = s.nextInt();
    int decimal = convertBinaryToDecimal(num);
    System.out.println(decimal);

  }

  public static int convertBinaryToDecimal(int num) {
    int decimalNumber = 0, i = 0;
    long remainder;
    
    while (num != 0) {
      remainder = num % 10;
      num /= 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    }
    
    return decimalNumber;
  }
}