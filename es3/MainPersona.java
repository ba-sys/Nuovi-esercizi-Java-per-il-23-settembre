public class MainPersona{
	public static void main(String[] args){
		int personaLength = 2; //dimensione array impostata a 2
		Persona[] persone = new Persona[personaLength];
		//Creazione di persona in array di persone
		persone[0] = new Persona();
		//Creazione di studente in array di persone
		Studente studente = new Studente();
		studente.leggiDati();
		persone[1] = studente;
		//Richiamo di descrivi sulle persone
		for (int i = 0; i < personaLength; i++){
                        persone[i].descrivi();
                }
	}
}
