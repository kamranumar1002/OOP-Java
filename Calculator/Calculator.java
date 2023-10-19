public class Calculator {
    private double num1;
    private double num2;
    
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double calcs(int choice){
        switch (choice) {
            case 1:
                return this.num1 + this.num2;
            case 2:
                return this.num1 - this.num2;
            case 3:
                return this.num1 * this.num2;
            case 4:
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                    return 0.0;
                }
                return this.num1 / this.num2;
            default:
                System.out.println("Invalid choice.");
                return 0.0;
        }
    }
}
