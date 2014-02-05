package Metier;
import Data.*;

import java.sql.*;

public class Processus_POI 
{
	private CAD oCAD;
	
	public Processus_POI()
	{
		oCAD = new CAD("jdbc:mysql://127.0.0.1/minisig", "root", "", "com.mysql.jdbc.Driver");
	}

	private mpg_POI oMpg;
	String NomMembre;
	ResultSet result;
	
	//Charger les POI sur la carte
	public void AfficherPOI()
	{
		
	}
	
	//Créer des POI
	public void CreerPOI()
	{
		
	}
	
	//Modifier des POI
	public void ModifPOI()
	{
		
	}
	
	//Voir un POI dans la panel de droite
	public void ConsulterPOI(int Id_POI)
	{
		try
		{
		result = oCAD.getRows(oMpg.SelectAll());
		}
		catch (SQLException ex) 
		{
			
		}
	}
	
	
	
}
