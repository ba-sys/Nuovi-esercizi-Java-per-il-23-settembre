public class ContoRisparmio extends Conto{
	public ContoRisparmio(int saldo){
		super(saldo);
	}
	//Override di deposita
	@Override
	public void deposita(int deposito){
		deposito = (int)(deposito * 0.49f);
                if(controllo(deposito)) this.saldo += deposito;
                else this.saldo = 0;
        }
}
