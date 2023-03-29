
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class dateTime {

    public static void main(String[] args) {

        //como formartar data local
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //formatar data e hora local
        DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //imprime data local
        LocalDate exemplo1 = LocalDate.now();

        //imprime data e hora local
        LocalDateTime exemplo2 = LocalDateTime.now();

        //imprime data hora GMT
        Instant exemplo3 = Instant.now();

        //imprime objeto passado conforme norma ISO8601
        LocalDate exemplo4 = LocalDate.parse("2022-07-20");

        LocalDateTime exemplo5 = LocalDateTime.parse("2022-07-20T01:30:26");

        //imprime objeto depois de convertido para hora GMT
        Instant exemplo6 = Instant.parse("2022-07-20T01:30:26Z");

        //imprime hora passando como referente em qual fuso está e transforma para horario GMT
        Instant exemplo7 = Instant.parse("2022-07-20T01:30:26-03:00");

        //imprime data formatada
        LocalDate exemplo8 = LocalDate.parse("20/07/2022", fmt1);

        //imprime data e hora formatada
        LocalDateTime exemplo9 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        //passando dia, mês e ano separadamente
        LocalDate exemplo10 = LocalDate.of(2022, 07, 20);

        //passando dia, mês, ano e horario separadamente
        LocalDateTime exemplo11 = LocalDateTime.of(2022, 07, 20, 1, 30);

        System.out.println("exemplo1 = " + exemplo1.toString());
        System.out.println("exemplo2 = " + exemplo2.toString());
        System.out.println("exemplo3 = " + exemplo3.toString());
        System.out.println("exemplo4 = " + exemplo4.toString());
        System.out.println("exemplo5 = " + exemplo5.toString());
        System.out.println("exemplo6 = " + exemplo6.toString());
        System.out.println("exemplo7 = " + exemplo7.toString());
        System.out.println("exemplo8 = " + exemplo8.toString());
        System.out.println("exemplo9 = " + exemplo9.toString());
        System.out.println("exemplo10 = " + exemplo10.toString());
        System.out.println("exemplo11 = " + exemplo11.toString());
    }
}