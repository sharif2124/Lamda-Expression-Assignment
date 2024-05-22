package lamda_expression;

public class Lambda_Calculator {
    @FunctionalInterface
    interface Summation
    {
     int sum(int i, int j);
    }

    @FunctionalInterface
    interface Subtraction
    {
        int sub(int i,int j);
    }

    @FunctionalInterface
    interface Multiplication
    {
        double mul(double i, double j);
    }

    @FunctionalInterface
    interface Divided
    {
        double div (double i, double j);
    }

    @FunctionalInterface
    interface Remainder
    {
        double rem  (int i, int j);
    }
    public static void main(String[] args) {
        Summation obj = (i,j) -> i+j;
        int result = obj.sum(10,20);
        System.out.println("Summation is : "+result);

        Subtraction obj2 = (i,j)-> i-j;
        int sub = obj2.sub(50,10);
        System.out.println("Subtraction is : "+sub);


        Multiplication obj3 = (i,j)-> i*j;
        double mul = obj3.mul(4.5,3.2);
        System.out.println("Multiplication is : "+mul);


        Divided obj4 = (i,j)-> i/j;
        double div = obj4.div(7.5,3.3);
        System.out.println("Divided is : "+div);


        Remainder obj5 = (i,j)-> i%j;
        double rem = obj5.rem(7,3);
        System.out.println("Remainder is : "+rem);
    }
}
