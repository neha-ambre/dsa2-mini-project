package dsa_minipro_pck1;

//IMPORTED REQUIRED CLASSES
import java.util.LinkedList;
import java.util.Scanner;

//CREATED GRAPH CLASS
public class Graph
{
	//CREATED OBJECT OF SCANNER CLASS
	Scanner in=new Scanner(System.in);
	LinkedList<Node> user=new LinkedList<Node>(); 		//CREATED LINKEDLIST OF NODE TYPE  
	LinkedList<Node> profileInfo=new LinkedList<Node>(); 		//CREATED LINKEDLIST OF NODE TYPE  
	int cnt=0;

	//DEFAULT CONSTRUCTOR OF GRAPH CLASS
	public Graph()
	{
		addAcc("Anjali Khanna","anj","anj123",1);
		addAcc("Rahul Khanna","rah","rah123",0);
		addAcc("Raj Malhotra","rj","rj123",1);
		addAcc("Simaran Singh","sim","sim123",0);
		addAcc("Kiran Kapoor","kir","kir123",0);
		addAcc("Harry Potter","har","har123",1);
		addAcc("Ron Weasley","ron","ron123",0);
		addAcc("Hermione Granger","hermione","har123",1);
		addAcc("Draco Malfoy","draco","draco123",1);
	}

	//METHOD WITH PARAMETERS FOR CREATING ACCOUNT FOR HARDOCODED NEW USERS
	public void addAcc(String n,String uname,String pass,int pub)
	{
		//CREATING ACCOUNT OF THAT USER
		Node ptr;
		ptr=new Node(n,uname,pass,pub,cnt);
		user.add(ptr);			//USING ADD METHOD TO ADD NODE TO LINKEDLIST
		cnt++;					//POINTER TO KEEP COUNT OF USERS 
	}

