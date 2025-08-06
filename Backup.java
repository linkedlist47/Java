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
    //constructors
    class Main {
    public static void main(String[] args) {
        int i=10,a=40;
        Rectangle ob = new Rectangle(10,20);
    }
}
class Rectangle {
    int length=90, breathe=90;
   Rectangle(int i, int a) {
        this.length = i;
        this.breathe = a;
        getarea();
    }
    void getarea() {
        System.out.print(length*breathe);
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//solo shi
class Main {
    public static void main(String [] args) {
        Library outer = new Library("Harverd","Harverd camps");
        Library.Books inner = outer.new Books("Fyodor","Crime and Punishment",100);
    }
}
class Library {
    protected String libname;
    protected String address;
    Library(String l, String a) {
        libname = l;
        address = a;
    }
    class Books {
         String authorname;
         String bookname;
         int price;
        Books(String name, String book, int price) {
           try {
                this.authorname = name;
                this.bookname = book;
                this.price = price;
                display();
            } catch (Exception e) {
                System.out.print("hehe");
            }
        }
        void display() {
            System.out.printf("Library : %s Library\nAddress : %s\n========================\nAuthorname: %s\nBook name: %s\nprice : %d",libname,address,authorname,bookname,price);
        }
    } 
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Inheritance
class Main {
 public static void main(String [] args) {
     Dog a = new Dog();
     Cat b = new Cat();
     Dog d = new Dog();
     Puppy p = new Puppy();
     a.bark();
     b.meow();
     d.bark();
     p.speak();
 }    
}
class Animal {
    void sound() {
        System.out.println("hello");
    } 
}
class Dog extends Animal {
   
    void bark() {
        System.out.println("mewo");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("bark...");
    }
}
class Puppy extends Dog {
    void speak() {
        System.out.println("Breaking bad");
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;

class Main {
    public static void main(String[] args) {
        Addition a = new Addition();
        a.addition();
    }
}
class MathOperations {
    int add(int a, int b) {return a+b;}
    int sub(int a, int b) {return a-b; }
    int mul(int a, int b) {return a*b; }
    int div(int a, int b) {
        if(b==0) return 0;
        return a*b;
    }
}
class Addition extends MathOperations {
    void addition() {
        Scanner ob= new Scanner(System.in);
        int a = ob.nextInt();
        int b = ob.nextInt();
        System.out.println("Addition : "+add(a,b));
        // ob.close();
    }
}
class Subraction extends MathOperations {
    void subraction () {
        Scanner ob = new Scanner(System.in);
        int a= ob.nextInt();
        int b = ob.nextInt();
        System.out.println("Subraction : "+ sub(a,b));
        // ob.close();
    }
}
class Multiplication extends MathOperations {
    void multi () {
        Scanner ob = new Scanner (System.in);
        int a = ob.nextInt();
        int b = ob.nextInt();
        System.out.print("just");
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//methode overloading
class Main {
    public static void main(String [] args) {
        Adder ob = new Adder();
         System.out.println(ob.addition(20,20));
        System.out.println(Adder.add());
        System.out.println(Adder.add(10,20));
        System.out.println(Adder.add(10,20,30));
        
    }
}
class Adder {
    int addition(int a , int b) {
        return a+b;
    }
    static int add(int a , int b) {
        return a+b;
    }
    static int add() {
        return 0;
    }
    static int add(int a, int b, int c) {
        return a+b+c;
    }
}  
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------























    
