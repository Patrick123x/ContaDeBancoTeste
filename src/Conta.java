
public class Conta {
	
	private double saldo;
	private int numero;
    private Cliente titular; 
    
   public void deposita(double valor) {
	   
    	this.saldo += valor;
    	
   
   }
   
   public boolean saca(double valor) {
	   if(this.saldo >= valor) {
		   
		   this.saldo -= valor;
		   
		   return true;
		   
	   }else {
		   
		   return false;
		   
	   }
   }
   
   public boolean transfere(double valor, Conta destino){
	   
	   if(this.saldo >= valor) {
		   this.saldo -= valor;
		   destino.deposita(valor);
		   return true;
		   
	   }
		   return false;
	   }
   
   public double getSaldo() {
   return this.saldo;
   
   }
   
   public int getNumero() {
	   return this.numero;	
	   
   }
		   public void setNumero(int numero){
			   if(numero <=0) {
				   System.out.println("Não pode valores menor do que 0");
				   return;
			   }
			   
			   this.numero = numero;
		   }
	   
		   public void setTitular(Cliente titular) {
			this.titular = titular;
		}
   
		    public Cliente getTitular() {
		        return titular;
		    }
		    
		}


