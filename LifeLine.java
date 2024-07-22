package RealQuez; 
class LifeLinequestion1 {
boolean fiftyfifty=false;
boolean audionce=false;
boolean PhonecallAfriend=false;

public void fiftyfifty(String Option) {
if(!fiftyfifty) {
	System.out.println("50-50 life line : removes two incorrect options"+Option);
	fiftyfifty =true;
}
else {
	System.out.println("You have already Used this life line");
}
}
public void audionce(String option,String message) {
	if(!audionce) {
        System.out.println("Audience Poll lifeline: The audience's most popular answer will be displayed."+option+message);
	}
	else {
		System.out.println("You have already Used this life line");
	}
}
public void PhonecallAfriend(String option,String message) {
	if(!PhonecallAfriend) {
        System.out.println("Phone a Friend lifeline: Your friend's answer will be displayed."+option+message);
	}
	else {
		System.out.println("You have already Used this life line");
	}
}
}
