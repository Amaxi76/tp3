public class Cryptomonnaie
{
	private String nom;
	private double valeurDeJeton; // Imaginons en euros

	public Cryptomonnaie(String nom, double valeurDeJeton)
	{
		this.nom           = nom;
		this.valeurDeJeton = valeurDeJeton;
	}

	public String getNom          () { return this.nom;           }

	public double getValeurDeJeton() { return this.valeurDeJeton; }

	@Override
	public String toString()
	{
		return String.format("%5s", this.nom) + ":" + String.format("%10.1f", this.valeurDeJeton);
	}
}