public class Grade_Check_Ex {
private	String name;
private	int gpa; 
	void setname(String N)
	{
		name = N;
	}
	void setgpa(int G)
	{
		gpa = G;
	}
	String getname()
	{
		return name; 
	}
	int getgpa()
	{
		return gpa;
	}
	boolean Gradecheck ()
	{
		if (gpa > 60)
			return true;
		else 
			return false;
	}

}

