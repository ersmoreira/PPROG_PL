//package ExercicioImpostos;
//
//public abstract class ContribuinteComRendimentosTrabalho extends Contribuinte {
//
//    private float rendimentoTrabalho;
//
//    private final float RENDIMENTO_TRABALHO_OMISSAO = 0;
//
//    public ContribuinteComRendimentosTrabalho(String nome, String morada, float outrosRendimentos,
//                                              float rendimentoTrabalho) {
//        super(nome, morada, outrosRendimentos);
//        setRendimentoTrabalho(rendimentoTrabalho);
//    }
//
//    public ContribuinteComRendimentosTrabalho() {
//        super();
//        setRendimentoTrabalho(RENDIMENTO_TRABALHO_OMISSAO);
//    }
//
//    public float getRendimentoTrabalho() {
//        return rendimentoTrabalho;
//    }
//
//    public void setRendimentoTrabalho(float rendimentoTrabalho) {
//        this.rendimentoTrabalho = rendimentoTrabalho;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%s%nRendimentos do trabalho: %.2f€%nTaxa Rendimentos de trabalho: %.2f%nTaxa " +
//                "Outros " + "Rendimentos: %.2f", super.toString(), getRendimentoTrabalho(), TRT(), TOR());
//    }
//
//    public float calcularImposto() {
//        return (getOutrosRendimentos() * TOR() + getRendimentoTrabalho() * TRT()) / 100;
//    }
//
//    abstract float TOR();
//
//    abstract float TRT();
//
//}
//
//
