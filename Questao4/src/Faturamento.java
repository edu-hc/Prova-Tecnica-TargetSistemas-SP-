public class Faturamento {

    public static void main(String[] args) {
        
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        double totalFaturamento = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        calculaPercent(faturamentoSP, totalFaturamento);
        calculaPercent(faturamentoRJ, totalFaturamento);
        calculaPercent(faturamentoMG, totalFaturamento);
        calculaPercent(faturamentoES, totalFaturamento);
        calculaPercent(faturamentoOutros, totalFaturamento);

    }


    public static void calculaPercent(double estado, double total) {

        double percentEstado;

        percentEstado = (estado / total) * 100;

        System.out.printf("%.2f%% %n", percentEstado);

    }
}