	//METHOD FOR FOR CREATING ACCOUNT BY ACCEPTING DETAILS FOR NEW USERS 
	public void addAcc()
	{
		//VARIABLES
		Node ptr;
		String uname,n,pass,pass1;
		int flag=0,status=0;

		System.out.println("\n\t\t\t\t\t\t\t      Enter following details to create account : ");
		System.out.print("\n\n\t\t\t\t\t\t\t\t\t     Your Name : ");		
		n=in.next();				//NAME INPUT FROM USER

		do
		{
			do 
			{	
				System.out.print("\t\t\t\t\t\t\t\t\t    User Name : ");
				uname=in.next();			//USERNAME INPUT FROM USER
				flag=checkUsername(uname);	
				if(flag == 1)
				{
					flag=6;
				}
				else if(flag==0)
				{
					if(n.equals(uname))			//CHECKING NAME AND USERNAME ARE EQUAL OR NOT
					{
						System.out.println("\n\n\t\t\t\t\t\t\t\t      * Username and Name should not be same !!\n\t\t\t\t\t\t\t\t           Please Enter another Username. *\n\n");
						flag=2;			//SET FLAG=2 IF NAME AND USERNAME ARE EQUAL
					}
					else	//IF NAME AND USERNAME ARE NOT EQUAL OTHERWISE GO AHEAD WITH PASSWORD 
					{
						do
						{
							System.out.print("\t\t\t\t\t\t\t\t\t  New password : ");
							pass=in.next();			//PASSWORD INPUT FROM USER
							//CHECKING THAT PASSWORD AND USERNAME ARE EQUAL OR NOT
							if(pass.equals(uname))
							{
								System.out.println("\n\n\t\t\t\t\t\t\t\t     * Username and Password should not be same !!\n\t\t\t\t\t\t\t\t           Please Enter another Password. *\n\n");
								flag=3;			//SET FLAG=3 IF USERNAME AND PASSWORD ARE EQUAL
							}
							else		//OTHERWISE GO AHEAD WITH CONFIRMATION OF PASSSWORD
							{
								do 
								{
									System.out.print("\t\t\t\t\t\t\t\t\tConfirm Password : ");
									pass1=in.next();			//CONFIRMING PASSWORD INPUT FROM USER

									//CHECKING THAT BOTH PASSWORDS INPUTS ARE EQUAL OR NOT
									if(pass1.equals(pass))
									{
										//IF THEY ARE EQUAL THEN CREATE ACCOUNT OF THAT USER
										ptr=new Node(n,uname,pass,status,cnt);
										user.add(ptr);		//USING ADD METHOD TO ADD NODE TO LINKEDLIST
										cnt++;				//POINTER TO KEEP COUNT OF USERS 
										break;				//AFTER CREATING ACCOUNT GO OUT OF THE LOOP
									}
									else		//OTHERWISE GO TO ELSE BLOCK
									{
										System.out.println("\n\n\t\t\t\t\t\t\t   * Password is not matching. Please enter correctly. !! *\n\n");
										flag=1;				//IF BOTH PASSWORDS INPUTS ARE NOT EQUAL THEN SET FLAG=1
									}
									//IF FLAG=1 THEN CONTINUE WITH THE LOOP FOR TO ENTER CORRECT PASSWORD
									//IF NOT THEN GO WITH NEXT INSTRUCTION
								}while(flag==1);		
								break;
							}
							//IF FLAG=3 THEN CONTINUE WITH THE LOOP FOR TO ENTER DIFFERENT PASSWORD OTHER THAN USERNAME
							//IF NOT THEN GO WITH NEXT INSTRUCTION
						}while(flag==3);
						break;

					}
				}
				//IF FLAG=1 LOOP WILL CONTINUE FOR TO ENTER NEW USERNAME FOR USER WHO ENTERED EXISITING USERNAME BEFORE
				//IF NOT EQUAL TO 1 THEN GO TO NEXT INSTRUCTION	
			}while(flag==6);

			//IF FLAG=2 THEN CONTINUE WITH THE LOOP FOR TO ENTER DIFFERENT USERNAME OTHER THAN NAME
			//IF NOT THEN GO WITH NEXT INSTRUCTION
		}while( flag == 2 );

		do
		{
			System.out.print("\n\n\t\t\t\t\t\t\t\t\t    Privacy Settings\n\t\t\t\t\t\t\t\t( 1 : Public Account, 0 : Private Account )\n\t\t\t\t\t\t\t\t\t\t  ");
			status=in.nextInt();		//PRIVACY STATUS INPUT FROM USER FOR ACCOUNT

			if( status == 1 )			//ENTERED STATUS INPUT IS FOR TO MAKE ACCOUNT PUBLIC 
			{
				System.out.println("\n\n\t\t\t\t\t\t\t       * Public Account created successfully !!!! *\n");
				flag=1;
			}
			else if( status == 0 )			//ENTERED STATUS INPUT IS FOR TO MAKE ACCOUNT PRIVATE
			{
				System.out.println("\n\n\t\t\t\t\t\t\t       * Private Account created successfully !!!! *\n");
				flag=1;
			}
			else				//IF USER ENTERED WRONG INPUT
			{
				System.out.println("\n\n\t\t\t\t\t\t\t\t\t * Enter Valid Option !!!! *");  
				flag=4;
			}
			//IF FLAG=4 THEN CONTINUE WITH THE LOOP FOR TO ENTER VALID PRIVACY STATUS INPUT
			//IF NOT THEN GO WITH NEXT INSTRUCTION
		}while(flag==4);
	}

	//METHOD FOR TO CHECK THAT USERNAME DOES EXIST ALREADY OR NOT
	public int checkUsername(String uname)
	{
		int flag=0;
		//FOR LOOP FOR TRAVERSING THROUGH LIST OF USERS
		for(int i=0;i<user.size();i++)
		{
			//CHECKING THAT ENTERED USERNAME FOR CREATING ACCOUNT IS ALREADY PRESENT OR NOT
			if(user.get(i).username.equals(uname))	
			{
				System.out.println("\n\t\t\t\t\t\t\t\t    * Username already exists !!\n\t\t\t\t\t\t\t\t  Please Enter another Username. *\n");
				flag=1;			//SET FLAG=1 IF USERNAME ALREADY EXISTS
				break;			//SKIP REMAINING TRAVERSE 
			}
			//OTHERWISE CHECK USERNAME OF NEXT USER
		} 
		return flag;
	}

