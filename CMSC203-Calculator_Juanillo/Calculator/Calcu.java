package Calculator;

public class Calcu {
   
    public int Addition(int num1, int num2) {
        return num1 + num2;
    }

    public int Subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public int Multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public float Division(float num1, float num2) {
        if (num2 == 0){
            System.out.println("Can't divide by zero, return to zero!");
            return 0;
        }
        return num1 / num2;
    }
}
