public class MainNumero{
	public static void main(String[] args){
		PariDispari pariDispari = new PariDispari();
		pariDispari.leggiIntero();
		pariDispari.descrivi();
		Numero numero = new Numero(pariDispari.getValore());
		numero.descrivi();
	}
}
