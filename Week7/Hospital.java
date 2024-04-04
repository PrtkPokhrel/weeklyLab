// Design and implement a set of classes that define the employees of a hospital: doctor, nurse, receptionist, cleaner etc. Include methods in each class that are named according to the services provided by that person and that print an appropriate message. 
// Eg Nurse <name> Emp# has <x> patients
// Doctor <name> Emp# specializes in <specialism>
// Cleaner <name> Emp# of <department> is sweeping

// Create a driver class to instantiate and test the classes

package Week7;

public class Hospital {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("John Doe", 123, "Cardiology");
        doctor.diagnosePatient();

        Nurse nurse = new Nurse("Jane Smith", 456, 10);
        nurse.provideCare();

        Cleaner cleaner = new Cleaner("Alice Brown", 789, "Emergency Department");
        cleaner.clean();
    }
}



class HospitalEmployee {
    private String name;
    private int employeeNumber;

    public HospitalEmployee(String name, int employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }
}

class Doctor extends HospitalEmployee {
    private String specialism;

    public Doctor(String name, int employeeNumber, String specialism) {
        super(name, employeeNumber);
        this.specialism = specialism;
    }

    public void diagnosePatient() {
        System.out.println("Doctor " + getName() + " Emp#" + getEmployeeNumber() + " specializes in " + specialism);
    }
}

class Nurse extends HospitalEmployee {
    private int numberOfPatients;

    public Nurse(String name, int employeeNumber, int numberOfPatients) {
        super(name, employeeNumber);
        this.numberOfPatients = numberOfPatients;
    }

    public void provideCare() {
        System.out.println("Nurse " + getName() + " Emp#" + getEmployeeNumber() + " has " + numberOfPatients + " patients");
    }
}

class Cleaner extends HospitalEmployee {
    private String department;

    public Cleaner(String name, int employeeNumber, String department) {
        super(name, employeeNumber);
        this.department = department;
    }

    public void clean() {
        System.out.println("Cleaner " + getName() + " Emp#" + getEmployeeNumber() + " of " + department + " is sweeping");
    }
}

