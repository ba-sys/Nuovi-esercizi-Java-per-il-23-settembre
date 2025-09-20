public class Conto{
	//Attributo saldo
	protected int saldo;
	//Costruttore
	public Conto(int saldo){
		if(saldo >= 0)this.saldo = saldo;
		this.saldo = 0;
	}
	//Metodo deposita
	public void deposita(int deposito){
		if(controllo(deposito)) this.saldo += deposito;
                else this.saldo = 0;

	}
	//Metodo preleva
	public void preleva(int prelievo){
		if(controllo(prelievo)) this.saldo -= prelievo;
		else this.saldo = 0;
	}
	//Metodo controllo
	protected boolean controllo(int differenza){
		if(differenza <= this.saldo) return true;
		else return false;
	}
	//Metodo mostraSaldo
	public void mostraSaldo(){
		System.out.println("Saldo attuale: " + this.saldo);
	}
}
