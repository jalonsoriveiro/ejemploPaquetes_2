package triangulo;
/**
 *
 * @author jalonsoriveiro
 */
public class Perimetro {
    
   public void periTrianguloIsosceles(float base,float altura){
   
   float lado =(float) Math.sqrt(Math.pow(altura,2)+Math.pow(base/2,2));
   float perimetro = 2*lado+base;
       System.out.println("perimetro Triangulo = "+perimetro);
   }
}
