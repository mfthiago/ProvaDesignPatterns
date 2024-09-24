package Factory;

import Interfaces.iFactory;
import Interfaces.iRelatorio;
import Models.RelatorioPdf;

public class FactoryPdf implements iFactory {
    @Override
    public iRelatorio criarRelatorio() {
        return new RelatorioPdf();
    }
}
