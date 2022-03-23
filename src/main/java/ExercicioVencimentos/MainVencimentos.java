package ExercicioVencimentos;

public class MainVencimentos {

    public static void main(String[] args) {

        TrabalhadorPeca t1 = new TrabalhadorPeca("Jorge Silva", 53, 62);
        TrabalhadorComissao t2 = new TrabalhadorComissao("Susana Ferreira", 650, 2731.50f, 4.25f);
        TrabalhadorHora t3 = new TrabalhadorHora("Carlos Miguel", 168, 4.50f);

        Trabalhador[] contentor = new Trabalhador[10];
        contentor[0] = t1;
        contentor[1] = t2;
        contentor[2] = t3;

        System.out.println("-----------------------------------------------------");
        System.out.println("Listagem das representações textuais dos trabalhadores");
        for (int i = 0; i < contentor.length; i++) {
            if (contentor[i] != null) {
                System.out.println(" ####");
                System.out.println(contentor[i]);
            }
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Listagem das representações textuais apenas dos trabalhadores à hora");
        for (int i = 0; i < contentor.length; i++) {
            if (contentor[i] instanceof TrabalhadorHora) {
                System.out.println(" ####");
                System.out.println(contentor[i]);
            }
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("Listagem dos nomes dos trabalhadores existentes, acompanhadas dos respetivos " +
                "vencimentos");
        for (int i = 0; i < contentor.length; i++) {
            if (contentor[i] != null) {
                System.out.println(" ####");
                System.out.printf("Nome: %s%nVencimento: %.2f €%n-----------------%n", contentor[i].getNome(),
                        contentor[i].calcularVencimento());
            }
        }

    }
}
