import java.util.Scanner;
class Locadora{
    String titulo;
    String ator;
    float duracao;
    float valor;
    int matricula;
    @Override
    public String toString() {
        return "titulo do filme:"+titulo+" Ator(a) principal:"+ator+" Duração do filme:"+duracao+" Valor do aluguel:"+valor+" matricula:"+matricula;
    }
}
public class provasegundo {
    static Scanner leitor = new Scanner(System.in);

    public static Locadora cadastLocadora(){
        Locadora filme = new Locadora();
        System.out.println("Qual o titulo do filme");
        filme.titulo=leitor.next();
        System.out.println("Qual o ator(a) principal?");
        filme.ator=leitor.next();
        System.out.println("Qual a duração do filme(em minutos)?");
        filme.duracao=leitor.nextFloat();
        System.out.println("Qual o valor do aluguel do filme?");
        filme.valor=leitor.nextFloat();
        System.out.println("Qual a matricula ?");
        filme.matricula=leitor.nextInt();
        return filme;
    }

    public static void exibir(Locadora filme []){
        int matricula;
        System.out.println("Qual a matricula do aluguel?");
        matricula=leitor.nextInt();
        for (int i = 0; i < filme.length; i++) {
            if (filme[i].matricula==matricula) {
                System.out.println(filme[i].toString());
            }
        }
    }

    public static void exibirVetor(Locadora filme []){
        for (int i = 0; i < filme.length; i++) {
            System.out.println(filme[i]);
        }
    }

    public static void escolha(Locadora filme []){
        int escolha;
        System.out.println("qual filme quer da lista?(escolha na ordem de cima para baixo de 0 a 99)");
        escolha=leitor.nextInt();
       System.out.println(filme[escolha]);
    }

    public static void soma(Locadora filme []){
        
    }

    

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Locadora filme[]= new Locadora [100];
        int op=0;
        while (op!=6) {
            System.out.println("Digite 1 para cadastrar:");
            System.out.println("Digite 2 para exibir algum aluguel em especifico:");
            System.out.println("Digite 3 para ver a listar de filmes que podem ser alugados:");
            System.out.println("Digite 4 para escolher os filmes da lista:");
            op=leitor.nextInt();
            switch (op) {
                case 1:
                    for (int i = 0; i < filme.length; i++) {
                        if (filme[i]==null) {
                            filme[i]=cadastLocadora();
                            break;
                        }
                    }
                    break;
                    case 2:
                    exibir(filme);
                    break;
                    case 3:
                    exibirVetor(filme);
                    break;
                    case 4:
                    escolha(filme);
                    break;
                default:
                System.out.println("Opção invalida!!");
                op=0;
                    break;
            }
        }
    }
}
