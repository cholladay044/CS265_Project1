import java.util.*;

public class CS265_Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first complex number: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        Complex c1 = new Complex(a, b);
        
        System.out.println("Enter the second complex number: ");
        double c = input.nextDouble();
        double d = input.nextDouble();
        Complex c2 = new Complex(c, d);
       
        System.out.println("(" + c1.getRealNumber() + " + " + c1.getImginaryNumber() +
                ")" + " + "+ "(" + c2.getRealNumber() + " + " + c2.getImginaryNumber() +
                ") = " +c1.add(c2));
        System.out.println("(" + c1.getRealNumber() + " + " + c1.getImginaryNumber() +
                ")" + " - "+ "(" + c2.getRealNumber() + " + " + c2.getImginaryNumber() +
                ") = " +c1.subtract(c2));
        System.out.println("(" + c1.getRealNumber() + " + " + c1.getImginaryNumber() +
                ")" + " * "+ "(" + c2.getRealNumber() + " + " + c2.getImginaryNumber() +
                ") = " +c1.multiply(c2));
        System.out.println("(" + c1.getRealNumber() + " + " + c1.getImginaryNumber() +
                ")" + " / "+ "(" + c2.getRealNumber() + " + " + c2.getImginaryNumber() +
                ") = " +c1.divide(c2));
        
        try{
            Complex c3 = (Complex)c1.clone();
            System.out.println(c1 == c3);
            System.out.println(c3.getImginaryNumber());
            System.out.println(c3.getRealNumber());
        }
        catch (CloneNotSupportedException ex){
            System.out.println("Clone NOT supported.");
            
        }  
    }
}
