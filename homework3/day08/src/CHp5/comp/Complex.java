package CHp5.comp;

public class Complex {
    double real;
    double im;

    public Complex add(Complex c){
        c.im = this.im+c.im;
        c.real = this.real+c.real;
        return c;
    }
    public Complex chen(Complex e){
        Complex c = new Complex();
        c.im = this.real*e.im+this.im*e.real;
        c.real = (this.real*e.real) - (this.im*e.im);
        return c;
    }
}
