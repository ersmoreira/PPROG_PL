package ExercicioContadoresDomesticos;

public class TarifarioSimples extends ContadorEletricidade {

    private float potencia;
    static float custoKwH1 = 0.13f;
    static float custoKwH2 = 0.16f;
    static float limite = 6.9f;
    static final float POTENCIA_POR_OMISSAO = 0.0f;

    public TarifarioSimples() {
        super();
        this.potencia = POTENCIA_POR_OMISSAO;
    }

    public TarifarioSimples(String identificador, String cliente, float consumo, float potencia) {
        super(identificador, cliente, consumo);
        this.potencia = potencia;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return super.toString() + " TarifarioSimples " + "potencia=" + getPotencia() + '}';
    }

    @Override
    public float calculaCusto() {
        return determinaCustoKwH() * getConsumo();
    }

    private float determinaCustoKwH() {
        return (getPotencia() <= getLimite()) ? getCustoKwH1() : getCustoKwH2();
    }

    public static float getCustoKwH1() {
        return custoKwH1;
    }

    public static void setCustoKwH1(float custoKwH1) {
        TarifarioSimples.custoKwH1 = custoKwH1;
    }

    public static float getCustoKwH2() {
        return custoKwH2;
    }

    public static void setCustoKwH2(float custoKwH2) {
        TarifarioSimples.custoKwH2 = custoKwH2;
    }

    public static float getLimite() {
        return limite;
    }

    public static void setLimite(float limite) {
        TarifarioSimples.limite = limite;
    }
}
