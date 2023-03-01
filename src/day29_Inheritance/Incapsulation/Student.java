package day29_Inheritance.Incapsulation;



public class Student {
    private String name;
    private int age;
    private char gender,grade;
    private String schoolName;


    public String getName(){ //read only
        if(name == null){
            name = "Unknown";
        }
        return name;
    }
     public void setName(String name){ // write only
        if(name.isEmpty()){
            System.err.println("invalid Student name");
            System.exit(1);
        }
        this.name =name;
     }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){//bu conditioni once koyamazsan 5 den kucuk olanlar da sifirdan kucuk olanlakarisir
            System.err.println("age can not be negative "+age);
        }
        if (age <5 || age>90){
            System.err.println("Invalid student age " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else {
            System.err.println("Invalid gender: " + gender);
        }
    }


    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';

        if(isValid) {
            this.grade = grade;
        }else{
            System.err.println("Invalid grade: "+grade);
            System.exit(1);
        }
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);//its also check all the conditions in every block if there is any than its create
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public void study(){
        System.out.println(name +" is studying at "+schoolName);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
