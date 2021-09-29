import java.util.ArrayList;
import java.util.Collections;

public class Main {

  static boolean firstTask(int number) {
        int s1 = number % 100 / 10 + number % 10;
        int s2 = number / 1000 + number / 100 % 10;
        if (s1 == s2) {
            return true;
        }
        return false;
    }

    static double secondTask(double a, double b, double c) {
      return (b + Math.sqrt(Math.pow(b,2) + 4*a*c))/2 - Math.pow(a,3)*c + Math.pow(b, -2);
    }

    static double thirdTask(double a, double b) {
        return 0.5*a*b;
    }

    static boolean fourthTask(double x, double y) {
      if (x <= 2 && y <= 4 && x >= -2 && x>=0) {
          return true;
      } else if (x <= 4 && x >= -4 && y >= -3 && y <= 0) {
          return true;
      }
      return false;
    }

    static String fifthTask(double a, double b, double c)  {
      a = (a > 0) ? Math.pow(a,2) : Math.pow(a, 4);
      b = (b > 0) ? Math.pow(b,2) : Math.pow(b, 4);
      c = (c > 0) ? Math.pow(c,2) : Math.pow(c, 4);
        return a + " " + b + " " + c;
    }

    static double sixthTask(double a, double b, double c)  {
      ArrayList<Double> arrayList = new ArrayList<>();
      arrayList.add(a);
      arrayList.add(b);
      arrayList.add(c);
      return Collections.max(arrayList) + Collections.min(arrayList);
    }

    static void seventhTask(double a, double b, double h)  {
      double fx = 0;
        for(double i=a; i<=b; i+=h) {
            double x=i;
            fx = Math.tan(x);
            System.out.println(fx);
        }
    }

    static int eighthTask(int[] a, int k)  {
      int sum = 0;
      for ( int elem: a) {
          if (elem % k == 0) {
              sum += elem;
          }
      }
      return sum;
    }



    public static void main(String[] args) {
        System.out.println(firstTask(1111));
        System.out.println(secondTask(2,3,4));
        System.out.println(thirdTask(2,3));
        System.out.println(fifthTask(2,3, 4));
        System.out.println(sixthTask(2,3, 4));
        seventhTask(1,5, 0.5);
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        System.out.println(eighthTask(intArray,2));

    }
}
