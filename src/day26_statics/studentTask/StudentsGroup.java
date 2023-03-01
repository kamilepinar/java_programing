package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup { // studentGroup Has a Student, has relations ship:when ever one clases instancce being use in another

    public String groupName;
    public int groupId;
    public ArrayList<Student> students =new ArrayList<>();//creates the student group object by setting the group name and group id

    public StudentsGroup(String groupName, int groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
        //students = new ArrayList<>(); // size is :0

    }

    public void addStudent(Student student){//void instance yapiyor hepsine degil sadece bir tane student gruba
        students.add(student);
    }// Takes one student object, and adds it to the arraylist of students

    public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students));
    } // Takes one array of students, and adds the array of students to the arraylist of students

    public void addStudent(String name, int age, char gender, String id){
        //  Student student = new Student(name, age, gender, id);
        students.add( new Student(name, age, gender, id) );
    } // takes name, age, gender, id of student info, creates student object by using the given info, then adds the student object to the arraylist of students


    public void removeStudent(String id){
        students.removeIf( p -> p.id.equals(id) );
    } // Takes the id and then removes the student object with the specified id from arraylist of students

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }
}
/*


2. Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)
	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constructor's body
	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList
	                removeStudent(id): removes the student with the specified id from the students arraylist
	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
 */