//package ExercicioImpostos;
//
//public abstract class Contribuinte {
//
//    private String nome;
//    private String morada;
//    private float outrosRendimentos;
//
//    private final String NOME_OMISSAO = "sem nome";
//    private final String MORADA_OMISSAO = "sem morada";
//    private final float OUTROS_RENDIMENTOS_OMISSAO = 0;
//
//    public Contribuinte(String nome, String morada, float outrosRendimentos) {
//        setNome(nome);
//        setMorada(morada);
//        setOutrosRendimentos(outrosRendimentos);
//    }
//
//    public Contribuinte() {
//        setNome(NOME_OMISSAO);
//        setMorada(MORADA_OMISSAO);
//        setOutrosRendimentos(OUTROS_RENDIMENTOS_OMISSAO);
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getMorada() {
//        return morada;
//    }
//
//    public void setMorada(String morada) {
//        this.morada = morada;
//    }
//
//    public float getOutrosRendimentos() {
//        return outrosRendimentos;
//    }
//
//    public void setOutrosRendimentos(float outrosRendimentos) {
//        this.outrosRendimentos = outrosRendimentos;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("Nome: %s%nMorada: %s%nOutros Rendimentos: %.2f%n", nome, morada, outrosRendimentos);
//    }
//
//    public abstract float calcularImposto();
//}
