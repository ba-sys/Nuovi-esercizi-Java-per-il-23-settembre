import java.util.Scanner;

public class Rettangolo extends Figura{
	//base
	private int base;
	//Altezza
	private int altezza;
	//Metodo leggiDimensioni
	public void leggiDimensioni(){
		Scanner scanner = new Scanner(System.in);
		int base;
		int altezza;
		System.out.print("Inserire base del rettangolo: ");
		base = scanner.nextInt();
		while(base <= 0){
			System.out.print("Errore! Reinserisci una lunghezza positiva: ");
			base = scanner.nextInt();
		}
		this.base = base;
		System.out.print("Inserire altezza del rettangolo: ");
                altezza = scanner.nextInt();
                while(altezza <= 0){
			System.out.print("Errore! Reinserisci una lunghezza positiva: ");
                        altezza = scanner.nextInt();
                }
                this.altezza = altezza;
	}
	//Override di area
	@Override
	public int area(){
		int area = this.base * this.altezza;
		System.out.println("Area del rettangolo: " + area);
		return area;
	}
	//Metodo perimetro
	public int perimetro(){
		int perimetro = 2 * (this.base  + this.altezza);
		System.out.println("Perimetro del rettangolo: " + perimetro);
		return perimetro;
	}
}