	//METHOD FOR ACCEPTING USER'S SOME DETAILS  
	public void editProfile(int l) 
	{
		//VARIABLES
		int date=0,month=0,year=0;
		int flag=0;
		char gender = 0;
		String bio="";

		do
		{
			System.out.print("\n\n\t\t\t\t\t\t\t\t      Enter Your Date of Birth : ");
			System.out.print("\n\t\t\t\t\t\t\t\t\t\tDate : ");
			date=in.nextInt();			//DATE INPUT FROM USER

			if( date > 32 || date < 1 )				//CHECKING THAT DATE IS IN BETWEEN 1 TO 31 OR NOT  
			{
				//DATE IS NOT IN BETWEEN 1 TO 31
				System.out.print("\n\t\t\t\t\t\t\t\t\t\t* You entered Invalid Date !! *");  
				flag=1;			//IF DATE IS INVALID THEN SET FLAG=1
			}
			else if( date <= 31 || date >= 1 )	//IF DATE IS IN BETWEEN 1 TO 31 OR NOT 
			{
				do
				{
					System.out.print("\n\t\t\t\t\t\t\t\tMonth (e.g. 1 for Jan, 2 for Feb,..., 12 for Dec) : ");
					month=in.nextInt();		//MONTH INPUT FROM USER

					if( month > 12 || month < 1 )		//CHECKING THAT MONTH IS IN BETWEEN 1 TO 12 OR NOT
					{
						//MONTH IS NOT IN BETWEEN 1 TO 12
						System.out.print("\n\t\t\t\t\t\t\t\t* You entered Invalid Month !! *");  
						flag=2;				//IF MONTH IS INVALID THEN SET FLAG=2
					}
					else if( ( month==2 && date>29 ) || ( month==4 && date>31 ) || ( month==6 && date>31 ) || ( month==9 && date>31 ) || ( month==11 && date>31) )
					{
						System.out.print("\n\t\t\t\t\t\t\t\t\t* You entered Invalid Month !! *\n");
						flag=3;
					}
					else if ( month <=12 && month >= 1 )			//IF DATE IS IN BETWEEN 1 TO 12 OR NOT
					{
						do
						{
							System.out.print("\n\t\t\t\t\t\t\t\t\t       Year : ");
							year=in.nextInt();		//YEAR INPUT FROM USER

							if( year > 2021 )		//CHECKING IS YEAR GREATER THEN 2021 OR NOT
							{
								// YEAR GREATER THAN 2021 
								System.out.print("\n\t\t\t\t\t\t\t\t\t* You entered Invalid Year !! *\n");  
								flag=4;		//SET FLAG=4 IF YEAR IS INVALID
							}
							else		//OTHERWISE CONTINUE WITH ELSE BLOCK
							{
								do
								{
									System.out.print("\n\t\t\t\t\t\t\t\t Enter Gender ( m=Male, f=Female, o=Other) : ");
									gender=in.next().charAt(0);    //GENDER INPUT FROM USER

									if( ( gender == 'm' ) || ( gender == 'M' ) || ( gender == 'f' ) || ( gender == 'F' ) )
									{
										//IF VALID GENDER INPUT
										System.out.print("\n\t\t\t\t\t\t\t\t          Enter Bio (In 1 line) : \n\t\t\t\t\t\t\t\t\t");
										bio=in.next();			//BIO INPUT FROM USER
									}
									else		//IF INVALID GENDER INPUT
									{
										System.out.print("\t\t\t\t\t\t\t\t\t * You entered Invalid option !! *\n"); 
										flag=5;			//SET FLAG=5 IF INVALID GENDER INPUT
									}
									//IF FLAG=5 THEN CONTINUE WITH THE LOOP FOR TO ENTER VALID GENDER INPUT
									//IF NOT THEN GO WITH NEXT INSTRUCTION
								}while( flag == 5 );
								break;
							}
							//IF FLAG=4 THEN CONTINUE WITH THE LOOP FOR TO ENTER VALID YEAR INPUT
							//IF NOT THEN GO WITH NEXT INSTRUCTION
						}while( flag == 4 );
						break;
					}
					//IF FLAG=2 OR 3 THEN CONTINUE WITH THE LOOP FOR TO ENTER VALID MONTH INPUT
					//IF NOT THEN GO WITH NEXT INSTRUCTION
				}while( ( flag == 2 ) || ( flag == 3 ) );
				break;
			}
			//IF FLAG=1 THEN CONTINUE WITH THE LOOP FOR TO ENTER VALID PRIVACY STATUS INPUT
			//IF NOT THEN GO WITH NEXT INSTRUCTION
		}while(flag==1);

		profileInfo(date, month, year, gender, bio, l);
	}

