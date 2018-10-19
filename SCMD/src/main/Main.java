package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import modelo.Acesso;
import modelo.Empregado;
import modelo.EmpregadoInformatizado;
import modelo.Empresa;
import modelo.Endereco;
import modelo.Estagiario;
import modelo.Filial;
import modelo.Gerente;
import modelo.GerenteSuporte;
import modelo.Instrutor;
import modelo.Lotacao;
import modelo.Maquina;
import modelo.PessoaFisica;
import modelo.PessoaJuridica;
import modelo.Sala;
import modelo.Sexo;
import modelo.Solicitacao;
import modelo.TipoPessoa;
import modelo.Treinamento;

public class Main {

    public static void main(String[] args) {

        List<Treinamento> tlista = new ArrayList();
        List<Solicitacao> slista = new ArrayList();
        List<Sala> salalista = new ArrayList<>();
        List<Maquina> mlista = new ArrayList<>();
        List<GerenteSuporte> gslista = new ArrayList<>();
        List<EmpregadoInformatizado> eilista = new ArrayList<>();
        List<Empresa> emplista = new ArrayList<>();
        List<Filial> flista = new ArrayList<>();
        List<Endereco> endlista = new ArrayList<>();
        List<Lotacao> llista = new ArrayList<>();
        List<Gerente> glista = new ArrayList<>();
        List<Estagiario> estlista = new ArrayList<>();
        List<Empregado> empregadolista = new ArrayList<>();
        List<Instrutor> ilista = new ArrayList<>();
        List<Object> all = new ArrayList();

        Scanner x = new Scanner(System.in);
        //switch dos fulanos
        Date aniversario = new Date("28/12/1999");
        Date admissao = new Date("10/10/2018");
        
        PessoaFisica pf1 = new PessoaFisica("5116933978", "04310670075", Sexo.MASCULINO, aniversario, admissao);
        aniversario = new Date("14/05/1994");
        admissao = new Date("08/07/1990");
        PessoaFisica pf2 = new PessoaFisica("0000", "0000-0", Sexo.FEMININO, aniversario, admissao);
        aniversario = new Date("04/04/2000");
        admissao = new Date("08/07/1996");
        PessoaFisica pf3 = new PessoaFisica("414141", "01111", Sexo.MASCULINO, aniversario, admissao);
        aniversario = new Date("04/04/2010");
        admissao = new Date("08/09/1991");
        PessoaFisica pf4 = new PessoaFisica("77777", "5555", Sexo.OUTRO, aniversario, admissao);
        aniversario = new Date("04/04/2004");
        admissao = new Date("08/07/1996");
        PessoaFisica pf5 = new PessoaFisica("323436", "908678-0", Sexo.FEMININO, aniversario, admissao);
        
        PessoaJuridica pj1 = new PessoaJuridica("01010/9", "Razao Social 1");
        PessoaJuridica pj2 = new PessoaJuridica("11010/7", "Razao Social 2");
        PessoaJuridica pj3 = new PessoaJuridica("11010/4", "Razao Social 3");
        PessoaJuridica pj4 = new PessoaJuridica("11010/7-2", "Razao Social Filial 1");
        PessoaJuridica pj5 = new PessoaJuridica("11010/4-2", "Razao Social Filial 2");

        Endereco endereco1 = new Endereco("97645-340", "Ibirapuitã", "João Pedro de Souza", 383);
        Endereco endereco2 = new Endereco("97546-000", "Ibirapuitã", "Ibicuí", 400);
        Endereco endereco3 = new Endereco("96405-610", "Tarumã", "Silva da silva", 412);

        Empresa empresa1 = new Empresa(1L, "Empresa Um", endereco1, pj1);
        Empresa empresa2 = new Empresa(2L, "Empresa Dois", endereco2, pj2);
        Empresa empresa3 = new Empresa(3L, "Universidade Federal do Pampa", endereco2, pj3);

        emplista.add(empresa1);
        emplista.add(empresa2);
        emplista.add(empresa3);

        Filial filial1 = new Filial(empresa1, pj4);
        Filial filial2 = new Filial(empresa2, pj5);

        flista.add(filial1);
        flista.add(filial1);

        Lotacao lotacao1 = new Lotacao(1L, "Departamento de Ciências Exatas e da Terra", empresa2);
        Lotacao lotacao2 = new Lotacao(2L, "Departamento de Ciências Exatas e da Natureza", empresa2);

        llista.add(lotacao1);
        llista.add(lotacao2);

        Gerente gerente1 = new Gerente("icaro", "123", "Ícaro", 1L, endereco1, 300F, pf1, empresa1, null, true, lotacao1, Acesso.GERENTE);
        Gerente gerente2 = new Gerente("nenekorin", "321", "Amanda", 2L, endereco1, 500F, pf2, empresa1, null, true, lotacao1, Acesso.GERENTE);

        glista.add(gerente1);
        glista.add(gerente2);

        Estagiario estagiario1 = new Estagiario(400F, "Fulano", 8L, endereco3, pf4);
        Estagiario estagiario2 = new Estagiario(200F, "Ciclano", 9L, endereco3, pf4);

        estlista.add(estagiario1);
        estlista.add(estagiario2);

        Instrutor instrutor1 = new Instrutor("Lau", "#@#", "Lauro", 15L, endereco3, pf3, 25F, 40, empresa3, filial2, true, lotacao2, Acesso.INSTRUTOR);
        Instrutor instrutor2 = new Instrutor("Math", "###", "Matheus", 16L, endereco3, pf5, 25F, 40, empresa3, filial2, true, lotacao2, Acesso.INSTRUTOR);

        ilista.add(instrutor1);
        ilista.add(instrutor2);

        Treinamento treinamento1 = new Treinamento(1L, "treinamento 1", "2 meses", 10, "24/08/2018", "24/10/2018",
                "", "", "", "", "", "", instrutor2);
        Treinamento treinamento2 = new Treinamento(1L, "treinamento 2", "2 meses", 40, "24/03/2018", "24/05/2018",
                "", "", "", "", "", "", instrutor2);
        Treinamento treinamento3 = new Treinamento(1L, "treinamento 3", "2 meses", 35, "24/10/2018", "24/12/2018",
                "", "", "", "", "", "", instrutor1);

        tlista.add(treinamento1);
        tlista.add(treinamento2);
        tlista.add(treinamento3);

        int opFiltro, opGeral, opCadastro, opGerenciar, controleI;
        boolean controleB = false;

        do {
            System.out.println("Bem vindo ao sistema.\n1- Gerenciar pessoal\n2- Gerenciar infraestrutura\n3- Emitir relatório.");
            opGeral = x.nextInt();

            switch (opGeral) {
                case 1:
                    do {
                        System.out.println("Você deseja:\n1- Adicionar gerente de suporte\n0- Sair");
                        opCadastro = x.nextInt();
                        switch (opCadastro) {
                            case 1:
                                PessoaFisica pessoaFisica = new PessoaFisica();
                                System.out.print("Digite o seu RG: ");
                                pessoaFisica.setRg(x.next());
                                System.out.print("Digite o seu CPF: ");
                                pessoaFisica.setCpf(x.next());

                                GerenteSuporte gerenteSuporte = new GerenteSuporte();
                                System.out.print("Digite o seu nome: ");
                                gerenteSuporte.setNome(x.next());
                                System.out.print("Digite seu login: ");
                                
                                String login = x.next();
                                boolean controleLogin = false;
                                
                                for(GerenteSuporte gs : gslista){
                                    if(gs.getLogin().equals(login)){
                                        System.out.print("Este login já está em uso.");
                                        controleLogin = true;
                                        break;
                                    }else{
                                        controleLogin = false;
                                    }
                                }
                                
                                if(!controleLogin)
                                    gerenteSuporte.setLogin(login);
                                
                                System.out.print("Ele está ativo? S/N: ");
                                if (x.next().equalsIgnoreCase("S")) {
                                    gerenteSuporte.setAtivo(true);
                                } else {
                                    gerenteSuporte.setAtivo(false);
                                }
                                System.out.print("Digite a senha: ");
                                gerenteSuporte.setSenha(x.next());
                                System.out.print("Digite o : ");
                                gerenteSuporte.setTipoPessoa(pessoaFisica);
                                gerenteSuporte.setId(15L);

                                System.out.print("Digite o ID da Empresa: ");
                                controleI = x.nextInt();
                                Empresa e = new Empresa();
                                for (Empresa empresa : emplista) {
                                    if (empresa.getId() == controleI) {
                                        gerenteSuporte.setEmpresa(empresa);
                                        controleB = true;
                                        e = empresa;
                                        break;
                                    }
                                    controleB = false;
                                }

                                if (controleB) {
                                    System.out.println("Empresa " + e.getNome() + "registrada ao gerente de suporte");
                                } else {
                                    System.out.println("Não foi possível localizar a empresa de código " + controleI);
                                }
                                controleI = 0;
                                controleB = false;

                                System.out.println("O gerente está ligado a alguma filial? S/N");
                                if (x.next().equalsIgnoreCase("S")) {
                                    controleI = x.nextInt();
                                    Filial f = new Filial();
                                    for (Filial filial : flista) {
                                        if (filial.getId() == controleI && filial.getEmpresa().getId() == gerenteSuporte.getEmpresa().getId()) {
                                            gerenteSuporte.setFilial(filial);
                                            controleB = true;
                                            f = filial;
                                            break;
                                        }
                                        controleB = false;
                                    }

                                    if (controleB) {
                                        System.out.println("Filial " + f.getNome() + "registrada ao gerente de suporte");
                                    } else {
                                        System.out.println("Não foi possível localizar a filial de código " + controleI
                                                + "pertencente a " + gerenteSuporte.getEmpresa().getId());
                                    }
                                    controleI = 0;
                                    controleB = false;

                                } else {
                                    gerenteSuporte.setFilial(null);
                                }
                                break;
                                gerenteSuporte.setAcesso(Acesso.GERENTE);
                                System.out.print("Informe a data de nascimento: ");
                                Date aniver = new Date(x.next());
                                System.out.println("Informe a data de admissão ");
                                Date admi = new Date(x.next());
                                gerenteSuporte.setAniversario(aniver);
                                gerenteSuporte.setAdmissao(admi);
                                
                            case 2:
                                int controleSwitch;
                                do {
                                    opGerenciar = x.nextInt();
                                    System.out.println("1- Gerenciar Sala\n2- Gerenciar Máquina\n0- Sair");
                                    switch (opGerenciar) {
                                        case 1:
                                            do {
                                                System.out.println("1-Cadastrar Sala\n2-Alterar registro\n3-Deletar Sala\n"
                                                        + "4-Listar Salas\n0- Sair");
                                                controleSwitch = x.nextInt();
                                                switch(controleSwitch){
                                                case 1:
                                                    Sala sala = new Sala();
                                                    System.out.println("Informe os dados abaixo.");
                                                    sala.setId(20L);
                                                    sala.setMaquinas(null);
                                                    System.out.print("Digite o nome: ");
                                                    sala.setNome(x.next());
                                                    System.out.print("Digite o número da sala: ");
                                                    sala.setNumero(x.nextInt());
                                                    salalista.add(sala);
                                                    break;
                                                }
                                            } while (controleSwitch != 0);
                                            break;

                                        case 2:
                                            do {
                                                System.out.println("1-Cadastrar Maquina\n2-Alterar Maquina\n3-Deletar Maquina\n"
                                                        + "4-Listar Maquinas\n0- Sair");
                                                controleSwitch = x.nextInt();
                                                switch(controleSwitch){
                                                case 1:
                                                    Maquina maquina = new Maquina();
                                                    System.out.println("Informe os dados abaixo.");
                                                    maquina.setNumero(20);
                                                    System.out.print("Configuração do hardware: ");
                                                    maquina.setConf_hardware(x.next());
                                                    System.out.print("Digite a quantidade: ");
                                                    maquina.setQtd(x.nextInt());
                                                    System.out.print("Digite o número da sala: ");
                                                    maquina.setNumero(x.nextInt());
                                                    System.out.println("Digite o Sistema");
                                                    maquina.setSo(x.next());
                                                    System.out.println("Digite os Softwares");
                                                    maquina.setSoftwares(x.next());
                                                    mlista.add(maquina);
                                                    break;
                                                }
                                            } while (controleSwitch != 0);
                                            break;

                                        default:

                                            break;

                                    }
                                } while (opGerenciar != 0);
                                break;
                                
                            case 3: 
                                do{
                                    System.out.println("1- GerenteSuporte\n2- Instrutor\n3- Gerente\n4- Estagiario\n0- Sair");
                                    opGerenciar = x.nextInt();
                                    
                                    switch(opGerenciar){
                                        case 1:
                                            System.out.println("Relatório:");
                                            for (GerenteSuporte gs : gslista) {
                                                gs.toString();
                                                System.out.println("");
                                            }
                                            
                                            break;
                                        
                                        case 2:
                                            System.out.println("Relatório:");
                                            for (Instrutor i : ilista) {
                                                i.toString();
                                                System.out.println("");
                                            }
                                            break;
                                        
                                        case 3:
                                            System.out.println("Relatório:");
                                            for (Gerente g : glista) {
                                                g.toString();
                                                System.out.println("");
                                            }
                                            break;
                                         
                                        case 4:
                                            System.out.println("Relatório:");
                                            for (Estagiario estagiario : estlista) {
                                                estagiario.toString();
                                                System.out.println("");
                                            }
                                            break;
                                        
                                        default:
                                            break;
                                    }
                                    
                                }while(opGerenciar != 0);
                                break;
                            default:

                                break;
                        }
                    } while (opCadastro != 0);
                    break;
                case 2:

                    break;

                default:
                    break;
            }
        } while (opGeral != 0);
    }
}
