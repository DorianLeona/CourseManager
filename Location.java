import java.util.*;
import java.io.*;

public class Location
{
	//-------------------- Members of the Class --------------------//
	Building campus_building
	String building_name;
	String roomNum;
	String room;
	int floor;
	

	//-------------------- Methods of the Class --------------------//
	public Location()
	{
		building = new Building();
		this.building_name = "NULL";
		this.roomNum = "000";
		this.room = "NULL 000";
		this.floor = -1;
	};


	public void init(String locationData)
	{
		//Call Building.init()//
		String data[] = locationData.split("/");

		String buildingID, roomNumber, floorNumber;
		
		buildingID = data[0];
		roomNumber = data[1];
		floorNumber = data[2];

		this.campus_building.loadIn(buildingID);
		this.roomNum = roomNumber;

		//Convert floorNumber from String --> int for storage//
		this.floor = Integer.parseInt(floorNumber);

		this.building_name = this.campus_building.getName();
		this.room = buildingID + " " + roomNumber;
	};

	
	public Building getBuilding()
	{
		return this.Building;
	};


	public String getBuildingName()
	{
		return this.building_name;
	};


	public String getRoom()
	{
		return this.room;
	};


	public int getFloor()
	{
		return this.floor;
	};
}
//End class//
