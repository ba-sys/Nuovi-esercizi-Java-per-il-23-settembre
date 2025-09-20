public class Numero {
	//Attributo valore (intero)
	private int valore;
	//Costruttori
	public Numero(){
		this.valore = 0;
	}
	public Numero(int valore){
		setValore(valore);
	}
	//Getter
	public int getValore(){
		return this.valore;
	}
	//Setter
	public void setValore(int valore){
		this.valore = valore;
	}
	//Metodo descrivi
	public void descrivi(){
		System.out.println("Sono un numero generico");
	}
}
