package ejemplopaquetes;

import com.jose.circulo.AreaCirculo;
import com.jose.circulo.Lonxitude;
import triangulo.Area;
import triangulo.Perimetro;
import validaciones.*;
/**
 *
 * @author jalonsoriveiro
 */
public class EjemploPaquetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Area  tri = new Area();
            tri.areaTriangulo(6f, 2f);
            Perimetro per = new Perimetro();
            per.periTrianguloIsosceles(6f, 2f);
            
            AreaCirculo cir = new AreaCirculo();
            cir.areaCirculo(8);
            Lonxitude cir2 = new Lonxitude();
            cir2.lonxitude(8); 
            
            Validar obj6 = new Validar();
            float n = Validar.validaFloatPositivo();
            
            //obj6.validaFloatPositivo();
           
            
           
           
    }    
    
}
