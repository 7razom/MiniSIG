package Data;

public class mpg_POI
{
	private String rq_sql;
	
	public mpg_POI ()
	{
		this.rq_sql = null;
	}
	
	//Selection
	public String SelectAll()
	{
		this.rq_sql = "SELECT * FROM poi;";
		return rq_sql;
	}
}
