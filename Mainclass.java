package RealQuez;

import java.util.Scanner;

class oneQuestionException extends Exception{
	public String getMessage() {
		return "the first question is wrong sorry try next time"+"exit";
	}
}
class twoQuestionException extends Exception{
	public String getMessage() {
		return "the second question is wrong  sorry try next time "+"exit";
	}
}
class threeQuestionException extends Exception{
	public String getMessage() {
		return "the third question is wrong  sorry try next time "+"exit";
	}
}
class fourthQuestionException extends Exception{
	public String getMessage() {
		return "the first question is wrong sorry try next time"+"exit";
	}
}
class fifthQuestionException extends Exception{
	public String getMessage() {
		return "the second question is wrong  sorry try next time "+"exit";
	}
}
class sixthQuestionException extends Exception{
	public String getMessage() {
		return "the third question is wrong  sorry try next time "+"exit";
	}
}
class seventhQuestionException extends Exception{
	public String getMessage() {
		return "the first question is wrong sorry try next time"+"exit";
	}
}
class eightQuestionException extends Exception{
	public String getMessage() {
		return "the second question is wrong  sorry try next time "+"exit";
	}
}
class nineQuestionException extends Exception{
	public String getMessage() {
		return "the third question is wrong  sorry try next time "+"exit";
	}
}
class tenQuestionException extends Exception{
	public String getMessage() {
		return "the third question is wrong  sorry try next time "+"exit";
	}
}
public class Mainclass {
	public static void main(String[] args) {
		personClass p1=new personClass("hasnain",2445);
		oneQuestionException i1=new oneQuestionException();
		twoQuestionException i2=new twoQuestionException();
		threeQuestionException i3=new threeQuestionException();
		fourthQuestionException i4=new fourthQuestionException();
		fifthQuestionException i5=new fifthQuestionException();
		sixthQuestionException i6=new sixthQuestionException();
		seventhQuestionException i7=new seventhQuestionException();
		eightQuestionException i8=new eightQuestionException();
		nineQuestionException i9=new nineQuestionException();
		tenQuestionException i10=new tenQuestionException();
		LifeLinequestion1 l =new LifeLinequestion1();
		lifelinewantsornot l1=new lifelinewantsornot();
		int lifeline =3;
		Scanner sc =new Scanner(System.in);
		System.out.println("this question is for "+p1.name);
		System.out.println("1.What number comes next in the sequence: 1, 3, 5, 7...?");
		System.out.print("A]11"+"                "+"B]9");
		System.out.println();
		System.out.println("C]23"+"                "+"D]24");
		char res1='B';
		int lifelinechoice=l1.askForLifeline();
		if(lifeline>0) {
		if(lifelinechoice==1) {
			l.fiftyfifty("A],C]");
			lifeline--;
		}
		else if(lifelinechoice==2) {
			l.audionce("B]","B] has 85% choosen by audence");
			lifeline--;
		}
		else if(lifelinechoice==3) {
			l.PhonecallAfriend("B]","Your friend has choosen this option");
			lifeline--;
		}
		}
		System.out.println("Enter the correct Option(A,B,C,D)");
		char res =sc.next().charAt(0);
		try{
			if(res!=res1) {
				throw i1;
			}
			else {
				System.out.println("Correct answer");
				System.out.println("mr hasnain u reworded with RS.100000 inside ur bankaccount"+p1.bankaccount);
				System.out.println("this question is for "+p1.name);
				System.out.println("2. \r\n"
						+ "Find the missing number in the sequence: 3, 6, 9, __, 15.");
				System.out.print("A]10"+"                "+"B]11");
				System.out.println();
				System.out.println("C]12"+"                "+"D]24");
				char res2='C';
				Scanner sc1 =new Scanner(System.in);
				int lifelinechoice1=l1.askForLifeline();
				if(lifeline>0) {
				if(lifelinechoice1==1) {
					l.fiftyfifty("A] ,B]");
					lifeline--;
				}
				else if(lifelinechoice1==2) {
					l.audionce("C]","C] has 80% chososen by audence");
					lifeline--;
				}
				else if(lifelinechoice1==3) {
					l.PhonecallAfriend("C]","Your friend has choosen this option:");
					lifeline--;
				}
				}
				System.out.println("Enter the correct Option(A,B,C,D)");
				char res3 =sc1.next().charAt(0);
				if(res3!=res2) {
					throw i2;
				}
				else {
					System.out.println("Correct answer");
					System.out.println("mr hasnain u reworded with RS.200000 inside ur bankaccount"+p1.bankaccount);
					System.out.println("this question is for "+p1.name);
					System.out.println("3. \r\n"
							+ "..................... is the smallest 6 digit number.");
					System.out.print("A]10"+"                "+"B]11");
					System.out.println();
					System.out.println("C]12"+"                "+"D]24");
					char res4='B';
					Scanner sc2 =new Scanner(System.in);
					int lifelinechoice2=l1.askForLifeline();
					if(lifeline>0) {
					if(lifelinechoice2==1) {
						l.fiftyfifty("A] ,D]");
						lifeline--;
					}
					else if(lifelinechoice2==2) {
						l.audionce("B]","has 80% chososen by audence");
						lifeline--;
					}
					else if(lifelinechoice2==3) {
						l.PhonecallAfriend("B]","Your friend has choosen this option:");
						lifeline--;
					}
					}
					System.out.println("Enter the correct Option(A,B,C,D)");
					char res5 =sc2.next().charAt(0);
					if(res4!=res5) {
						throw i3;
					}
					else {
						System.out.println("Correct answer");
						System.out.println("mr hasnain u reworded with RS.300000 inside ur bankaccount"+p1.bankaccount);
						System.out.println("this question is for "+p1.name);
						System.out.println("4. \r\n"
								+ "In what year was the United Nations founded?");
						System.out.print("A]1920"+"                "+"B]1945");
						System.out.println();
						System.out.println("C]1950"+"                "+"D]1935");
						char res6='B';
						Scanner sc3 =new Scanner(System.in);
						int lifelinechoice3=l1.askForLifeline();
						if(lifeline>0) {
						if(lifelinechoice3==1) {
							l.fiftyfifty("A] ,D]");
							lifeline--;
						}
						else if(lifelinechoice3==2) {
							l.audionce("B]","has 80% chososen by audence");
							lifeline--;
						}
						else if(lifelinechoice3==3) {
							l.PhonecallAfriend("B]","Your friend has choosen this option:");
							lifeline--;
						}
						}
						System.out.println("Enter the correct Option(A,B,C,D)");
						char res7 =sc3.next().charAt(0);
						if(res6!=res7) {
							throw i4;
						}
						else {
							System.out.println("Correct answer");
							System.out.println("mr hasnain u reworded with RS.400000 inside ur bankaccount"+p1.bankaccount);
							System.out.println("this question is for "+p1.name);
							System.out.println("5. \r\n"
									+ "What is a correct syntax to output \"Hello World\" in Java?");
							System.out.print("A]System.out.println(Hello World)"+"                     "+"B]error.out.print(hello world)");
							System.out.println();
							System.out.println("C]print(hello world)"+"                "+"D]system.out.printf(%d hello world\n)");
							char res8='A';
							Scanner sc4 =new Scanner(System.in);
							int lifelinechoice4=l1.askForLifeline();
							if(lifeline>0) {
							if(lifelinechoice4==1) {
								l.fiftyfifty("C] ,D]");
								lifeline--;
							}
							else if(lifelinechoice4==2) {
								l.audionce("A]","has 80% chososen by audence");
								lifeline--;
							}
							else if(lifelinechoice4==3) {
								l.PhonecallAfriend("A]","Your friend has choosen this option:");
								lifeline--;
							}
							}
							System.out.println("Enter the correct Option(A,B,C,D)");
							char res9 =sc4.next().charAt(0);
							if(res8!=res9) {
								throw i5;
							}
							else {
								System.out.println("Correct answer");
								System.out.println("mr hasnain u reworded with RS.500000 inside ur bankaccount"+p1.bankaccount);
								System.out.println("this question is for "+p1.name);
								System.out.println("6. \r\n"
										+ "Which data type is used to create a variable that should store text?");
								System.out.print("A]Integer"+"                     "+"B]Mystring");
								System.out.println();
								System.out.println("C]txt"+"                    "+"D]String");
								char res10='D';
								Scanner sc5 =new Scanner(System.in);
								int lifelinechoice5=l1.askForLifeline();
								if(lifeline>0) {
								if(lifelinechoice5==1) {
									l.fiftyfifty("B] ,C]");
									lifeline--;
								}
								else if(lifelinechoice5==2) {
									l.audionce("D]","has 80% chososen by audence");
									lifeline--;
								}
								else if(lifelinechoice5==3) {
									l.PhonecallAfriend("D]","Your friend has choosen this option:");
									lifeline--;
								}
								}
								System.out.println("Enter the correct Option(A,B,C,D)");
								char res11 =sc5.next().charAt(0);
								if(res10!=res11) {
									throw i6;
								}
								else {
									System.out.println("Correct answer");
									System.out.println("mr hasnain u reworded with RS.600000 inside ur bankaccount"+p1.bankaccount);
									System.out.println("this question is for "+p1.name);
									System.out.println("7. \r\n"
											+ "How do you create a variable with the numeric value 5?\r\n");
									System.out.print("A]num x=5;"+"                     "+"B]X=5");
									System.out.println();
									System.out.println("C]int x=5;"+"                    "+"D]float x=5;");
									char res12='C';
									Scanner sc6 =new Scanner(System.in);
									int lifelinechoice6=l1.askForLifeline();
									if(lifeline>0) {
									if(lifelinechoice6==1) {
										l.fiftyfifty("A] ,B]");
										lifeline--;
									}
									else if(lifelinechoice6==2) {
										l.audionce("C]","has 80% chososen by audence");
										lifeline--;
									}
									else if(lifelinechoice6==3) {
										l.PhonecallAfriend("C]","Your friend has choosen this option:");
										lifeline--;
									}
									}
									System.out.println("Enter the correct Option(A,B,C,D)");
									char res13 =sc6.next().charAt(0);
									if(res12!=res13) {
										throw i7;
									}
									else {
										System.out.println("Correct answer");
										System.out.println("mr hasnain u reworded with RS.700000 inside ur bankaccount"+p1.bankaccount);
										System.out.println("this question is for "+p1.name);
										System.out.println("8. \r\n"
												+ "Which method can be used to find the length of a string in java?");
										System.out.print("A]len"+"                     "+"B]getSize()");
										System.out.println();
										System.out.println("C]getLength;"+"                    "+"D]length()");
										char res14='D';
										Scanner sc7 =new Scanner(System.in);
										int lifelinechoice7=l1.askForLifeline();
										if(lifeline>0) {
										if(lifelinechoice7==1) {
											l.fiftyfifty("A] ,B]");
											lifeline--;
										}
										else if(lifelinechoice7==2) {
											l.audionce("D]","has 80% chososen by audence");
											lifeline--;
										}
										else if(lifelinechoice7==3) {
											l.PhonecallAfriend("D]","Your friend has choosen this option:");
											lifeline--;
										}
										}
										System.out.println("Enter the correct Option(A,B,C,D)");
										char res15 =sc7.next().charAt(0);
										if(res14!=res15) {
											throw i8;
										}
										else {
											System.out.println("Correct answer");
											System.out.println("mr hasnain u reworded with RS.800000 inside ur bankaccount"+p1.bankaccount);
											System.out.println("this question is for "+p1.name);
											System.out.println("9. \r\n"
													+ "Which method can be used to return a string in upper case letters?");
											System.out.print("A]toUpperCase()"+"                     "+"B]touppercase()");
											System.out.println();
											System.out.println("C]toLowercase()"+"                    "+"D]upercase");
											char res16='A';
											Scanner sc8 =new Scanner(System.in);
											int lifelinechoice8=l1.askForLifeline();
											if(lifeline>0) {
											if(lifelinechoice8==1) {
												l.fiftyfifty("B] ,C]");
												lifeline--;
											}
											else if(lifelinechoice8==2) {
												l.audionce("A]","has 80% chososen by audence");
												lifeline--;
											}
											else if(lifelinechoice8==3) {
												l.PhonecallAfriend("A]","Your friend has choosen this option:");
												lifeline--;
											}
											}
											System.out.println("Enter the correct Option(A,B,C,D)");
											char res17 =sc8.next().charAt(0);
											if(res16!=res17) {
												throw i9;
											}
											else {
												System.out.println("Correct answer");
												System.out.println("mr hasnain u reworded with RS.900000 inside ur bankaccount"+p1.bankaccount);
												System.out.println("this question is for "+p1.name);
												System.out.println("10. \r\n"
														+ "Which operator can be used to compare two values?");
												System.out.print("A]<>"+"                     "+"B]=");
												System.out.println();
												System.out.println("C]equal"+"                    "+"D]==");
												char res18='D';
												Scanner sc9 =new Scanner(System.in);
												int lifelinechoice9=l1.askForLifeline();
												if(lifeline>0) {
												if(lifelinechoice9==1) {
													l.fiftyfifty("B] ,C]");
													lifeline--;
												}
												else if(lifelinechoice9==2) {
													l.audionce("D]","has 80% chososen by audence");
													lifeline--;
												}
												else if(lifelinechoice9==3) {
													l.PhonecallAfriend("D]","Your friend has choosen this option:");
													lifeline--;
												}
												}
												System.out.println("Enter the correct Option(A,B,C,D)");
												char res19 =sc9.next().charAt(0);
												if(res18!=res19) {
													throw i10;
												}
												else {
													System.out.println("Correct answer");
													System.out.println("mr hasnain u reworded with RS.1000000 inside ur bankaccount"+p1.bankaccount);
													System.out.println("Your Quiz is completed");
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		catch(oneQuestionException |twoQuestionException|threeQuestionException|fourthQuestionException|fifthQuestionException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		catch(sixthQuestionException e) {
			System.out.println(i6.getMessage());
			System.exit(0);
		}
		catch(seventhQuestionException e) {
			System.out.println(i7.getMessage());
			System.exit(0);
		}
		catch(eightQuestionException e) {
			System.out.println(i8.getMessage());
			System.exit(0);
		}
		catch(nineQuestionException e) {
			System.out.println(i9.getMessage());
			System.exit(0);
		}
		catch(tenQuestionException e) {
			System.out.println(i10.getMessage());
			System.exit(0);
		}
	}
}
