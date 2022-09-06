public class Main {

    //0 1 2 3 4 5 6
    //1 1 2 3 5 8 13
    static int fib_r(int n) {
        if (n == 0) {
            System.out.println(1);
            return 1;
        }
        if(n == 1) {
            System.out.println(1);
            return 1;
        }

        int a = fib_r(n-1);
        //System.out.println("a = " + a);
        int b = fib_r(n-2);
        //System.out.println("b = " + b);
        int c = a + b;
        //System.out.println("c = " + c + " (" + a + "+" + b + ")");
        return c;
    }


    static int fib(int n) {
        if (n == 0)
            return 1;
        if(n == 1)
            return 1;

        int a = 1;
        int b = 1;
        int res = 0;
        for(int i=2; i<n; i++) {
            res = a + b;
            b = a;
            a = res;
        }

        return res;
    }


    public static void main(String[] args) {
        fib(5);
    }
}
