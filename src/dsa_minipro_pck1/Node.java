package dsa_minipro_pck1;

//IMPORTING REQUIRED CLASSES
import java.util.ArrayList;

//CREATED NODE CLASS
public class Node 
{
	//VARIABLES DECLARATION
	int v_no,status;
	String name,username,password;
	//String b_date;
	ArrayList<Node> adj=new ArrayList<Node>();			//CREATED ARRAYLIST OF NODE TYPE
	int requests=-1;
	Node friend_requests[]=new Node[20];			//CREATED OBJECTARRAY OF NODE TYPE
	//Node edge;
	int date,month,year;
	char gender;
	String bio;
	
	//PARAMETERIZED CONSTRUCTOR OF NODE CLASS
	public Node(String n,String uname,String pass,int s,int v)
	{
		//INITIALIZED HERE
		name=n;
		username=uname;
		password=pass;
		status=s;
		v_no=v;
	}
	
	//PARAMETERIZED CONSTRUCTOR OF NODE CLASS
	public Node(int d, int m, int y, char g, String b, int v) 
	{
		date = d;
		month = m;
		year = y;
		gender = g;
		bio = b;
		v_no=v;
	}	
}