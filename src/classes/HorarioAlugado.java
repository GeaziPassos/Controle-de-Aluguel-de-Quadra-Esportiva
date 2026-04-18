package classes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class HorarioAlugado {

    public HorarioAlugado(int dia, int mes, int ano, int hora, int minuto, int segundo){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = minuto;
    }

    int dia;
    int mes;
    int ano;
    int hora;
    int minuto;
    int segundo;

    LocalDateTime horarioAlugado = LocalDateTime.of(ano, mes, dia, hora, minuto, segundo);
    BigDecimal valorAluguel;
}