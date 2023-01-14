package br.com.ad.crud.view;

import br.com.ad.crud.controller.CidadeController;
import br.com.ad.crud.model.Cidade;

import java.util.*;

public class CidadeView {

    private CidadeController controller;
    private Scanner scanner;

    public CidadeView(CidadeController controller, Scanner scanner){
        this.controller = controller;
        this.scanner = scanner;
    }

    public void cadastrar(){
        Cidade cidade = new Cidade();

        System.out.print("Informe o nome da cidade: ");
        String nome = scanner.nextLine();
        cidade.setNome(nome);

        System.out.print("Informe o nome do estado da cidade: ");
        String estado = scanner.nextLine();
        cidade.setEstado(estado);

        controller.cadastrar(cidade);
    }

    public void exibirOpcoes() {

        System.out.println("Infome a opção desejada:");
        System.out.println("1 - Cadastrar");
        System.out.println("0 - Sair");

        Integer opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                cadastrar();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Opção invalida!");
        }
        exibirOpcoes();
    }
}
