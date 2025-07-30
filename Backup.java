//largest of 3
import java.util.*;
public class OddEvenCheck {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
      
        if(a>b&&a>c) {
            System.out.print("a");
        }
        else if(b>a&&b>c){
            System.out.print("b");
        }
        else {
            System.out.print("c");
        }
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//leap year
  import java.util.*;

class Main {
    public static void main(String [] args) {
        Scanner ob = new Scanner(System.in);
        long n = ob.nextLong();
        if(n%4==0&&n%100!=0 || n%400==0) {
            System.out.print("leap");
        }
        else{
            System.out.print("nope");
        }
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  //calc
  import java.util.*;

class Main {
    public static void main(String [] args) {
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        int b = ob.nextInt();
        System.out.println("+ - * /");
        char c = ob.next().charAt(0);
        int result=0;
        switch(c) {
          case '+' :
            result= a+b;break;
            case '-':
              result= a-b;break;
              case '*':
                result =a*b;break;
                case '/' :
                  if(b==0) {
                    System.out.print("nah uh");
                  }
                  else {
                    result= a/b;
                  }
        }
        System.out.print(result);
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
