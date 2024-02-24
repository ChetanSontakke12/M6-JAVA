//Marksheet declear
class Marksheet_Declear
{
//main mathod
public static void main(String []me)
{
System.out.println("-----------------------------------------------------------------------");
System.out.println("                    Nagar Parishad High School");
System.out.println("                         Maharashtra Board");
System.out.println("Name:Chetan.K.Sontakke                         Date:23/02/2019");
System.out.println("Roll No:25"+"                Sec:B                "+"Exam:final");
System.out.println("-----------------------------------------------------------------------");
System.out.println("                                                 ");
int sub1=85,sub2=75,sub3=65;
int m1=sub1+sub2+sub3;
int t1=100,t2=100,t3=100;
int m2=t1+t2+t3;
float percentage=m1*100/300;
String grade= (percentage>80 && percentage<=100)?("A"):
              (percentage>70 && percentage<=80)?("B"):
              (percentage>60 && percentage<=70)?("C"):
              ("Faild");
System.out.println(" Subject                        Mark obtaind        Total Mark");
System.out.println(" 1.Physisc                         "+sub1+"               "+t1);
System.out.println(" 2.Chemistry                       "+sub2+"               "+t2);
System.out.println(" 3.Math                            "+sub3+"               "+t3);
System.out.println("                                                                 ");
System.out.println(" Total Subject=3        obtaind mark="+m1+"      Total mark="+m2);
System.out.println("-----------------------------------------------------------------------");
System.out.println("Percentage: "+percentage+"                                 Grade:"+grade);
System.out.println("Remark:Good                                 Signature:kunal khelkar");
System.out.println("-----------------------------------------------------------------------");
}

}