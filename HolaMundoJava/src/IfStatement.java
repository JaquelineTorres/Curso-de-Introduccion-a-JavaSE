public class IfStatement {

    public static void main(String [] args){
        boolean isBluetoothEnabled = false;
        int fileSended = 3;
        if (isBluetoothEnabled){
            //Send file
            fileSended++;
            int i = 1;
            System.out.println("Archivo Enviado");
        }else{
            fileSended--;
            System.out.println("Por favor enciende tu Bluetooth, para iniciar la transferencia de datos");
        }
        //System.out.println("i: "+ i);
        System.out.println("isBluetoothEnabled: "+ isBluetoothEnabled);
        System.out.println("fileSended: "+ fileSended);
    }
}

