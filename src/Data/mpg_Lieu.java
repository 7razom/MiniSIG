package Data;

public class mpg_Lieu 
{
	private String rq_sql;
	
	public mpg_Lieu ()
	
	{
		this.rq_sql = null;
	}
	
	//Affiche un lieu
	public String Select_lieu()
	{
		this.rq_sql = "SELECT * FROM lieu";
		return this.rq_sql;
	}
	
	//Ajouter un lieu
	public String Ajout_lieu(String image, char libelle, char description, String Url)
	{
		this.rq_sql = "INSERT INTO lieu (Image_grd_lieu, Libelle_lieu, Description_lieu, Url_lieu VALUES (" + image + "," + libelle + "," + description + "," + Url + ")";
		return this.rq_sql;
	}
	
	public String Modif_lieu(char libelle )
	{
		this.rq_sql = "SELECT Image_grd_lieu, Libelle_lieu, Description_lieu, Url_lieu FROM lieu WHERE Libelle_Lieu = "+ libelle +"";
		return this.rq_sql;
	}
	
	public String Supprimer_lieu(char libelle )
	{
		this.rq_sql = "DELETE Id_lieu, Image_grd_lieu, Libelle_lieu, Description_lieu, Url_lieu FROM lieu WHERE Libelle_Lieu = "+ libelle +"";
		return this.rq_sql;
	}
}
