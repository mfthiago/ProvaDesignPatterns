package Models;

import Interfaces.iRelatorio;

public class RelatorioExcel implements iRelatorio {
    @Override
    public void processarRelatorio(String texto) {
        System.out.println("Relatório Excel: " + texto);
    }
}
