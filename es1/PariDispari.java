import java.util.Scanner;

public class PariDispari extends Numero{
	//Metodo leggiIntero
	public void leggiIntero(){
		Scanner scanner = new Scanner(System.in);
		int valore;
		System.out.print("Inserisci un numero intero positivo: ");
		valore = scanner.nextInt();
		while(valore <= 0){
			System.out.print("Errore! Reinserisci un numero intero positivo: ");
			valore = scanner.nextInt();
		}
		setValore(valore);
	}
	//Override di descrivi
	@Override
	public void descrivi(){
		if(getValore() % 2 == 0)System.out.print("Il numero e pari");
		else System.out.print("Il numero e dispari");
	}
}
