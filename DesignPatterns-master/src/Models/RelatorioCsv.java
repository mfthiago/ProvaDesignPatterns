package Models;

import Interfaces.iRelatorio;

public class RelatorioCsv implements iRelatorio {

    @Override
    public void processarRelatorio(String texto) {
        System.out.println("Relatório CSV: " + texto);
    }
}
