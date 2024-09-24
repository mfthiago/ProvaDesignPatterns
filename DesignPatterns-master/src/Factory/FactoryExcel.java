package Factory;

import Interfaces.iFactory;
import Interfaces.iRelatorio;
import Models.RelatorioExcel;

public class FactoryExcel implements iFactory {
    @Override
    public iRelatorio criarRelatorio() {
        return new RelatorioExcel();
    }
}
