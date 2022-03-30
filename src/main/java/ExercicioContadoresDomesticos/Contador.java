package ExercicioContadoresDomesticos;

public abstract class Contador {

    private String identificador;
    private String cliente;
    private float consumo;

    static final String IDENTIFICADOR_POR_OMISSAO = "sem identificador";
    static final String CLIENTE_POR_OMISSAO = "sem cliente";
    static final float CONSUMO_POR_OMISSAO = 0.0f;

    public Contador() {
        this.identificador = IDENTIFICADOR_POR_OMISSAO;
        this.cliente = CLIENTE_POR_OMISSAO;
        this.consumo = CONSUMO_POR_OMISSAO;
    }

    public Contador(String identificador, String cliente, float consumo) {
        this.identificador = identificador;
        this.cliente = cliente;
        this.consumo = consumo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "Contador{" + "identificador='" + identificador + '\'' + ", cliente='" + cliente + '\'' + ", consumo=" + consumo + '}';
    }

    public abstract float calculaCusto();
}
