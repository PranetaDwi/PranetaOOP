
public class Main {
    public static void main(String[] args) {
        // PEMBUATAN DAN PEMANGGILAN PERSON
        Person A = new Person("neta", "kp");
        System.out.println("Membuat object A");
        System.out.println("nama: " + A.getName());
        System.out.println("Address: " + A.getAddress());
        System.out.println(A.toString());
        // PEMBUATAN DAN PAMANGGILAN STUDENT
        Student B = new Student("neta", "kp", "D4", 45, 900);
        System.out.println("Membuat object B");
        System.out.println("nama: " + B.getName());
        System.out.println("Address: " + B.getAddress());
        System.out.println("Program: " + B.getProgram());
        System.out.println("Year: " + B.getYear());
        System.out.println("Fee: " + B.getFee());
        System.out.println(B.toString());
        // PEMBUATAN DAN PAMANGGILAN STAFF
        Staff C = new Staff("bambang", "jkt", "MIT", 700);
        System.out.println("Membuat object C");
        System.out.println("nama: " + C.getName());
        System.out.println("Address: " + C.getAddress());
        System.out.println("Sekolah: " + C.getSchool());
        System.out.println("Pay: " + C.getPay());
        System.out.println(C.toString());
    }
}