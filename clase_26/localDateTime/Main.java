package clase_26.localDateTime;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args){
        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);
        fecha = fecha.plusDays(5);
        System.out.println(fecha);

        LocalTime hora = LocalTime.now();
        System.out.println(hora);

        LocalDateTime fechaYhora = LocalDateTime.now();
        System.out.println(fechaYhora);

        DateTimeFormatter formatFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaFormateada = fechaYhora.format(formatFecha);
        System.out.println(fechaFormateada);

        LocalDateTime fecha2 = LocalDateTime.of(2023,5,10,10,10);
        if(fechaYhora.isAfter(fecha2)){
            System.out.println("La fecha no es anterior");
        }
    }
}
