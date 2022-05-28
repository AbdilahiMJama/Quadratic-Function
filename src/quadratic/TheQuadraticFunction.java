package quadratic;

/**
 * This is a representation of a Quadratic Function that takes the shape
 * of f(x) = ax^2 + bx + c where a,b and c are Real numbers and a is not equal to
 * zero.
 * @author Abdilahi MJ
 */
public class TheQuadraticFunction {
    /**
     * The first unknown variable a.
     */
    private final double a;

    /**
     * The second unknown variable b.
     */
    private final double b;

    /**
     * The third unknown variable c.
     */
    private final double c;

    /**
     * The constructor initializes the variables.
     * @param a is a
     * @param b is b
     * @param c is c
     */
    public TheQuadraticFunction(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    // Getters
    public double getA() {return this.a;}
    public double getB() {return this.b;}
    public double getC() {return this.c;}

    // Evaluates the value of x in f(x)
    public double eval(double x) {
        return (this.a * Math.pow(x,2)) +this.b * x + this.c ;
    }

    // Evaluates the extreme point of the fucnction.
    public double extremePoint() {
        return -this.b / (this.a * 2);
    }

    // It gets the result of the function after a vertical shift by a value of delta y.
    public TheQuadraticFunction shiftedAlongYBy(double deltay) {
        return new TheQuadraticFunction(this.a,this.b, this.c + deltay);
    }

    // It gets the result of the function
    public TheQuadraticFunction shiftedAlongXBy(double deltax) {
        return new TheQuadraticFunction(this.a,
                this.b - 2 * deltax * this.a,
                this.c + this.a * deltax * deltax - this.b * deltax);
    }

    // toString() method to return a string representation of the quadratic equation
    // in the form of a*x^2 + b*x + c
    @Override
    public String toString() {
        return String.format("%s*x^2 + %s*x + %s", this.a,this.b,this.c);
    }
}
