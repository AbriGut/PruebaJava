package examenes;
import java.util.Scanner;
public class Examen1 {
    public static void main(String[] args) {
        int i;
        float[] lado = new float [5];
        float[] apotema = new float [5];
        double[] perimetro = new double [5];
        double[] area= new double [5];
        Scanner leer=new Scanner (System.in);
    for(i=0;i<=4;i++)
    {
        System.out.println("Medida del lado");
        lado[i]=leer.nextFloat();
        System.out.println("Medida del apotema");
        apotema[i]=leer.nextFloat();
        
        perimetro[i]=lado[i]*8;
        area[i]=(perimetro[i]*apotema[i])/2;
        System.out.println("El perimetro es: "+perimetro[i]);
        System.out.println("El perimetro es: "+area[i]);
    }
        }
    }
    
