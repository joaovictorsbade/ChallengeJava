import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(in);
        //Menu
        System.out.println("Menu...");
        int opcao = Integer.parseInt(input.nextLine());

        while (true) {
            switch (opcao) {
                case 1:
                    //criar postagens
                    //GerenciarPostagem.adicionarPostagem(cpf);
                    break;
                case 2:
                    //excluir postagem
                    GerenciarPostagem.excluirPostagem();
                    break;
                case 3:

                    break;
                case 4:
                    //Editar Senha
//                    GerenciarUsuario.editarSenha(cpf);
                    break;
                case 5:
                    //Excluir conta
//                    GerenciarUsuario.excluir(cpf);
                    break;
            }
        }
    }
}
