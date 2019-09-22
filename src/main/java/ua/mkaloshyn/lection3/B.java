package ua.mkaloshyn.lection3;

public class B {

    public static void main(String[] args) {

    int[] arr = {1,2};

    int x;

   /* for (x:arr) {
        System.out.println(x);
    }*/

   float f = 29.1f;
   double d = 29.1;

        System.out.println(f==d);

        f= 29.1f;
        d= 29.1f;
        System.out.println(f==d);

        int i=1;
        long l =1L;
        System.out.println(i==l);
}
}