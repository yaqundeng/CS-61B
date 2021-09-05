public class LargerDemo {
    public static int Larger(int x, int y) {
      if ( x > y) {
          return x;
      }
      return y;
    }
      
    public static void main(String[] args){
        System.out.println(Larger(1,30));
    }
}

/**
1. Functions must be declared as part of a class in Java. eg. Here "int Larger(int x, int y)" is a function, and it is part of the class LargerDemo.
   A function that is a part of class is a method. So in Java, all functions are menthods.
2. To define a function in Java, we use "public static". Will see more.
3. All parameters in Java must have a declared type. eg. int x;
   retuen value of a function must have a declared type. eg. public static int;
   Functions in Java return only one value.
*/
