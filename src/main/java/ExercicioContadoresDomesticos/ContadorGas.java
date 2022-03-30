package ExercicioContadoresDomesticos;

public class ContadorGas extends Contador{

    static final String PREFIXO_CONTADOR_GAS = "GAS-";
    static float custoM3 = 0.8f;
    static int totalContadoresGas = 0;

    public ContadorGas() {
        super();
        totalContadoresGas++;
    }

    public ContadorGas(String identificador, String cliente, float consumo) {
        super(identificador, cliente, consumo);
        totalContadoresGas++;
    }

    @Override
    public String toString() {
        return "ContadorGas - " + super.toString();
    }

    @Override
    public float calculaCusto() {
        return super.getConsumo() * custoM3;
    }

    public static float getCustoM3() {
        return custoM3;
    }

    public static int getTotalContadoresGas() {
        return totalContadoresGas;
    }

    public static void setCustoM3(float custoM3) {
        ContadorGas.custoM3 = custoM3;
    }

}
