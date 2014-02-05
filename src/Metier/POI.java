package Metier;

public class POI extends Point implements Affichable
{
	private String libelle;
	private String description;
	private String url; //A CHANGER ! Quel type mettre pour une image ?
	private String image;
	
	public POI(String libelle, String description, String url, String image, int x, int y)
	{
		super(x, y); 
		this.libelle = libelle;
		this.description = description;
		this.url = url;
		this.image = image;
	}
}
