import java.util.Scanner;

public class MainBanca{
	public static void main(String[] args){
		int contoLength = 2; //dimensione array impostata a 2
		int depositoDefault = 1618;
		int prelievoDefault = 618;
		//Creazione di array di Conti
		Conto[] conti = new Conto[contoLength];
		Scanner scanner = new Scanner(System.in);
		//Creazione di ContoCorrente in array di conti
		System.out.print("Inserire saldo iniziale del conto corrente: ");
                conti[0] = new ContoCorrente(scanner.nextInt());
                //Creazione di ContoRisparmio in array di conti
		System.out.print("Inserire saldo iniziale del conto risparmio: ");
                conti[1] = new ContoRisparmio(scanner.nextInt());
		//Richiamo di deposita e preleva in ogni conto
		for(int i = 0; i < contoLength; i++){
			conti[i].deposita(depositoDefault);
			conti[i].preleva(prelievoDefault);
		}
	}
}
