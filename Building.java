import java.util.*;
import java.io.*;

public class Building
{
	//-------------------- Members of the Class --------------------//
	String name;
	Address streetAddress;
	String ID;
	int lowestFloor;
	int topFloor;

	//-------------------- Methods of the Class --------------------//
	public Building()
	{
		this.name = "Unknown Building";
		this.ID = "NULL";
		this.lowestFloor = 1;
		this.topFloor = 1;
	};


	public void init(String id)
	{
		//Call the private method, Building.retrieve()//
		String buildingString = this.retrieve(id);
		
		String data[] = buildingString.split("/");
		
		this.name = data[0];
		this.ID = data[1];
		this.lowestFloor = data[2];
		this.topFloor = data[3];

		//Call Address.init()//
		String addressString = data[4];
		this.streetAddress.init(addressString);
	};


	private String retrieve(String ID)
	{
		
	};

}
//End class//
