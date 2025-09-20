import java.util.Scanner;

public class Studente extends Persona{
	//Attributo voto
	private byte voto;
	//Metodo leggiDati
	public void leggiDati(){
		Scanner scanner = new Scanner(System.in);
		byte voto;
                System.out.print("Inserire nome dello studente: ");
                this.nome = scanner.next();
		System.out.print("Inserire voto dello studente: ");
		voto = scanner.nextByte();
		while(voto < 0 || voto > 10){
			System.out.print("Errore! Reinserisci un voto tra 0 e 10: ");
			voto = scanner.nextByte();
		}
		this.voto = voto;
	}
	//Override di descrivi
	@Override
	public void descrivi(){
		if(this.voto >= 6)System.out.println("Lo studente " + this.nome + " e stato promosso");
		else System.out.println("Lo studente " + this.nome + " e stato bocciato");
	}
}
