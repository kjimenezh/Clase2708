
package ClaseyObjeto;


public class Cuenta {
    
    private int numero;
    private int clave;
    private String dueno;
    private double saldo;
    public static int global; //ambito de clase
            
    public Cuenta(int numero, int clave, String dueno, double saldo){ //numero=a si Cuenta (int a)
            this.numero = numero; //variable que me pertenece como objeto
            this.clave = clave;
            this.dueno = dueno;
            this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public static int getGlobal(){
        return global;
    }
   
    public boolean consignar(double valor){
        if(valor > 0){
            this.saldo = this.saldo + valor;
            return true;
        }else{
        return false;
        }
    } 
    
    public boolean retirar(double valor){
        if(valor > 0 && valor < this.saldo){
            this.saldo -= valor; //Equivalente a this.saldo = this.saldo-valor;
            return true;
        }else{
        return false;
        }
    }
    
    public boolean cambiarClave(int clave){
        this.clave = clave;
        return true;
    }
    
    public double consultarSaldo(){
        return this.saldo;
    }
}
