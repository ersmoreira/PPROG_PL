//package ExercicioImpostos;
//
//public class Desempregado extends Contribuinte {
//
//    private int mesesParagem;
//    private final int MESES_PARAGEM_OMISSAO = 0;
//
//    private static int taxaOutrosRendimentos = 2;
//
//    public Desempregado(String nome, String morada, float outrosRendimentos, int mesesParagem) {
//        super(nome, morada, outrosRendimentos);
//        setMesesParagem(mesesParagem);
//    }
//
//    public int getMesesParagem() {
//        return mesesParagem;
//    }
//
//    public void setMesesParagem(int mesesParagem) {
//        this.mesesParagem = mesesParagem;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("Meses de paragem: %d%n", getMesesParagem());
//
//    }
//
//    public float calcularImposto() {
//        return getOutrosRendimentos() * (getTaxaOutrosRendimentos() / 100);
//    }
//
//    public static int getTaxaOutrosRendimentos() {
//        return taxaOutrosRendimentos;
//    }
//
//    public static void setTaxaOutrosRendimentos(int taxaOutrosRendimentos) {
//        Desempregado.taxaOutrosRendimentos = taxaOutrosRendimentos;
//    }
//}
//
