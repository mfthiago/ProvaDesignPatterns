package Services;

import Interfaces.iFactory;
import Interfaces.iRelatorio;

public class RelatorioService {
    public void enviarRelatorio(iFactory factory, String texto){
        iRelatorio relatorio = factory.criarRelatorio();
        relatorio.processarRelatorio(texto);
    }
}
