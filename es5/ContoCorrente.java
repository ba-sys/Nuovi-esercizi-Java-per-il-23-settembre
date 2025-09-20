public class ContoCorrente extends Conto{
	public ContoCorrente(int saldo){
		super(saldo);
	}
	//Override di preleva
	@Override
	public void preleva(int prelievo){
		prelievo++;
		if(controllo(prelievo)) this.saldo -= prelievo;
		else this.saldo = 0;
	}
}
