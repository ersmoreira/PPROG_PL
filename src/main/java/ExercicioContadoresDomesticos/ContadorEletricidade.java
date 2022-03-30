package ExercicioContadoresDomesticos;

public abstract class ContadorEletricidade extends Contador {

    static final String PREFIXO_CONTADOR_ELECTRICIDADE = "ELECT-";
    static int totalContadoresElectricidade = 0;

    public ContadorEletricidade() {
        super();
        totalContadoresElectricidade++;
    }

    public ContadorEletricidade(String identificador, String cliente, float consumo) {
        super(identificador, cliente, consumo);
        totalContadoresElectricidade++;
    }

    public static int getTotalContadoresElectricidade() {
        return totalContadoresElectricidade;
    }

}
