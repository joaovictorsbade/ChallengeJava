import java.util.*;

import static java.lang.System.in;

public class GerenciarPostagem {

    public static List<Postagem> postagens = new ArrayList<>();

    public static void adicionarPostagem(String cpf) {

        //fazer uma array que tem os atributos titulo, dscriPost, cpf de quem postou e gerar um id para o post automaticamente dentro da array
        Scanner input = new Scanner(in);
        System.out.println("Digite o titulo:");
        String titulo = input.nextLine();

        System.out.println("Digite a descrição:");
        String dscriPost = input.nextLine();

        System.out.println("Digite um id:");
        int id = Integer.parseInt(input.nextLine());

        if (postagens.contains(id)) {
            System.out.println("Valor " + id + " já existe na lista.");
        } else {
            Postagem postagem = new Postagem(id, titulo, dscriPost, cpf);
            postagens.add(postagem);

            System.out.println("Valor " + id + " adicionado com sucesso.");
        }
    }

    public static void excluirPostagem() {
        Iterator<Postagem> iterator = postagens.iterator();
        Scanner input = new Scanner(in);

        System.out.println("Digite o id da postagem que quer excluir:");
        int id = Integer.parseInt(input.nextLine());

        while (iterator.hasNext()) {
            Postagem postagem = iterator.next();
            if (postagem.getId() == id) {
                iterator.remove();
                System.out.println("Postagem com id " + id + " foi excluído.");
                break;
            }
        }
    }

    public static void listarMinhasPostagens(String cpf) {
        for (Postagem postagem : postagens) {
            int id = postagem.getId();

            String titulo = postagem.getTitulo();
            String dscriPost = postagem.getDscriPost();

            if (postagem.getCpf().equals(cpf)) {
                System.out.printf("Postagem\n    Titulo: %s id: %d \n Descrição: %s", titulo, id, dscriPost);
            }
        }
    }

    public static void listarTodasPostagens() {
        for (Postagem postagem : postagens) {
            int id = postagem.getId();

            String titulo = postagem.getTitulo();
            String dscriPost = postagem.getDscriPost();

            System.out.printf("Postagem\n    Titulo: %s id: %d \n Descrição: %s", titulo, id, dscriPost);

        }
    }
}
