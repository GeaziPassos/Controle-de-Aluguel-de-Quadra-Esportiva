package classes;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Aluguel {

    Cliente cliente;
    Set<HorarioAlugado> horariosAlugados = new HashSet<>();
    BigDecimal valorToral;
    boolean statusPagamento;
}