	//METHOD FOR SETTING PROFILE DETAILS OF PARTICULAR USER
	public void profileInfo(int date, int month, int year, char gender, String bio, int l)
	{
		Node ptr;
		for(int i=0;i<=l;i++)
		{
			profileInfo.add(i, null);
			//System.out.println(profileInfo.size());
			cnt++;
		}
		ptr=new Node(date, month, year, gender, bio, cnt);		
		profileInfo.add(l, ptr);			//USING ADD METHOD TO ADD NODE TO LINKEDLIST
		//System.out.println(profileInfo.size());
		cnt++;
	}

	//METHOD FOR ADDING FRIEND TO FRIEND LIST
	public void addFriend(int l)
	{
		int n;
		Node ptr;
		showPeople(l);		//INVOKING SHOWPEOPLE METHOD TO DISPLAY SUGGESTIONS LIST 
		System.out.print("\n\n\t\t\t\t\t\t\t\t\tEnter Friend's Account Id : ");
		n=in.nextInt();			//FRIEND NO INPUT FROM USER WHOM YOU WANT TO SENT REQUEST

		if( l != n-1 )
		{
			n = n-1;
		}

		ptr=user.get(n);		//USED PTR POINTER TO POINT TO USER AT INDEX N
		if( ptr.status == 0 )		//CHECKING IS STATUS OF THE USER WHERE PTR IS POINTING IS EQUAL TO 0 AND 0 MEANS THE PRIVACY STATUS IS PRIVATE 
		{
			ptr.requests++;			//INCREMENTING REQUESTS NO.
			ptr.friend_requests[ptr.requests]=user.get(l);		//CURRENT USER'S REQUEST WILL GET ADD INTO FRIEND REQUESTS OF USER THE PTR POINTING 
			System.out.println("\n\n\t\t\t\t\t\t\t\t\t    * Request Sent !! *");		//DISPLAYING MESSAGE FOR THE CURRENT USER AFTER SENT A REQUEST 
		}
		else if(ptr.status==1)			//CHECKING IS STATUS OF THE USER WHERE PTR IS POINTING IS EQUAL TO 1 AND 0 MEANS THE PRIVATE STATUS IS PUBLIC 
		{
			//BECAUSE OF PUBLIC STATUS PRIVACY DIRECT FRIEND WILL GET ADDED TO FRIEND LIST
			//NO NEED TO SEND A REQUEST TO THE FRIEND WHOM YOU WANT TO ADD
			user.get(l).adj.add(ptr);		//THE FRIEND WILL GET ADD INTO CURRENT USER'S FRIEND LIST
			ptr.adj.add(user.get(l));		//ALSO ADD CURRENT USER INTO THE FRIEND LIST OF THE FRIEND WHOM YOU WANT TO ADD
			System.out.println("\n\n\t\t\t\t\t\t\t\t\t    * Friend Added !! *");		//DISPLAYING MESSAGE FOR THE CURRENT USER AFTER FRIEND GET ADDED 
		}
	}

	//METHOD FOR ACCEPTING REQUEST WHICH SENT BY ANOTHER USERS
	public void accRequest(int l)
	{
		//VARIABLES
		int op;
		int val;
		Node ptr;
		ptr=user.get(l);	//USED PTR POINTER TO POINT TO USER AT INDEX L I.E.CURRENT USER
		val=ptr.requests;
		//System.out.println(">>> "+ptr.friend_requests.length);
		//System.out.println(">>> "+ptr.requests);
		if(ptr.requests == -1)			//REQUESTS ARRAY IS EMPTY
		{
			System.out.println("\n\n\t\t\t\t\t\t\t\t\t* No Requests Found !! *");
		}
		else		//REQUESTS ARRAY IS NOT EMPTY
		{
			System.out.println("\n\t\t\t\t\t\t\t\t\t      >> Friend Requests <<");
			for(int i=0;i<=ptr.requests;i++)
			{
				//DISPLAYING ALL REQUESTS
				System.out.println("\n\t\t\t\t\t\t\t\t\t    Name : "+ptr.friend_requests[i].name+"   Account Id : "+ptr.friend_requests[i].v_no+"\n");
				System.out.print("\n\t\t\t\t\t\t\t\t         Do you want to accept request ?\n\t\t\t\t\t\t\t\t           1 for Yes or 0 for No. ");
				op=in.nextInt();		//INPUT FROM USER FOR TO ACCEPT REQUEST
				if(op==1)
				{
					for(int j=0;j<user.size();j++)
					{
						if(ptr.friend_requests[i].name.equals(user.get(j).name))
						{
							user.get(l).adj.add(user.get(j));				//WILL ADD TO THE FRIEND LIST OF USER AND THAT PERSON
							user.get(j).adj.add(user.get(l));
							ptr.friend_requests[i]=null;					//AS REQUEST IS ACCEPTED THEN IT WILL GET REMOVED FROM REQUEST ARRAY
							val--;				//DECREMENT REQUESTS COUNT
							System.out.println("\n\n\t\t\t\t\t\t\t\t\t   * Request Accepted !! *");
							break;
						}
					}
				}
			}
			ptr.requests=val;		//SET VAL TO REQUESTS COUNT OF USER
		}
	}

