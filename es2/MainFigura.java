public class MainFigura{
        public static void main(String[] args){
		int figuraLength = 2; //dimensione array impostata a 2
		Figura[] figure = new Figura[figuraLength];
		//Creazione di oggetti rettangolo in array di Figura
		for (int i = 0; i < figuraLength; i++) {
			Rettangolo rettangolo = new Rettangolo();
			rettangolo.leggiDimensioni();
			figure[i] = rettangolo;
		}
		//Richiamo area su ciascun oggetto
		for (int i = 0; i < figuraLength; i++){
                        figure[i].area();
                }
        }
}

