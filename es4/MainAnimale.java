public class MainAnimale{
	public static void main(String[] args){
		int animaleLength = 2; //dimensione array impostata a 2
		Animale[] animali = new Animale[animaleLength];
		//Creazione di cane in array di animali
		animali[0] = new Cane();
		//Creazione di gatto in array di animali
		animali[1] = new Gatto();
		//Richiamo di verso su tutti gli animali
		for (int i = 0; i < animaleLength; i++){
                        animali[i].verso();
                }
	}
}