	//METHOD FOR LOGIN INTO ACCOUNT
	public void login()
	{
		//VARIABLES
		String un;
		String pass;
		int l,op,pm;
		do
		{
			System.out.print("\n\t\t\t\t\t\t\t\t       Enter User name : ");
			un=in.next();		//INPUT FOR USERNAME FROM USER
			l=searchAcc(un);	//SEARCHING IS THERE ANY OTHER ACCOUNT WITH SAME UESRNAME 
			if(l==-1) 		//IF L=-1 THEN ACCOUNT WITH USERNAME DOESN'T EXISTS
			{
				System.out.println("\n\t\t\t\t\t\t\t\t   * No account with such username *\n");
				return;			
			}
			System.out.print("\t\t\t\t\t\t\t\t        Enter Password : ");
			pass=in.next();    			//INPUT FOR PASSWORD FROM USER
			pm=passMatch(l,pass);			//INVOKING PASSMATCH METHOD FOR TO CHECK THAT ENTERED PASSWORD IS CORRECT OR NOT
			if(pm==0)			// IF 0 THEN DISPLAYING MESSAGE THAT WRONG PASSWORD IS ENTERED
			{
				System.out.println("\n\n\t\t\t\t\t\t\t\t\t* You entered wrong Password.\n\t\t\t\t\t\t\t\t    Please Enter again correct password. *\n");
			}
		}while(pm==0); 		//IF PM=0 THEN CONTINUE WITH LOOP

		System.out.println("\n\n\t\t\t\t\t\t\t\t        * Logged in successfully !! *");
		System.out.println("\n\n\t\t\t\t\t        --------------------------------------------------------------------------------\n\n\n\t\t\t\t\t\t    >>      "+ un +"\t\t\t\t\t\t"+user.get(l).name);
		System.out.println("\n\t\t\t\t\t\t    -----------------\t\t\t\t----------------------------");
		do
		{
			//DISPLAYING MENU
			System.out.print("\n\n\n\t\t\t\t\t\t\t\t            1. View your profile\n\n\t\t\t\t\t\t         2. Add Friend\t    3. Remove Friend"+
					"\t  4. Show Friends List\n\n\t\t\t\t\t\t\t       5. Show requests\t    6. Delete your account\n\n\t\t\t\t\t\t\t\t\t   "+
					"  7. Log out\n\n\n\t\t\t\t\t        --------------------------------------------------------------------------------\n\n\t\t\t\t\t\t\t\t\t\t");
			op=in.nextInt();				//CHOICE INPUT FROM USER

			switch(op)
			{
			case 1:
				//INVOKING METHOD FOR VIEWING USER ACCOUNT
				viewAcc(l);
				break;

				/*case 2:
				//INVOKING METHOD FOR EDITTING USER PROFILE
				editProfile(l);
				break;
				 */
			case 2:
				//INVOKING METHOD FOR ADDING FRIEND TO FRIEND LIST
				addFriend(l);
				break;

			case 3:
				//INVOKING METHOD FOR REMOVING FRIEND FROM FRIEND LIST
				removeFriend(user.get(l));
				break;

			case 4:
				//INVOKING METHOD FOR VIEWING FRIEND LIST
				showFriends(user.get(l));
				break;

			case 5:
				//
				accRequest(l);
				break;
			case 6:
				//INVOKING METHOD FOR DELETING ACCOUNT PERMANENTLY
				//user.remove(l);
				deleteAcc(l);
				op=8;
				cnt--;
				System.out.println("\n\t\t\t\t\t\t\t\t\tYour Account deleted permanently !!");
				break;

			case 7:
				//LOGGING OUT FROM ACCOUNT
				System.out.println("\n\t\t\t\t\t\t\t\t\tLogged out successfully !!");
				break;

			default:
				System.out.println("\n\t\t\t\t\t\t\t\t\t\tInvalid input ..");

			}
		}while(op<7);		//FOR OP < 7, WILL CONTINUE WITH LOOP
		System.out.println();
	}

