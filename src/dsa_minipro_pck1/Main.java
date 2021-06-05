package dsa_minipro_pck1;

import java.util.InputMismatchException;
//IMPORTED REQUIRED CLASSES
import java.util.Scanner;

//CREATED MAIN CLASS
public class Main 
{
	public static void main(String[] args)
	{
		//CREATED OBJECT OF SCNNER CLASS
		Scanner sc=new Scanner(System.in);
		int ch=0;
		int flag;

		//CREATED OBJECT OF GRAPH CLASS
		Graph g=new Graph();

		System.out.print("\n\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("\n\t\t\t\t\t\t*\t\t\t\t\t\t\t\t  \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t  \n\t\t\t\t\t\t\t\t     F R I E N D E D \t\t\t\t  *\n");
		System.out.print("\t\t\t\t\t\t\t*\t\t\t\t\t\t\t  \n\t\t\t\t\t\t\t\t\t...coz you've got a friend in me !!\t\t  *");
		System.out.print("\n\t\t\t\t\t\t\t*\t\t\t\t\t\t\t\t  \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  \n\t\t\t\t\t\t\t * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n\n");
		
		try
		{
			flag=0;
			do 
			{
				System.out.print("\n\n\t\t\t\t\t\t          1. Create Account\t   2. Login\t     3. Exit\n\n\t\t\t\t\t\t\t\t\t\t");
				ch=sc.nextInt();

				switch(ch)
				{

				case 1:
					//INVOKING METHOD FOR CREATING ACCOUNT
					g.addAcc();
					break;

				case 2:
					//INVOKING LOGIN METHOD 
					g.login();
					break;

				case 3:
					//EXIT PROGRAM
					System.out.println("\n\n\n\t\t\t\t\t\t\t\t* * * *   T H A N K   Y O U U  ! ! ! !   * * * *");
					break;

				default:
					System.out.println("\n\n\t\t\t\t\t\t\t\t\t   Invalid input !! ");
				}

			}while(ch!=3);

		}
		catch(InputMismatchException i)			//EXCEPTION HANDLING FOR INPUT OTHER THAN INTEGER 
		{
			System.out.println("\n\t\t\t\t\t\t\t\t* Please enter number input only !! *");
			flag = 1;
		}
	}
}



/*
 Output:
 
						* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
						*								  
														  
								     F R I E N D E D 				  *
							*							  
									...coz you've got a friend in me !!		  *
							*								  
															  
							 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *



						          1. Create Account	   2. Login	     3. Exit

										1

							      Enter following details to create account : 


									     Your Name : neha
									    User Name : na
									  New password : na123
									Confirm Password : na123


									    Privacy Settings
								( 1 : Public Account, 0 : Private Account )
										  1


							       * Public Account created successfully !!!! *



						          1. Create Account	   2. Login	     3. Exit

										2

								       Enter User name : na
								        Enter Password : na123


								        * Logged in successfully !! *


					        --------------------------------------------------------------------------------


						    >>      na						neha

						    -----------------				----------------------------



								            1. View your profile

						         2. Add Friend	    3. Remove Friend	  4. Show Friends List

							       5. Show requests	    6. Delete your account

									     7. Log out


					        --------------------------------------------------------------------------------

										2

									>> People You May Know <<


									Name : Anjali Khanna   Account Id : 1
									   Privacy Status : Public 
									   Mutual friends - 0


									Name : Rahul Khanna   Account Id : 2
									   Privacy Status : Private 
									   Mutual friends - 0


									Name : Raj Malhotra   Account Id : 3
									   Privacy Status : Public 
									   Mutual friends - 0


									Name : Simaran Singh   Account Id : 4
									   Privacy Status : Private 
									   Mutual friends - 0


									Name : Kiran Kapoor   Account Id : 5
									   Privacy Status : Private 
									   Mutual friends - 0


									Name : Harry Potter   Account Id : 6
									   Privacy Status : Public 
									   Mutual friends - 0


									Name : Ron Weasley   Account Id : 7
									   Privacy Status : Private 
									   Mutual friends - 0


									Name : Hermione Granger   Account Id : 8
									   Privacy Status : Public 
									   Mutual friends - 0


									Name : Draco Malfoy   Account Id : 9
									   Privacy Status : Public 
									   Mutual friends - 0


									Enter Friend's Account Id : 1


									    * Friend Added !! *



								            1. View your profile

						         2. Add Friend	    3. Remove Friend	  4. Show Friends List

							       5. Show requests	    6. Delete your account

									     7. Log out


					        --------------------------------------------------------------------------------

										2

									>> People You May Know <<


									Name : Rahul Khanna   Account Id : 2
									   Privacy Status : Private 
									   Mutual friends - 0


									Name : Raj Malhotra   Account Id : 3
									   Privacy Status : Public 
									   Mutual friends - 0


									Name : Simaran Singh   Account Id : 4
									   Privacy Status : Private 
									   Mutual friends - 0


									Name : Kiran Kapoor   Account Id : 5
									   Privacy Status : Private 
									   Mutual friends - 0


									Name : Harry Potter   Account Id : 6
									   Privacy Status : Public 
									   Mutual friends - 0


									Name : Ron Weasley   Account Id : 7
									   Privacy Status : Private 
									   Mutual friends - 0


									Name : Hermione Granger   Account Id : 8
									   Privacy Status : Public 
									   Mutual friends - 0


									Name : Draco Malfoy   Account Id : 9
									   Privacy Status : Public 
									   Mutual friends - 0


									Enter Friend's Account Id : 2


									    * Request Sent !! *



								            1. View your profile

						         2. Add Friend	    3. Remove Friend	  4. Show Friends List

							       5. Show requests	    6. Delete your account

									     7. Log out


					        --------------------------------------------------------------------------------

										4

									       >> Your Friends list <<

									   Name : Anjali Khanna   Friend No. : 1
										Account Id : 1



								            1. View your profile

						         2. Add Friend	    3. Remove Friend	  4. Show Friends List

							       5. Show requests	    6. Delete your account

									     7. Log out


					        --------------------------------------------------------------------------------

										3

									       >> Your Friends list <<

									   Name : Anjali Khanna   Friend No. : 1
										Account Id : 1


									     Enter Friend No. : 1


									* Friend Removed from your friend list !! *



								            1. View your profile

						         2. Add Friend	    3. Remove Friend	  4. Show Friends List

							       5. Show requests	    6. Delete your account

									     7. Log out


					        --------------------------------------------------------------------------------

										4


									 * No Friends To Show !! *



								            1. View your profile

						         2. Add Friend	    3. Remove Friend	  4. Show Friends List

							       5. Show requests	    6. Delete your account

									     7. Log out


					        --------------------------------------------------------------------------------

										7

									Logged out successfully !!



						          1. Create Account	   2. Login	     3. Exit

										2

								       Enter User name : rj
								        Enter Password : rj123


								        * Logged in successfully !! *


					        --------------------------------------------------------------------------------


						    >>      rj						Raj Malhotra

						    -----------------				----------------------------



								            1. View your profile

						         2. Add Friend	    3. Remove Friend	  4. Show Friends List

							       5. Show requests	    6. Delete your account

									     7. Log out


					        --------------------------------------------------------------------------------

										5


									* No Requests Found !! *



								            1. View your profile

						         2. Add Friend	    3. Remove Friend	  4. Show Friends List

							       5. Show requests	    6. Delete your account

									     7. Log out


					        --------------------------------------------------------------------------------

										1

							----------------------- YOUR ACCOUNT -------------------------


								       Name : Raj Malhotra	    User name : rj

									     Friends : 0

							--------------------------------------------------------------


								      Do you want to set your Profile Details ?
									   Enter yes or no  -> yes


								      Enter Your Date of Birth : 
										Date : 1

								Month (e.g. 1 for Jan, 2 for Feb,..., 12 for Dec) : 2

									       Year : 2001

								 Enter Gender ( m=Male, f=Female, o=Other) : f

								          Enter Bio (In 1 line) : 
									hi

							----------------------- YOUR ACCOUNT -------------------------


								       Name : Raj Malhotra	    User name : rj

									     Friends : 0

								  BirthDate : 1/2/2001		Gender : f

										Bio : hi

							--------------------------------------------------------------



								            1. View your profile

						         2. Add Friend	    3. Remove Friend	  4. Show Friends List

							       5. Show requests	    6. Delete your account

									     7. Log out


					        --------------------------------------------------------------------------------

										7

									Logged out successfully !!



						          1. Create Account	   2. Login	     3. Exit

										2

								       Enter User name : rah
								        Enter Password : rah123


								        * Logged in successfully !! *


					        --------------------------------------------------------------------------------


						    >>      rah						Rahul Khanna

						    -----------------				----------------------------



								            1. View your profile

						         2. Add Friend	    3. Remove Friend	  4. Show Friends List

							       5. Show requests	    6. Delete your account

									     7. Log out


					        --------------------------------------------------------------------------------

										5

									      >> Friend Requests <<

									    Name : neha   Account Id : 9


								         Do you want to accept request ?
								           1 for Yes or 0 for No. 1


									   * Request Accepted !! *



								            1. View your profile

						         2. Add Friend	    3. Remove Friend	  4. Show Friends List

							       5. Show requests	    6. Delete your account

									     7. Log out


					        --------------------------------------------------------------------------------

										5


									* No Requests Found !! *



								            1. View your profile

						         2. Add Friend	    3. Remove Friend	  4. Show Friends List

							       5. Show requests	    6. Delete your account

									     7. Log out


					        --------------------------------------------------------------------------------

										4

									       >> Your Friends list <<

									   Name : neha   Friend No. : 1
										Account Id : 10



								            1. View your profile

						         2. Add Friend	    3. Remove Friend	  4. Show Friends List

							       5. Show requests	    6. Delete your account

									     7. Log out


					        --------------------------------------------------------------------------------

										7

									Logged out successfully !!



						          1. Create Account	   2. Login	     3. Exit

										2

								       Enter User name : na
								        Enter Password : na123


								        * Logged in successfully !! *


					        --------------------------------------------------------------------------------


						    >>      na						neha

						    -----------------				----------------------------



								            1. View your profile

						         2. Add Friend	    3. Remove Friend	  4. Show Friends List

							       5. Show requests	    6. Delete your account

									     7. Log out


					        --------------------------------------------------------------------------------

										4

									       >> Your Friends list <<

									   Name : Rahul Khanna   Friend No. : 1
										Account Id : 2



								            1. View your profile

						         2. Add Friend	    3. Remove Friend	  4. Show Friends List

							       5. Show requests	    6. Delete your account

									     7. Log out


					        --------------------------------------------------------------------------------

										6

									Your Account deleted permanently !!



						          1. Create Account	   2. Login	     3. Exit

										2

								       Enter User name : rah
								        Enter Password : rah123


								        * Logged in successfully !! *


					        --------------------------------------------------------------------------------


						    >>      rah						Rahul Khanna

						    -----------------				----------------------------



								            1. View your profile

						         2. Add Friend	    3. Remove Friend	  4. Show Friends List

							       5. Show requests	    6. Delete your account

									     7. Log out


					        --------------------------------------------------------------------------------

										4


									 * No Friends To Show !! *



								            1. View your profile

						         2. Add Friend	    3. Remove Friend	  4. Show Friends List

							       5. Show requests	    6. Delete your account

									     7. Log out


					        --------------------------------------------------------------------------------

										7

									Logged out successfully !!



						          1. Create Account	   2. Login	     3. Exit

										3



								* * * *   T H A N K   Y O U U  ! ! ! !   * * * *

 */