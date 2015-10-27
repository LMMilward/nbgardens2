	import java.util.Scanner;																							//import needs to be outside of the public/private class
	import java.util.Random; 							//this is used to generate random numbers
	public class Main 
{
	public static void main(String args[])																				//void means no value returned
	{
		//***********************************************************************************************************************************************//
//
//																														//how to use methods with parameters
//																														//line below, in between brackets is the argument - 
						Scanner input = new Scanner(System.in);															//this needs to be called ONLY once in a program 
						Hello codObject = new Hello();
						System.out.println("Enter your name here: ");
						
																														//line below takes the user input and stores it as a variable in name
						String name = input.nextLine();																	//this is what uses the user text
						
						
																														//below shows how to ask how someone is
						codObject.simpleMess(name);
						Hello howObject = new Hello();
						
						String how = input.nextLine(); 																	//this is what uses the user text
						howObject.simpleHow(how);  																		//this uses the temp input 'how'

		//***********************************************************************************************************************************************//
//																														/*Dog calls the class type where it will be stored ------- ci is given the temp name by user ------ new dog is used to set new input to class Dog
//																														below could be written as -----------Dog ci.Object = new Dog();*/
//						MethodPara ci;
//						ci = new MethodPara();
//						System.out.println("Enter name of your dog here: ");
//																														//below shows how to store tempary data that has been inputed
//						String temp = input.nextLine();
//																														//below shows how the MMaI is set to the inputed data
//						ci.setName(temp);
//						ci.saying();
		
		//***********************************************************************************************************************************************//
																														// This part shows a constructor ------ how to initialise a variable as soon as you create an object	
						Constructor cathObject = new Constructor("Magners");
						Constructor cathObject2= new Constructor("Guiness");
						cathObject.saying(); 																			//'saying' is a method
						cathObject2.saying();								
	
		//***********************************************************************************************************************************************//		
//																														//this is nested if statement
//						int age;
//						
//						{
//							System.out.println("Please type in your age ");
//							age = input.nextInt();																		//this means the number input that the user gives
//		
//						}
//						
//						if (age < 50) 
//							{
//								System.out.println("You are young");
//							}
//						else
//							{
//								System.out.println("you smell");
//								if (age > 75)
//									{
//										System.out.println("You are REALLY old");
//									}
//								else
//									{
//									System.out.println("You are not really that old!");
//									}
//							}
//				
		//***********************************************************************************************************************************************//
//			{																												// else if statement 
//							int manage;
//								
//							{
//								System.out.println("Please Enter your age ");
//								manage = input.nextInt();
//							}
//							
//								if (manage > 70)
//								
//												System.out.println("You are a OAP");
//								
//								else if (manage >= 50) 
//								
//									
//										System.out.println("You are in your 30s");
//									else if (manage >= 30)
//										System.out.println("You are passed 30!");
//									else if (manage < 30 )
//										System.out.println("You are young");
//									else
//										System.out.println("Say What?");
//			
//	
//			}
		//***********************************************************************************************************************************************//
//																															//Conditional Operator 
//			{
//							int gage = 21;
//							
//							System.out.println(gage > 50 ? "you are old" : "You are under 50");								//the ':' means True or False. the '(age > 50 ?)' - this is if age is more than 50 then true 
//			}
//			
		//***********************************************************************************************************************************************//
//			{
//							int total = 0;
//							int grade;
//							int average;
//							int counter = 0;
//							
//							
//							
//							while (counter < 10)
//							{
//								System.out.println("Please type number " + counter);
//								grade = input.nextInt();																	//this means the number input that the user gives
//								total = total + grade;
//								counter++;
//							}
//			
////							average = total/10;
////							System.out.println("Your average is " + average);
//			}					
		//***********************************************************************************************************************************************//
//																															//For Loops
//			{																												//1st is where loop starts, 2nd is where to end, 3rd is how much increase 
//								System.out.println("Numbers up to 10 in steps of 3 ");
//								for(int counter = 1; counter <= 10; counter += 3)												// ++ adds counter by 1, += adds by following number
//								System.out.println(counter);
//			}
		//***********************************************************************************************************************************************//
//							//A = P(1 + R)^n																				//Compound Interest Program
//			{
//							double amount;
//							double principle = 10000;
//							double rate = 0.1;
//							
//							System.out.println("working out how many view you'd get at an avarge increase of 1% per day starting at 10000");
//							
//							for (int day = 1; day <10; day++)
//								{
//									amount = principle * Math.pow(1 + rate, day);											//to the power of you need Math.pow 
//									System.out.println(day + " " + amount);
//								}
//			}		
			//***********************************************************************************************************************************************//
//																															//Do While Loop - used to run a program before condition is reached
//							int counter = 0;
//			
//							do
//							{
//								System.out.println(counter);
//								counter++;		
//							}
//							while(counter <=10);
//							
//			//***********************************************************************************************************************************************//
//																															//Math Class methods
//							{
//								System.out.println("Absolute value of -26.7 is ");
//								System.out.println(Math.abs(-26.7));														//Math.abs means absolute value that it is from 0, in this case it would be 26 ------- Math.ceil will round it up (ceiling) and Math.floor will round down --------- Math.Max will give max of two different numbers Math.max(8.6, 5.2) will give 8.6 ------- Math.min will do the opposite to max and give 5.2 as the minimum number --------Math.pow(5, 3) means to the power and will give 5*5*5 = 125 will be returned ---------- Math.sqrt means square root so Math.sqrt(9) will give 3    						
//							}
//	
			//***********************************************************************************************************************************************//
//							//How to get random numbers
//							System.out.println("The following list is of random numbers ");
//							Random dice = new Random();
//							int number;
//							int user;
//							
//							System.out.println("Please add in a number");
//							user = input.nextInt();
//							
//							
//							for(int count = 1; count <= 10; count ++)
//							{
//								number = 1 + dice.nextInt(user);					//6 is replecating each face on a dice ------------ the 6 numbers would be from 0 - 5 ----------- this is why there is a plus 1, so that numbers can only be 1 - 6 
//								System.out.println("From " + user + " a random number is " + number + " ");
//							}
	
//			//***********************************************************************************************************************************************//
//							//Trial
//						{		
//							int num;
//							int step = 2015;
//							int year = 0;
//							
//							System.out.println("How many years before 2015 did you start driving?");
//							
//							num = input.nextInt();
//							
//							
//							
//							for(int count = 0; count <= num; count++)
//								{
//									
//									System.out.println("You have been driving " + year + " years in " + step);
//									year++;
//									step --;
//								}
//						}
//			//***********************************************************************************************************************************************//					
//																																//			ARRAYS!!!!!!!!!!!!!!!! ------ NEED TO KNOW
//																																//arrays can only store same data types, int, double, string etc
//						{
//							int bucky[] = new int[10] ;																			//square brackets tell java that this is an array --------- new int [number] the number states size of array
//							
//							bucky[0] = 87; 																						//this is the first location given the value 87
//							bucky[1] = 543;
//							bucky[2] = 65;
//							
//							System.out.println(bucky[1]); 																		//this prints the value shown in the location bucky[1] which should be 543							
//
//						}
//					
//			//***********************************************************************************************************************************************//
//																																//ARRAY initialiser -------- this inititalises all your arrays so you do not type in each value
//						
//						{
//							int bucky[] = {2,4,5,6,7,8};																		//quicker way to list an array
//							
//							System.out.println(bucky[2]);																		//calls up the array location 2 ---------- location of an array is also called subscript or  index
//							
//						}
//						
//			//***********************************************************************************************************************************************//
//																																//Creating a basic Array Table
//						{
//							System.out.println("Index\t");																		// this prints out 'index' and '\t' does five spaces
//							
//							
//										//	0,1,2,3, 4, 5,  6, 7,  8, 9,														these area the location numbers 
//							int bucky[] = { 5,9,5,7,90,123,64,323,77,23 };
//							int count;
//							int totalNumber = 0;
//							
//							for (count = 0; count <= bucky.length; count++)														//bucky.length is needed to state the array size
//							{
//								totalNumber = totalNumber + bucky.length;
//								System.out.println(count + "\t" + bucky[count]);
//							}
//						}
//
			//***********************************************************************************************************************************************//
//																																//Summing Arrays
//						{
//							int plucky[] = { 21, 65, 42, 76, 44, 23, 35, 77, 11 ,21};
//							int sum = 0;
//							int count;
//							
//							
//							for (count = 0; count <= plucky.length; count++)
//							{
//								sum = sum + plucky[count];																		//this adds the value in the array to sum
//								System.out.print("the sum so far is \t" + sum + " of " + plucky[count] + "\n");
//							}
//														
//						}
//						
			//***********************************************************************************************************************************************//
//										//Array Elements as counters
//						{
//							
//							Random rand = new Random();					//this gives us a random number
//							int freq[] = new int[7];					//representing a dice ------ array size 7 because we need the numbers 1 - 6 and it starts from 0
//							
//							
//							for(int roll = 1; roll <= 1000; roll++)			//setting the number of dice rolls to 1000
//							{
//								++freq[1+rand.nextInt(6)];					//**********************************THIS IS IMPORTANT************************* this gives us numbers 1 to 6 instead of 0 to 6 
//								
//							}
//								
//						}
//						
			//***********************************************************************************************************************************************//					
//																											//Enhanced for Loop   ---- NEED THIS TO PRINT OUT THE LIST OF GNOMES
//						{
//							int bucky[] = {3, 4, 5, 6, 7};
//							int total = 0;				 
//							
//							for(int x: bucky) // 'x' is used to store store values in the array----- must name array incase we have more than one
//							{
//								total += x;
//								System.out.println("this is total" + total + "this is x" + x);
//							
//							}
//						}
//						
			//***********************************************************************************************************************************************//						
//
//							int bucky[] = { 3,4,5,6,7};														// this makes the array
//							change(bucky); 																	//this changes the array						 //because we state the size we do not need to do change(bucky [5])
//						
//							for(int y:bucky)
//								System.out.println(y);
//						
			//***********************************************************************************************************************************************//				
//								//Multidimensional Array and making tables using multi arrays
//						{
//							int firstarray[][] = {{8,9,10,11},{12,13,14,15}}; // the first square bracket is for row, the second is for column
//												  //00,01,02,03,   10, 20,21,22    - this shows how to call each of the below 
//							int secondarray[][] = {{30,31,32,33}, {43},{4,5,6}}; // to call first bracket 0 - 3 to call the size and then the element , the second is 
//							
//								System.out.println("This is the first array");														//firstarray [0][1]       // this would call number 8 in the first square bracket and 13 in the second bracket
//								display(firstarray);
//								
//								System.out.println("This is the second array");
//								display(secondarray);
//							
//												
//						}
//				
			//***********************************************************************************************************************************************//
//								//Variable Length Arguments ------ good for unstated array size
//						{
//							System.out.println(average(43,56,76,8, 65, 76, 2, 31));
//						}

//			//***********************************************************************************************************************************************//
//							//Time Class					DOES NOT WORK
//							
//							TimeClass timeObject = new TimeClass();	
//							
//							//System.out.println(timeObject.toMilitary());
//							System.out.println(timeObject.toNormal());					
//							
//							timeObject.setTime(13, 27, 6);
//							//System.out.println(timeObject.toMilitary());			//toMilitary is what is called from TimeClass
//							System.out.println(timeObject.toNormal());				//toNormal is what is called from TimeClass
//							
			//***********************************************************************************************************************************************//
//						//Multiple Constructors  check Class - TimeClass 
//						{
//							TimeClass timeObject = new TimeClass();				//sets no parameters
//							TimeClass timeObject2 = new TimeClass(5);			//sets 5 to hour
//							TimeClass timeObject3 = new TimeClass(5,13);		//sets 5 to hour and 13 to minute
//							TimeClass timeObject4 = new TimeClass(5,13,40);		//sets 5 to hour 13 to minute and 40 to second
//							
//							//e.g. 
//							//if three parameters, for timeObject 4 that has 5,13,40. It will go to TimeClass and search through the constructors to see which has three parameters. Once it's found the format is will setTime and go to setTime (SETTERS) to check and make sure each of h,m and s are in the correct range!  
//							
//							System.out.println("%s\n" + timeObject.toMilitary());		//this calls up 
//							System.out.println("%s\n" + timeObject2.toMilitary());
//							System.out.println("%s\n" + timeObject3.toMilitary());
//							System.out.println("%s\n" + timeObject4.toMilitary());			
//						}
//								
			//***********************************************************************************************************************************************//
//																									//this shows how far an object would fall in Earth gravity
//						double gravity = -9.81; //Earth's gravity in m/s^2
//						double initialVelocity = 0.0;
//						double fallingTime = 10.0;
//						double initialPosition = 0.0;
//						double finalPosition = 0.0;
//						
//						finalPosition = 0.5 * (gravity * (Math.pow((fallingTime), 2))) + initialPosition + finalPosition;
//						
//							//	Variable 			Meaning 				Value
//							//		a 			Acceleration (m/s^2)  		-9.81
//							//		t 				Time (s) 				10
//							//		vi 			Initial velocity (m/s) 		0
//							//		xi 			Initial position 			0 
//								
//						System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + "m.");
//					
//																	//The object's position after 10.0seconds is 0.0m	
//							
			//***********************************************************************************************************************************************//
																// employees paid time and half over 40 hours, $8 an hour----- if more thatn 60 hours then print a message
						
//							double hours;
//							double hours2 = 0.00;
//							double basePay = 8.00;
//							double extraPay = 12.00;
//							double pay;							
//						
							
//							String[] array1 = {"Employee 1", "$7.50", "35"};		//how to make a string array 
//							String[] array2 = {"Employee 2", "$8.20", "47"};		// don't forget ""
//							String[] array3 = {"Employee 3", "$10.00", "73"};
							
							
							
//							System.out.println("Please enter Hours Worked: ");
//							hours = input.nextDouble(); 
//									
//									
//							if (hours <= 40)  
//								{
//									pay = hours * basePay;
//									System.out.println("Employee has worked up to 40 hours and is owed " + pay);
//								}
//							
//							else if (hours >= 60) 
//								{
//									hours2 = hours - 40;
//									System.out.println("Employee has worked " + hours2 + " overtime \n");
//									pay = (hours2 * extraPay) + (40 * basePay);
//									System.out.println("Employee has worked over 60 hours and is entitled to be paid " + pay);
//								}
//							else if (hours > 40 && hours < 60)
//								{
//									hours2 = hours - 40;
//									System.out.println("Employee has worked " + hours2 + " overtime \n");
//									pay = (hours2 * extraPay);
//									System.out.println("Employee has worked over 40 hours and is entitled to be paid " + pay);
//								}
							

			//***********************************************************************************************************************************************//
//								double hours;
//								double hours2;
//								double basePay;
//								double pay;		
//								int count = 0;
//							
//								double array[][] = {{7.50,35.00},{8.2, 47}, {10, 73}};
//
//								for(int i = 0; i <3; i++)
//									{
//										basePay = array[i][0];
//										hours = array[i][1];
//										count ++;
//										
//										if (hours < 40)
//										{
//											pay = hours * basePay;
//											System.out.println("Employee has earned $" + pay);
//										}
//										else if (hours >= 40 && hours <= 60)
//										{
//											hours2 = hours - 40;
//											pay = (hours2*basePay) + (40*basePay);
//											System.out.println("Employee has earned $" + pay);
//										}
//										else if (hours > 60)
//										{
//											hours2 = hours - 40;
//											pay = (hours2*basePay) + (40*basePay);
//											System.out.println("Employee has earned $ " + pay);
//											
//										}
//									} 
//		
//			//***********************************************************************************************************************************************//
//	
//						String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
//						int times[] = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
//						
//						
//						int count = 0;
//						int low = times[1];
//						int num = 0;
//						
//						
//						Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
//	
//						
//						
//						
//						
//						while (count < times.length)
//						{
//							if(times[count] < low)
//							{
//								low = times[count];
//								num = count; 										//location given to the num to be used to search in names
//							}
//						count++;
//						
//						
//						 
//							
//							
//						}
//						System.out.println(names[num] + " had the quickest time of " + low);
//						System.out.println(names[num] + " had the second quickest time " + low2);
//							
			//***********************************************************************************************************************************************//
										//Assignment 4
						
						
				
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
			//***********************************************************************************************************************************************//
	}			//this is main exit
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
						//This section below is used for Array in methods ----------- MUST BE OUTSIDE OF MAIN
//						public static void change(int x[]) 													//this means we are building a method here and building an array ----- x is a variable but actually an array
//							{
//								for(int counter= 0; counter < x.length; counter ++)
//								x[counter] += 5;															//this adds five to each item in array
//							}
//				
			//***********************************************************************************************************************************************//
//				// this is for the multi array table
//				
//						public static void display(int x[][])													//this calls the array 
//						{
//							for(int row = 0; row < x.length; row++)												//this starts from row 0 
//							{																				//without 'x.Length' it won't know how big the array is 
//								for(int column = 0; column < x[row].length; column++)						//this starts from column 0 
//								{
//									System.out.print(x[row][column] +"\t");									// this print means it won't make a new line after it 
//								}
//							System.out.println();
//							}
//						}
//							
			//***********************************************************************************************************************************************//
//						//this is for variable length arguments
//	
//						public static int average(int...numbers)	//this '...' means you don't know how bid it is, this is called elipse
//						{
//							int total = 0;
//							for(int x:numbers)			//this sets variable to equal x
//								total +=x;		//+= means add value of x to total
//							
//							return total/numbers.length;
//							
//							
//						}
//
						//***********************************************************************************************************************************************//
							
//						public static void display(double x[][])
//						{ 
//							for(int row = 0; row < x.length; row++)
//							{
//								for(int column = 0; column < x[row].length; column++)
//								{
//									System.out.println(x[row][column]);
//								}
//								System.out.println();
//							}
//						}
							
			//***********************************************************************************************************************************************//
	
//	
//					public static void display(double x[][])
//					{
//						for (int row = 0; row < x.length; row++)
//							{
//									for(int column = 0; column < x[row].length; column++)
//										{
//											System.out.print(x[row][column]);
//											System.out.print("\t");
//										}
//								
//							}
//					}
//	
	

			//***********************************************************************************************************************************************//


			//***********************************************************************************************************************************************//


			//***********************************************************************************************************************************************//
}
