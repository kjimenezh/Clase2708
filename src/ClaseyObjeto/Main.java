
package ClaseyObjeto;
import java.util.Scanner;//para pedir datos

public class Main {
    
    public static void main (String [] args){
        
        Scanner lectura = new Scanner(System.in);
        Cuenta.global=50;
        Cuenta cuentaejemplo = new Cuenta(1,123,"f",100);//respetar orden de variables
        
        System.out.println("Numero " + cuentaejemplo.getNumero());
        System.out.println("Clave " + cuentaejemplo.getClave());
        System.out.println("Dueno " + cuentaejemplo.getDueno());
        System.out.println("Saldo " + cuentaejemplo.getSaldo());
        System.out.println("Saldo " + Cuenta.global);
        
        cuentaejemplo.setClave(123456);
        System.out.println("Clave " + cuentaejemplo.getClave());
        
        
        //Ejercicio
        Cuenta cuentaA = new Cuenta (1012,1234,"Magdalena Sanchéz",0);
        
        System.out.println("Ingrese el numero de cuenta");
        int cuenta = lectura.nextInt();
        System.out.println("Ingrese la clave");
        int clave = lectura.nextInt();
        System.out.println("Ingrese dueno");
        String dueno = lectura.next();
        System.out.println("Saldo");
        double saldo = lectura.nextDouble();
        
        Cuenta c1 = new Cuenta (cuenta,clave,dueno,saldo);
        c1.consignar(100000);
        System.out.println("Saldo " + c1.getSaldo());
        }
    
}
