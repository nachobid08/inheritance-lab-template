public class Main
{
  public static void main(String [] args)
  {
    // Student(String name, int age, String gender, String idNum, double gpa)
    Person me = new Student("H", 3, "F", "2584", 4.0);
    
    System.out.println("Hi, " + me.getName() + ". What's your GPA?");
    System.out.println("My GPA is: " + ((Student)me).getGPA());

    //Teacher you = new Teacher("C", 30, "F");
    Teacher you = new Teacher("C", 30, "F", "Math", 45000.0);


    Student nacho = new Student("Nacho Bid", 16, "M", "97845", 3.8);
    CollegeStudent jack = new CollegeStudent("Jack Frost", 18, "M", "98637", 4.0, 1, "Computer Science");

    System.out.println("My teacher is: " + you.getName());
    System.out.println(nacho);
    System.out.println(jack);
  }
}
