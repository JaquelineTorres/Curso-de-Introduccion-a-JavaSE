public class UpdatingVariables
{
    public static void main (String [] args){
        int salary = 1000;

        //bono $2000
        salary=salary+200;

        System.out.println("El salario con bono es: $"+salary);

        //pensión: 50 descuento
        salary=salary-50;
        System.out.println("Salario con descuento: $" + salary);
        //2 horas extras $30 c/u
        //Comida:$45
        salary=(salary+(2*30))-45;
        System.out.println("Salario con hrs extras y decuento de comida: $"+ salary);


        //ACTUALIZACION CADENA DE TEXTO
        String employeeName="Jaque Torres";
        employeeName=employeeName+" Pérez";

        System.out.println("El nombre del empleado es : "+employeeName);

    }
}