	//METHOD FOR CHECKING THE ENTERED PASSWORD 
	public int passMatch(int l,String pass)
	{
		if(user.get(l).password.equals(pass))			//CHECKING ENTERED PASSWORD BY USER OF INDEX L IS CORRECT OR NOT
			return 1;			//IF YES THEN RETURN 1
		else 
			return 0;			//IF NOT THEN RETURN 0
	}

	//METHOD FOR TO VIEW ACCOUNT OF CURRENT USER 
	public void viewAcc(int l)
	{
		int flag;
		String choice;
		//DISPLAYING DETAILS
		flag=0;
		//System.out.println(profileInfo.contains(user.get(l)));
		if(!profileInfo.contains(user.get(l)))
		{
			System.out.println("\n\t\t\t\t\t\t\t----------------------- YOUR ACCOUNT -------------------------");
			System.out.println("\n\n\t\t\t\t\t\t\t\t       Name : "+user.get(l).name+"\t    User name : "+user.get(l).username
					+ "\n\n\t\t\t\t\t\t\t\t\t     "+"Friends : "+user.get(l).adj.size());
			System.out.println("\n\t\t\t\t\t\t\t--------------------------------------------------------------");
			System.out.print("\n\n\t\t\t\t\t\t\t\t      Do you want to set your Profile Details ?\n\t\t\t\t\t\t\t\t\t   Enter yes or no  -> ");
			choice=in.next();
			if(choice.equals("yes"))
			{
				editProfile(l);
				flag=1;
			}
		}
		if(flag==1 || profileInfo.contains(user.get(l)))
		{
			System.out.println("\n\t\t\t\t\t\t\t----------------------- YOUR ACCOUNT -------------------------");
			System.out.println("\n\n\t\t\t\t\t\t\t\t       Name : "+user.get(l).name+"\t    User name : "+user.get(l).username
					+ "\n\n\t\t\t\t\t\t\t\t\t     "+"Friends : "+user.get(l).adj.size()+
					"\n\n\t\t\t\t\t\t\t\t  BirthDate : "+profileInfo.get(l).date+"/"+profileInfo.get(l).month+"/"+profileInfo.get(l).year
					+"\t\tGender : "+profileInfo.get(l).gender
					+"\n\n\t\t\t\t\t\t\t\t\t\tBio : "+profileInfo.get(l).bio);
			System.out.println("\n\t\t\t\t\t\t\t--------------------------------------------------------------");
		}
	}

	//METHOD FOR SEARCH ACCOUNT WITH PARTICULAR USERNAME
	public int searchAcc(String un)
	{
		//LOOP FOR TO TRAVERSE THROUGH LIST
		for(int i=0;i<cnt;i++)
		{
			if(user.get(i).username.equals(un))				//CHECKING ENTERED USERNAME IS MATCHING WITH ANY USER'S USERNAME
				return i;		//IF YES THEN RETURN THAT INDEX NUMBER OF THAT USER
		}
		return -1; 			//IF NOT THEN RETURN -1
	}

