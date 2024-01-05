public class SwitchStatement {
    public static void main(String[] args) {
        String diaDeLaSemana = "Martes";
        String tipoActividad;

        switch (diaDeLaSemana) {
            case "Lunes", "Martes", "Miércoles", "Jueves", "Viernes" -> tipoActividad = "Día laboral";
            case "Sábado", "Domingo" -> tipoActividad = "Fin de semana";
            default -> tipoActividad = "Día no válido";
        }

    }
}



