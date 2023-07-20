import java.util.Scanner;
class student{
    private String name;
    private String usn;
  public student(String usn,String name) {
     this.usn=usn;
    this.name=name;
  } 
   public String getUSN(){
        return usn;
    }
    public void setUSN(String usn){
        this.usn=usn;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
class UGstud extends student{
    private int sem;
    private String branch;
public UGstud(String usn,String name,int sem,String branch){
    super(usn, name);
    this.sem=sem;
    this.branch=branch;
}
    public int getSEM(){
        return sem;
    }
    public void setSEM(int sem){
      this.sem=sem;
    }
    public String getBranch(){
        return branch;
    }
    public void setBranch(String branch){
        this.branch=branch;
    }
}

class PGstud extends student{
    private String Specialization;
    private String UGDegree;

    public PGstud(String usn,String name,String Specialization,String UGDegree){
        super(usn,name);
        this.Specialization=Specialization;
        this.UGDegree=UGDegree;
    }
    public String getSpecialization(){
        return Specialization;
    }
    public void setSpecialization(String Specialization){
        this.Specialization=Specialization;
    }
    public String getUGDegree(){
        return UGDegree;
    }
    public void setUGDegree(String UGDegree){
        this.UGDegree=UGDegree;
    }
}
public class StudSys {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no of Students in list:");
        int n = obj.nextInt();
        student[] a = new student[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the program for which student is registered : 1.UG  2.PG ");
            String type = obj.next();
            if (type.equals("UG")){
                System.out.println("Enter the Name of the student :");
                String name = obj.next();
                System.out.println("USN of the Studnent :");
                String usn = obj.next();

                System.out.println("Current Semester of the Student :");
                int sem = obj.nextInt();
                System.out.println("Branch of the Student :");
                String branch = obj.next(); 
                UGstud object = new UGstud(usn, name, sem, branch);
                object.setSEM(sem);
                object.setBranch(branch);
                 a[i] = object;
            }else if(type.equals("PG")){
            System.out.println("Enter the Name of the student:");
            String name = obj.next();
            System.out.println("USN of the student:"); 
            String usn = obj.next();
            System.out.println("Specialization of the student:");
            String spec = obj.next(); 
            System.out.println("UG degree of the student:");
            String ug = obj.next();
            PGstud Object = new PGstud(usn, name, spec, ug);
           Object.setSpecialization(spec);
           Object.setUGDegree(ug);
                a[i] = Object;
            } else {
            System.out.println("Invalid type of student"); }
            }
for (int i = 0; i < n; i++) {
System.out.println("Name is :"+ a[i].getName()); 
System.out.println("USN is :"+a[i].getUSN());
if (a[i] instanceof UGstud) {
UGstud ugstud = (UGstud) a[i];
System.out.println("Semester is :"+ ugstud.getSEM());
System.out.println("Branch is :"+ ugstud.getBranch()); } 
else if (a[i] instanceof PGstud) {
PGstud pgstud = (PGstud) a[i];
System.out.println("Specialization is :" + pgstud.getSpecialization());
System.out.println("UG Degree" + pgstud.getUGDegree());
   }
  }  
 }
}