	//METHOD FOR TO DISPLAY SUGGESTIONS FOR USER TO ADD FRIEND
	public void showPeople(int l)
	{
		//VARIABLE
		Node ptr;
		int no_of_m_fri,flag=0;
		System.out.println("\n\t\t\t\t\t\t\t\t\t>> People You May Know <<");
		for(int i=0;i<cnt;i++)
		{
			flag=0;
			ptr=user.get(i);		
			if(i==l || user.get(l).adj.contains(user.get(i)) )		
			{
				continue;
			}

			for(int j=0;j<=ptr.requests;j++)
			{
				if(ptr.friend_requests[j].username==user.get(l).username)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
				continue;
			//DISPLAYING SUGGEESTIONS LIST
			no_of_m_fri=mutualFriends(user.get(l),user.get(i));			//WILL GET MUTUAL FRIENDS COUNT BY INVOKING MUTUALFRIENDS METHOD 
			System.out.print("\n\n\t\t\t\t\t\t\t\t\tName : "+user.get(i).name+"   Account Id : "+(i+1));
			System.out.print("\n\t\t\t\t\t\t\t\t\t   Privacy Status : ");
			if(user.get(i).status == 1)
				System.out.print("Public ");
			else if(user.get(i).status == 0)
				System.out.print("Private ");
			System.out.print("\n\t\t\t\t\t\t\t\t\t   Mutual friends - "+no_of_m_fri+"\n");
		}
	}

	//METHOD FOR DISPLAYING FRIENDS FROM USER'S FRIEND LIST
	public int showFriends(Node ptr)
	{
		int i=0;
		if(ptr.adj.size()==0)		//IF FRIEND LIST SIZE IS 0 I.E. IT'S EMPTY 
		{
			System.out.println("\n\n\t\t\t\t\t\t\t\t\t * No Friends To Show !! *");
			return 1; 			//THEN WILL RETURN 1
		}
		else
		{
			System.out.println("\n\t\t\t\t\t\t\t\t\t       >> Your Friends list <<");
			while(i<ptr.adj.size())					//IF SIZE IS NOT 0 THEN WILL TRAVERSE THE LIST AND DISPLAY ALL FRIENDS FROM FRIEND LIST 
			{
				//DISPLAYING FRIENDS DETAILS
				System.out.println("\n\t\t\t\t\t\t\t\t\t   Name : "+ptr.adj.get(i).name+"   Friend No. : "+(i+1)+"\n\t\t\t\t\t\t\t\t\t\tAccount Id : "+(ptr.adj.get(i).v_no + 1));
				i++;
			}
			return 0;
		}
	}

	//METHOD FOR TO KEEP COUNT OF MUTUAL FRIENDS
	public int mutualFriends(Node u,Node p)
	{
		int i=0,c=0;
		Node ptr;
		while(i<u.adj.size())			//CHECKING IS I POINTER IS LESS THAN SIZE OF LIST
		{
			ptr=u.adj.get(i);		//PTR POINTER TO POINT CURRENT USER INDEX
			if(p.adj.contains(ptr))		//CHECKING THAT ARE THE CURRENT USER AND THAT PERSON HAVING SAME FRIENDS
			{
				c++;			//IF YES THEN INCREMENT C POINTER
			}
			i++;		
		}
		return c;			//RETURN C WHICH IS TOTAL MUTUAL FRIENDS COUNT
	}

	//METHOD FOR TO DELETE ACCOUNT OF CURRENT USER
	public void deleteAcc(int l)
	{		
		for(int i=0;i<user.size();i++)
		{
			for(int j=0;j<user.get(i).adj.size();j++)
			{
				if(user.get(i).adj.get(j)==user.get(l))			//BY SEARCHING THE CURRENT USER IN USER LIST
				{
					user.get(i).adj.remove(j);				//WILL REMOVE THE CURRENT USER FROM USER LIST 
				}
			}
		}
		user.remove(l);
	}

	//METHOD FOR TO REMOVE FRIEND FROM FRIEND LIST
	public void removeFriend(Node ptr)
	{
		int n;
		int no=showFriends(ptr);			//INVOKING SHOWFRIENDS METHOD 
		if(no==1)					//IF NO=1 THEN NO FRIENDS IN FRIENDS LIST
		{
			//SO WE CAN'T REMOVE ANY FRIEND
			System.out.println("\n\n\t\t\t\t\t\t\t\t\t* Sorry, You can't remove any friend.\n\t\t\t\t\t\t\t\t\t    First make friends !! *");
		}
		else if(no==0)				//IF NO=0 THEN FRIEND LIST IS NOT EMPTY SO WE CAN REMOVE FRIEND
		{
			System.out.print("\n\n\t\t\t\t\t\t\t\t\t     Enter Friend No. : ");
			n=in.nextInt();					//FRIEND NO INPUT FROM USER
			Node friend;
			friend=ptr.adj.get(n-1);			
			ptr.adj.remove(n-1);				//BY INVOKING REMOVE METHOD OF LIST, WILL DELETE THE FRIEND FROM CURRENT USER'S FRIEND LIST
			for(int i=0;i<friend.adj.size();i++)
			{
				if(friend.adj.get(i)==ptr)
					friend.adj.remove(i);			//WILL DELETE THE CURRENT USER FROM FRIEND LIST OF FRIEND WHOM CURRENT USER WANT TO REMOVE  
			}
			System.out.println("\n\n\t\t\t\t\t\t\t\t\t* Friend Removed from your friend list !! *");
		}
	}

}