package quadratic;

public class Main {
    /**
     * Value of a.
     */
    private static final double A = 4.5;

    /**
     * Value of b.
     */
    private static final double B = 42;

    /**
     * Value of c.
     */
    private static final double C = 7.2;

    /**
     * Printing out the results.
     * @param args arguments.
     */
    public static void main(String[] args){

        // Creating an object.
        TheQuadraticFunction quadraticFunction = new TheQuadraticFunction(A,B,C);

        System.out.println(quadraticFunction.eval(1));
        System.out.println(quadraticFunction.extremePoint());
        System.out.println(quadraticFunction.shiftedAlongXBy(1));
        System.out.println(quadraticFunction.shiftedAlongYBy(1));
        System.out.println(quadraticFunction.getA());
        System.out.println(quadraticFunction.getB());
        System.out.println(quadraticFunction.getC());

    }
}
