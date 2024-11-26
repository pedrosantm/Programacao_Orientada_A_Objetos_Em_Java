import java.math.*;

import javax.swing.JOptionPane;
public class Equacao {
    private double a;
    private double b;
    private double c;
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }


    public double delta(double a, double b, double c){
        return (Math.pow(b, 2)) - 4*a*c;
    }

    public double retornax1(double a, double b, double c, double delta){
        if (delta < 0) {
           return 0;
        }else{
            return (-b + Math.sqrt(delta)) / (2 * a);
        }
        
    }

    public double retornax2(double a, double b, double c, double delta){
        if (delta < 0) {
            return 0;
         }else{
             return (-b - Math.sqrt(delta)) / (2 * a);
         }
    }
    
}
