package Models;

import Interfaces.iRelatorio;

public class RelatorioPdf implements iRelatorio {

    @Override
    public void processarRelatorio(String texto) {

        System.out.println("Relatório PDF: " + texto);
    }
}
