import java.util.ArrayList;

import javax.sound.sampled.Port;

public class CryptoMarche {

	private ArrayList<Portefeuille> portefeuilles;
	private static CryptoMarche marche;

	private CryptoMarche(){
		portefeuilles = new ArrayList<Portefeuille>();
	}

	public static CryptoMarche getInstance(){
		if(marche == null){ marche = new CryptoMarche();}
		return marche;
	}

	public void ajouter(Portefeuille p){
		portefeuilles.add(p);
	}

	/**
	 * Cette fonction recherche sur le marché tous les portefeuilles 
	 * du propriétaire et calcule son capital en euros. 
	 * @param proprietare
	 * @return capital en euros du propriétare.
	 */
	public double capitalEnEuros(String proprietaire)
	{
		int capital = 0;

		for ( Portefeuille p : this.portefeuilles )
			if ( p.getProprietaire().equals ( proprietaire ) )
				capital += p.valeurEnEuros();

		System.out.println(capital);
		return capital;
	}

	/**
	 * Cette fonction recherche sur le marché tous les portefeuilles 
	 * d'un type de devise et calcule le volume total de capital de 
	 * cette devise sur le marché 
	 * @param monnaie
	 * @return capital total en circulation de la cryptomonnaie (en euros).
	 */
	public double capitalMonneaie(Cryptomonnaie monnaie)
	{
		int capitalT = 0;

		for ( Portefeuille p : this.portefeuilles)
			if ( p.getMonnaie() == monnaie )
				capitalT += p.valeurEnEuros();

		return capitalT;
	}

	@Override
	public String toString() {
		String ret = "";
		for(Portefeuille p : this.portefeuilles){
			ret += p.toString() + "\n";
		}
		return ret;
	}

}