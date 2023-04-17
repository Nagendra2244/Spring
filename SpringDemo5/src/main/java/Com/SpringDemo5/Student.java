package Com.SpringDemo5;
public class Student {
  int Stuno;
  String StuName;
  double StuAvg;
  test t;
  public Student(int Stuno,String StuName,double StuAvg,test t) {
	  super();
	  this.Stuno=Stuno;
	  this.StuName=StuName;
	  this.StuAvg=StuAvg;
	  this.t=t;
	  
  }
  public String toString() {
      return  Stuno + StuName + StuAvg+ t.toString() ;
  }
}
