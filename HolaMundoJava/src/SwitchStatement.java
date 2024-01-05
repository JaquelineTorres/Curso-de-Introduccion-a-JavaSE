public class SwitchStatement {
    public static void main(String [] args){
        String colorModelSelected ="a";
        switch(colorModelSelected){
            case "Light":
                System.out.println("Selected Light Mode");
                break;
            case "Night":
                System.out.println("Selected Night Mode");
                break;
            case "Dark":
                System.out.println("Selected Dark Mode");
                break;
            default:
                System.out.println("Select one option if is correct");
        }
    }
}

