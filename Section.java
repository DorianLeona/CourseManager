import java.util.*;
import java.io;

public class Section
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

	int totalSeats;
	int openSeats;
	int waitlist;
	
	List<Student> enrolled[];
	List<Student> waitlisted[];


	//--- Methods ---//
	public Section()
	{
		this.courseCode = "ABCD-000";
		this.sectionNum = "00000";
		this.component = "Lecture";
		this.professor = "Firstname Surname";
		
		this.meetingDays = new String[3] = {"M", "W", "F"};
		this.start = new Time();
		this.end = new Time();
		this.duration_hours = 0;
		this.duration_minutes = 0;

		int totalSeats = 50;
		int openSeats = 50;
		int waitList = 0;

		this.enrolled = new List<Student>[50];
		this.waitlisted = new List<Student>[30];
	};


	//Replace placeholder data with object-specific info from a formatted dataString//
	public establish(String sectionDetails)
	{

	};

	
	//Polymorphic. This version simply requires the sectionNumber for the object to be initialized//
	public establish(String sectionNumber)
	{

	};








}
//End class//
