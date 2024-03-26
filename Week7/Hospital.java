// Design and implement a set of classes that define the employees of a hospital: doctor, nurse, receptionist, cleaner etc. Include methods in each class that are named according to the services provided by that person and that print an appropriate message. 
// Eg Nurse <name> Emp# has <x> patients
// Doctor <name> Emp# specializes in <specialism>
// Cleaner <name> Emp# of <department> is sweeping

// Create a driver class to instantiate and test the classes

package Week7;

public class Hospital {
    public static void main(String[] args) {

        Staff doctor1=new Staff();
        String d1=doctor1.doctor("Robert","A21","20","Heart");
        System.out.println(d1);


    }
}   
class Staff{

    public String doctor(String name,String id,String patientNumber,String specialism){
        return "Doctor: "+name+"\n EmpID: "+id+"\n Specializes in: "+specialism+"\nNumber of patients: "+patientNumber;
    }

}

