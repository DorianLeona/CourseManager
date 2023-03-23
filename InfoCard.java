import java.util.*;
import java.io;

public class InfoCard
{
	//members//
	String courseCode;
	String sectionNum;
	String component;
	String professor;

	String[] meetingDays;
	Time start;
	Time end;
	int duration_hours;
	int duration_minutes;

	int openSeats;

	//--- Methods ---//
	public Section()
	{
		this.courseCode = "ABCD-000";
		this.sectionNum = "00000";
		this.component = "Lecture";
		this.professor = "Firstname Surname";
		
		this.meetingDays = new String[3] = {"Mon", "Tues", "Wednes", "Thurs", "Fri"};
		this.start = new Time();
		this.end = new Time();
		this.duration_hours = 0;
		this.duration_minutes = 0;

		int openSeats = 50;
	};


	//Replace placeholder data with object-specific info from a formatted dataString//
	public establish(String sectionDetails)
	{

	};

	
	public 
	{

	};








}
//End class//
