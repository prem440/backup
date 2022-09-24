package com.te.addredss;

import java.util.Scanner;

public class user {
static addres h;
static addres o;
static addres v;
public static void main(String[] args) {
	Name n = new Name();
	n.email_id="sonawaner52@gmail.com";
	n.mobile_no=9762149234l;
	n.name="ravi";
h=new addres();
n.a=h;
n.a.pincode=412105;
n.a.survey_no=598;
n.a.landmark="ayyangar bakkery";
n.a.city="pune";
n.a.area="pimpri chinwad";
v=new addres();

n.a=v;
n.a.pincode=310549;
n.a.survey_no=985;
n.a.landmark="hanuman mandal";
n.a.city="karjat";
n.a.area="ahamdnagar";
o=new addres();

n.a=o;
n.a.pincode=510430;
n.a.survey_no=128;
n.a.landmark="indiqube south mile";
n.a.city="jayanagr";
n.a.area="bangloure";

Scanner sc=new Scanner(System.in);
System.out.println("enter pin for specific add ");
System.out.println("1- for home");
System.out.println("2-for office");
System.out.println("3- for vilage");
int d=sc.nextInt();
if(d==1)
{
	h.details();
}
else if(d==2)
{
	o.details();
}
else if(d==3)
{
	v.details();
}
}

}
