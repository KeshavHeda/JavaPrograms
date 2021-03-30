public class ChallengeComplexNumber {
    private double real;
    private double imaginary;

    public ChallengeComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add(double real, double imaginary) {
        this.real = this.getReal() + real;
        this.imaginary = this.getImaginary() + imaginary;
    }

    public void add(ChallengeComplexNumber complexNumber) {
        this.real = this.getReal() + complexNumber.getReal();
        this.imaginary = this.getImaginary() + complexNumber.getImaginary();
    }

    public void subtract(double real, double imaginary) {
        this.real = this.getReal() - real;
        this.imaginary = this.getImaginary() - imaginary;
    }

    public void subtract(ChallengeComplexNumber complexNumber) {
        this.real = this.getReal() - complexNumber.getReal();
        this.imaginary = this.getImaginary() - complexNumber.getImaginary();
    }

}
