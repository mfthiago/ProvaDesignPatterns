package Factory;

import Interfaces.iFactory;
import Interfaces.iRelatorio;
import Models.RelatorioCsv;

public class FactoryCsv implements iFactory {
    @Override
    public iRelatorio criarRelatorio() {
        return new RelatorioCsv();
    }
}
