class Complex {
    int real;
    int imag;
    Complex(int r, int i) {
        real = r;
        imag = i;
    }
    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }
    Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }
    Complex multiply(Complex c) {
        int r = this.real * c.real - this.imag * c.imag;
        int i = this.real * c.imag + this.imag * c.real;
        return new Complex(r, i);
    }
    void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }
}
public class complex_multiplication {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, 7);

        System.out.print("c1 = ");
        c1.display();

        System.out.print("c2 = ");
        c2.display();

        Complex sum = c1.add(c2);
        System.out.print("Sum = ");
        sum.display();

        Complex diff = c1.subtract(c2);
        System.out.print("Difference = ");
        diff.display();

        Complex prod = c1.multiply(c2);
        System.out.print("Product = ");
        prod.display();
    }
}
