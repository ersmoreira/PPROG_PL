package PL01B.ExData;


import java.util.Calendar;

public class MainData {

    public static void main(String[] args) {

        Calendar hoje = Calendar.getInstance();

        // a) Crie uma instância da classe Data com o nome data1 e que represente a data de hoje.
        Data data1 = new Data(Calendar.YEAR, Calendar.MONTH + 1, Calendar.DAY_OF_MONTH);

        // b) Mostre data1 usando o formato por extenso
        System.out.println(data1.toString());

        //c) Crie uma outra instância da classe Data chamada data2 que guarde a data 25 de abril de 1974.
        Data data2 = new Data(1974, 4, 25);

        // d) Mostre data2 no formato "ano/mês/dia".
        System.out.println(data2.toAnoMesDiaString());

        // e) Utilize o método de instância isMaior para confirmar que, de facto, data1 é mais recente do que data2.
        System.out.println(data1.isMaior(data2) ? "Data1 é maior" : "Data2 é maior");

        // f) Determine o número de dias entre data1 e data2.
        System.out.printf("Nº dias entre data1 e data2 : %d", data1.calcularDiferenca(data2));

        //g) Determine o número de dias que faltam para o Natal, usando o método que recebe, por
        //parâmetro, o dia, o mês e o ano de uma data.
        int anoNatal = (Calendar.MONTH == 12 && Calendar.DAY_OF_MONTH > 25) ? Calendar.YEAR +1 : Calendar.YEAR;
        System.out.printf("Número de dias para o Natal: %d", data1.calcularDiferenca(anoNatal, 12, 24));

        //h) Determine o dia da semana em que ocorreu o dia 25 de abril de 1974.
        Data data3 = new Data(25, 4, 1974);
        System.out.printf("25 de abril de 1974: %s", data3.determinarDiaDaSemana());

        //i) Verifique se o ano 1974 foi bissexto, invocando o método de classe isAnoBissexto:
        // Através do objeto data2;
        // Através da classe Data.
        System.out.printf("Ano 1974 bissexto: %s", Data.isAnoBissexto(1974) ? "Sim" : "Não");
    }

}
