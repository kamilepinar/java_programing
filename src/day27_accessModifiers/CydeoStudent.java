package day27_accessModifiers;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;

    public static String schoolName;//you need to declare first to use in static block
    public static String secretCode;//burdada"woodenspoon" yazabilirdin

    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        //schoolName ="Cydeo School";// her seferinde buda execute olur gerek yok
    }


    static {// burda yazani yukardada verebilirdin ama orda sadece bir tane yazilabiliyor ilerde multiple step icin bu assagidakini ogren
        schoolName ="Cydeo School";//static one time execute oluyor ve ilk execute olan
        secretCode = "Wooden Spoon";// simdi bunlar sadece bir sefer olucak
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
