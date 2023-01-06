import java.util.Scanner;

class Transporte {
    float peso;
    float origem;
    float destino;
    int matricula;
}

public class prova {
    static Scanner leitor = new Scanner(System.in);

    public static Transporte cadastroTransporte() {
        Transporte transporte = new Transporte();
        System.out.println("Qual o peso da carga(em kg)?");
        transporte.peso = leitor.nextFloat();
        System.out.println("Qual a origem desse pacote(em km)?");
        transporte.origem = leitor.nextFloat();
        System.out.println("Qual o destino desse pacote(em km)?");
        transporte.destino = leitor.nextFloat();
        System.out.println("informa a matricula:");
        transporte.matricula = leitor.nextInt();
        return transporte;
    }

    public static void calculaValor1(Transporte transporte[]) {
        int matricula;
        System.out.println("informe a matricula do pacote:");
        matricula = leitor.nextInt();
        for (int i = 0; i < transporte.length; i++) {
            if (transporte[i].matricula == matricula) {
                if (transporte[i].peso <= 10) {
                    System.out.println((transporte[i].destino - transporte[i].origem) * (0.25));
                    break;
                }
            }
        }
    }

    public static void calculaValor2(Transporte transporte[]) {
        int matricula;
        System.out.println("informe a matricula do pacote:");
        matricula = leitor.nextInt();
        for (int i = 0; i < transporte.length; i++) {
            if (transporte[i].matricula == matricula) {
                if (transporte[i].peso > 10) {
                    System.out.println((transporte[i].destino - transporte[i].origem) * (0.45));
                    break;
                }
            }
        }
    }

    public static void calculaDistancia(Transporte transporte[]) {
        float origem;
        System.out.println("Qual a origem do pacote?");
        origem = leitor.nextFloat();
        for (int i = 0; i < transporte.length; i++) {
            System.out.println(transporte[i].origem);
        }
    }

    public static void calculaMedia(Transporte transporte[]) {
        float entrega;
        System.out.println("Quantas entregas são?");
        entrega = leitor.nextFloat();
        for (int i = 0; i < transporte.length; i++) {
            System.out.println((transporte[i].destino - transporte[i].origem) / entrega);
            break;
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Transporte transporte[] = new Transporte[100];
        int op = 0;
        while (op != 6) {
            System.out.println("Digite 1 para cadastrar:");
            System.out.println("Digite 2 para calcular o valor da entrega até 10 kg:");
            System.out.println("Digite 3 para calcular o valor da entrega que seja mais que 10 kg:");
            System.out.println("Digite 4 para saber quantas cargas tem a mesma origem:");
            System.out.println("Digite 5 para calcular a media das distancias:");
            System.out.println("Digite 6 para sair do programa:");
            op = leitor.nextInt();
            switch (op) {
                case 1:
                    for (int i = 0; i < transporte.length; i++) {
                        if (transporte[i] == null) {
                            transporte[i] = cadastroTransporte();
                            break;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < transporte.length; i++) {
                        calculaValor1(transporte);
                        break;
                    }
                    break;
                case 3:
                    for (int i = 0; i < transporte.length; i++) {
                        calculaValor2(transporte);
                        break;
                    }
                    break;
                case 4:
                    for (int i = 0; i < transporte.length; i++) {
                        calculaDistancia(transporte);
                        break;
                    }
                    break;
                case 5:
                    for (int i = 0; i < transporte.length; i++) {
                        calculaMedia(transporte);
                        break;
                    }
                    break;
                case 6:
                    System.out.println("Muito obrigado por usar este programa!!");
                    break;
                default:
                    System.out.println("opção invalida!!!");
                    break;
            }
        }
    }
}