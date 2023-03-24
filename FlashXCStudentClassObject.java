// Reference:
// https://www.youtube.com/watch?v=Mm06BuD3PlY
public class FlashXCStudentClassObject {
    public static void main(String [] args) {

        // Giraffe Academy classes example:
        Student myStudent = new Student();
        myStudent.firstName = "Jim";
        System.out.println("First Name: " + myStudent.firstName);
        myStudent.lastName = "Halpert";
        System.out.println("Last Name: " + myStudent.lastName);
        myStudent.major = "Nursing";
        System.out.println("Major: " + myStudent.major);
        myStudent.gpa = 2.3;
        System.out.println("GPA: " + myStudent.gpa);
        myStudent.age = 24;
        System.out.println("Age: " + myStudent.age);
        myStudent.onProbation = false;
        System.out.println("On probation: " + myStudent.onProbation);

        System.out.println("\n");
        // Create two new students
        // Student #1:
        Student myStudent1 = new Student();
        myStudent1.firstName = "Ron";
        System.out.println("First Name: " + myStudent1.firstName);
        myStudent1.lastName = "Goldberg";
        System.out.println("Last Name: " + myStudent1.lastName);
        myStudent1.major = "Computer Science";
        System.out.println("Major: " + myStudent1.major);
        myStudent1.gpa = 3.3;
        System.out.println("GPA: " + myStudent1.gpa);
        myStudent1.age = 21;
        System.out.println("Age: " + myStudent1.age);
        myStudent1.onProbation = false;
        System.out.println("On probation: " + myStudent1.onProbation);

        System.out.println("\n");
        // Student #2:
        Student myStudent2 = new Student();
        myStudent2.firstName = "Hailey";
        System.out.println("First Name: " + myStudent2.firstName);
        myStudent2.lastName = "Smith";
        System.out.println("Last Name: " + myStudent2.lastName);
        myStudent2.major = "Engineering";
        System.out.println("Major: " + myStudent2.major);
        myStudent2.gpa = 2.6;
        System.out.println("GPA: " + myStudent2.gpa);
        myStudent2.age = 22;
        System.out.println("Age: " + myStudent2.age);
        myStudent2.onProbation = true;
        System.out.println("On probation: " + myStudent2.onProbation);
    }
}
