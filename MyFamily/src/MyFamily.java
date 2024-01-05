import java.time.Year;
public class MyFamily {
    public static void main(String [] args){
       /*                 Variables
        Ejercicio 1.
        Ponte creativo y preséntanos a tu familia con variables, utiliza todos los tipos y cantidad de variables que puedas,
        no olvides las convenciones de nombres Camel Case.
        */

        //Family details using variables
        String familyName = "Torres";
        int numberOfMembers = 5;

        //Parents' information
        String fatherName = "Agustin";
        int fatherAge = Year.now().getValue()-1958;
        boolean isFatherMarried = true;
        double fatherMidiChlorians = 25000;

        String motherName = "Catalina";
        int motherAge = Year.now().getValue()-1957;
        boolean isMotherMarried = true;
        double motherMidiChlorians = 25000;

        //Children's information
        String firstChildName = "Tania";
        int firstChildAge = Year.now().getValue() - 1990;
        double firstMidiChlorians = 15000;

        String secondChildName = "Nadia";
        int secondChildAge = Year.now().getValue()-1992;
        double secondMidiChlorians = 15000;

        String thirdChildName = "Jaqueline";
        int thirdChildAge = Year.now().getValue()-1996;
        double thirdMidiChlorians = 15000;

        //Display family infomation
        System.out.println("✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦");
        System.out.println("Family Name: "+ familyName);
        System.out.println("Number of Members: " +numberOfMembers);
        System.out.println("✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦");

        //Display Father's information

        displayPersonInformation("Father",fatherName,fatherAge,isFatherMarried,fatherMidiChlorians);

        //Display Mother's information
        displayPersonInformation("Mother",motherName,motherAge,isMotherMarried,motherMidiChlorians);

        //Display Children's information
        System.out.println("✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦");
        System.out.println("Children: ");
        displayPersonInformation(firstChildName,firstChildAge,firstMidiChlorians);
        displayPersonInformation(secondChildName,secondChildAge,secondMidiChlorians);
        displayPersonInformation(thirdChildName,thirdChildAge,thirdMidiChlorians);
    }

    //Helper method to display person's infomation
    private static void displayPersonInformation(String role, String name, int age, boolean isMarried, double midiChlorians){
        System.out.println("\n"+role+";");
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Married: "+isMarried);
        System.out.println("MidiChlorians: "+ midiChlorians+ " 🚀 ");
    }
    // Overloaded helper method for displaying children's information
    private static void displayPersonInformation(String name, int age, double midiChlorians){
        displayPersonInformation(name,name, age,false, midiChlorians);
    }
}
