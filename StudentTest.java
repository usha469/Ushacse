class Student
{
int regno;
int sem;
double age;
String name;

int promote()
{
sem=sem+1;
return sem;
}
void setdata(int reg,int semster,double sage,String sname)
{
 regno=reg;
 sem=semster;
 age=sage;
 name=sname;
}
void displaydata()
{
System.out.println("Register number="+ regno);
System.out.println("Semster="+ sem);
System.out.println("Age="+ age);
System.out.println("Nmae="+ name);
}
}

class StudentTest
{
public static void main(String args[])
{
  Student sobj;
  int newsem;
  sobj = new Student();
  System.out.println("student details with defalt values");
  sobj.displaydata();
  sobj.setdata(123,4,7,"kaveri");
  System.out.println("student details with values");
  sobj.displaydata();
  newsem=sobj.promote();
  System.out.println("After calling promote");
  System.out.println("new semster is="+newsem);
  sobj.displaydata();
}
}