package ExercicioContadoresDomesticos;

import java.util.Date;

public class BiHorario extends ContadorEletricidade {

    private int consumoHorasVazio;
    static final int CONSUMO_HORAS_VAZIO_POR_OMISSAO = 0;
    static float consumoKwHHorasVazio = 0.066f;
    static float consumoKwHHHorasForaVazio = 0.14f;

    public BiHorario() {
        super();
        this.consumoHorasVazio = CONSUMO_HORAS_VAZIO_POR_OMISSAO;
    }

    public BiHorario(int consumoHorasVazio) {
        super();
        this.consumoHorasVazio = consumoHorasVazio;
    }

    public int getConsumoHorasVazio() {
        return consumoHorasVazio;
    }

    public void setConsumoHorasVazio(int consumoHorasVazio) {
        this.consumoHorasVazio = consumoHorasVazio;
    }

    @Override
    public String toString() {
        return super.toString() + " BiHorario " + "consumoHorasVazio=" + this.consumoHorasVazio + '}';
    }

    @Override
    public float calculaCusto() {
        return getConsumoKwHHorasVazio() * getConsumoHorasVazio() + getConsumoKwHHHorasForaVazio() * getConsumo();
    }

    public static float getConsumoKwHHorasVazio() {
        return consumoKwHHorasVazio;
    }

    public static void setConsumoKwHHorasVazio(float consumoKwHHorasVazio) {
        BiHorario.consumoKwHHorasVazio = consumoKwHHorasVazio;
    }

    public static float getConsumoKwHHHorasForaVazio() {
        return consumoKwHHHorasForaVazio;
    }

    public static void setConsumoKwHHHorasForaVazio(float consumoKwHHHorasForaVazio) {
        BiHorario.consumoKwHHHorasForaVazio = consumoKwHHHorasForaVazio;
    }


}
