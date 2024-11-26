import java.math.*;

public class Soluçoes {
    private float a;
    private float b;
    private float c;

    // Getters e Setters
    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    // Verifica se 'a' é um número primo
    public boolean primo() {
        if (this.a <= 1 || this.a % 1 != 0) return false; // Números <= 1 ou não inteiros não são primos
        int num = (int) this.a;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Verifica se 'a' é um número perfeito
    public boolean perfeito() {
        if (this.a <= 0 || this.a % 1 != 0) return false; // Apenas inteiros positivos podem ser perfeitos
        int num = (int) this.a;
        int soma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }
        return soma == num;
    }

    // Calcula o fatorial de 'a'
    public int fatorial() {
        if (this.a < 0 || this.a % 1 != 0) return -1; // Apenas inteiros positivos têm fatorial
        int num = (int) this.a;
        int resultado = 1;
        for (int i = num; i > 0; i--) {
            resultado *= i;
        }
        return resultado;
    }

    // Calcula o valor de delta
    public double delta(float a, float b, float c) {
        return (Math.pow(b, 2)) - 4 * a * c;
    }

    // Retorna o valor de X1
    public double retornax1() {
        double delta = this.delta(this.a, this.b, this.c);
        if (delta < 0) {
            return Double.NaN; // Indica que não há solução real
        } else {
            return (-b + Math.sqrt(delta)) / (2 * a);
        }
    }

    // Retorna o valor de X2
    public double retornax2() {
        double delta = this.delta(this.a, this.b, this.c);
        if (delta < 0) {
            return Double.NaN; // Indica que não há solução real
        } else {
            return (-b - Math.sqrt(delta)) / (2 * a);
        }
    }
}
