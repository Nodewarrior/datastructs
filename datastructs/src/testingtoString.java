/**
 * Created by akshay on 4/16/17.
 */
public class testingtoString {
    int rollno;
    String name;
    String city;

    testingtoString(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    public String toString(){
        return rollno + " " + name + " " + city;
    }

    public static void main(String[] args) {
        testingtoString student = new testingtoString(21, "Akshay", "Hyderabad" );


        System.out.println(student);
    }
}
