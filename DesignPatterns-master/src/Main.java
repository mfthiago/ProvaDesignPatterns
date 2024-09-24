import Factory.FactoryCsv;
import Factory.FactoryExcel;
import Factory.FactoryPdf;
import Services.RelatorioService;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        RelatorioService service = new RelatorioService();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o texto do relatório: ");
        String textoRelatorio = scanner.nextLine();

        System.out.println("Informe o formato do relatório:\n[1] - PDF\n[2] - CSV" +
                "\n[3] - Excel");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                service.enviarRelatorio(new FactoryPdf(), textoRelatorio);
                break;
            case 2:
                service.enviarRelatorio(new FactoryCsv(), textoRelatorio);
                break;
                case 3:
                service.enviarRelatorio(new FactoryExcel(), textoRelatorio);
            default:
                System.out.println("Formato de relatório inválido");

        }

    }
}