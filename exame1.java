import java.util.Scanner;

class Manutenção {
    String marca;
    String processador;
    Float ram;
    float hd;
    float preco;
    float reparo;
    String importante;
    int matricula;
}

public class exame1 {
    static Scanner leitor = new Scanner(System.in);

    public static Manutenção cadastroManutenção() {
        Manutenção tecnico = new Manutenção();
        System.out.println("Qual a marca do notbook?");
        tecnico.marca = leitor.next();
        System.out.println("Qual o processador do notbook?");
        tecnico.processador = leitor.next();
        System.out.println("Quanto de ram tem o notbook?");
        tecnico.ram = leitor.nextFloat();
        System.out.println("Quanto de memoria ele tem?(HD ou SSD)");
        tecnico.hd = leitor.nextFloat();
        System.out.println("Quanto ficou os reparos totais do notbook?");
        tecnico.preco = leitor.nextFloat();
        System.out.println("Alguma informação importante sobre o notbook?");
        tecnico.importante = leitor.nextLine();
        System.out.println("Qual a matricula do notbook?");
        tecnico.matricula = leitor.nextInt();
        return tecnico;
    }

    public static void padrao(Manutenção tecnico[]) {
        int reparo;
        int matricula;
        System.out.println("Qual a matricula?");
        matricula = leitor.nextInt();
        System.out.println("Quantos reparos irá realizar no modelo padrão?");
        reparo = leitor.nextInt();
        for (int i = 0; i < tecnico.length; i++) {
            if (tecnico[i].matricula == matricula) {
                System.out.println("O valor do reparo ficou: " + reparo * (50));
                tecnico[i].preco = reparo;
                break;
            }
        }
    }

    public static void upgradeRam(Manutenção tecnico[]) {
        int matricula;
        System.out.println("Qual a matricula?");
        matricula = leitor.nextInt();
        for (int i = 0; i < tecnico.length; i++) {
            if (tecnico[i].matricula == matricula) {
                System.out.println("O total de memoria ram do computador depois do upgrade é: " + (tecnico[i].ram) * 2);
                System.out.println("O valor total do serviço de upgrade de memoria ram é: " + ((tecnico[i].ram) * 50));
                break;
            }
        }
    }

    public static void upgradeHd(Manutenção tecnico[]) {
        int matricula;
        int hd;
        System.out.println("Qual a matricula?");
        matricula = leitor.nextInt();
        System.out.println("Quanto de memoria deseja colocar?");
        hd = leitor.nextInt();
        for (int i = 0; i < tecnico.length; i++) {
            if (tecnico[i].matricula == matricula) {
                tecnico[i].hd = hd;
                System.out.println("O valor total do serviço de upgrade de HD ou SSD é: " + ((hd) / 200) * 100);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Manutenção tecnico[] = new Manutenção[5];
        int op = 0;
        while (op != 5) {
            System.out.println("Digite 1 para cadastra:");
            System.out.println("Digite 2 para calcular o reparo padrão:");
            System.out.println("Digite 3 para fazer upgrade de memoria ram:");
            System.out.println("Digite 4 para fazer upgrade de memoria HD OU SSD:");
            System.out.println("Digite 5 para sair do programa:");
            op = leitor.nextInt();
            switch (op) {
                case 1:
                    for (int i = 0; i < tecnico.length; i++) {
                        if (tecnico[i] == null) {
                            tecnico[i] = cadastroManutenção();
                            break;
                        }
                    }
                    break;
                case 2:
                    padrao(tecnico);
                    break;
                case 3:
                    upgradeRam(tecnico);
                    break;
                case 4:
                    upgradeHd(tecnico);
                    break;
                case 5:
                    System.out.println("Obrigado por usar esse programa!!");
                    break;

                default:
                    System.out.println("opção invalida!!");
                    op = 0;
                    break;
            }
        }
    }
}
