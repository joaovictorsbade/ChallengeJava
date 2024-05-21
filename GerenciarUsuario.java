import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class GerenciarUsuario {

    public static List<Usuario> usuarios = new ArrayList<>();

    public static void cadastroUsuario() {
        Scanner input = new Scanner(in);
        System.out.println("Digite o nome do usuário:");
        String nome = input.nextLine();

        System.out.println("Digite o CPF do usuário:");
        String cpf = input.nextLine();

        System.out.println("Digite o email do usuário:");
        String email = input.nextLine();

        System.out.println("Digite a senha do usuário:");
        String senha = input.nextLine();

        System.out.println("Digite a senha novamente:");
        String senha2 = input.nextLine();

        //Verificar senha
        if (senha == senha2 || !senha.isEmpty() || !nome.isEmpty() || !cpf.isEmpty() || !email.isEmpty()) {
            //Adicionar o objeto a array
            Usuario usuario = new Usuario(nome, cpf, email, senha);
            usuarios.add(usuario);

            System.out.println("Usuário adicionado com sucesso");
        } else {
            System.out.println("Informações incorretas");
        }

    }

    public static void listarUsuario() {
        for (Usuario usuario : usuarios) {
            System.out.println("Nome: " + usuario.getNome() + " | Cpf: " + usuario.getCpf() + " | Email: " + usuario.getEmail());
        }
    }

    public static String login() {
        Scanner input = new Scanner(in);

        System.out.println("------LOGIN------\n Digite o email:");
        String email = input.nextLine();

        System.out.println("Digite a senha:");
        String senha = input.nextLine();

        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                System.out.println("O Login foi concluído");
                return usuario.getCpf();
            } else {
                System.out.println("Informações incorretas");
            }
        }

        return null;
    }

    public static void editarSenha(String cpf) {
        Scanner input = new Scanner(in);

        for (Usuario usuario : usuarios) {
            if (usuario.getCpf().equals(cpf)) {

                System.out.println("Digite sua nova senha:");
                String novaSenha = input.nextLine();

                usuario.setSenha(novaSenha);
                System.out.println("Senha alterada com sucesso para usuario com cpf: " + cpf);
                break;
            }
        }
    }

    public static void excluir(String cpf) {
        Iterator<Usuario> iterator = usuarios.iterator();

        while (iterator.hasNext()) {
            Usuario usuario = iterator.next();
            if (usuario.getCpf().equals(cpf)) {
                iterator.remove();
                System.out.println("Usuário com CPF " + cpf + " foi excluído.");
                break;
            }
        }
    }
}

//System.out.println(array.get(0);
//System.out.println(array.get(array.size() -1);
