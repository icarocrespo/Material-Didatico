package refatorado;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
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
import modelo.Solicitacao;
import modelo.TipoPessoa;
import modelo.Treinamento;

public class Refatorado {

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

        List<Object> all = new ArrayList();

        Scanner x = new Scanner(System.in);
        //switch dos fulanos

        PessoaFisica pf1 = new PessoaFisica("5116933978", "04310670075");
        PessoaFisica pf2 = new PessoaFisica("0000", "0000-0");
        PessoaFisica pf3 = new PessoaFisica("414141", "01111");
        PessoaFisica pf4 = new PessoaFisica("77777", "5555");
        PessoaFisica pf5 = new PessoaFisica("323436", "908678-0");

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

        Filial filial1 = new Filial(empresa1, pj4);
        Filial filial2 = new Filial(empresa2, pj5);

        Lotacao lotacao1 = new Lotacao(1L, "Departamento de Ciências Exatas e da Terra", empresa2);
        Lotacao lotacao2 = new Lotacao(2L, "Departamento de Ciências Exatas e da Natureza", empresa2);

        Gerente gerente1 = new Gerente("icaro", "123", "Ícaro", 1L, endereco1, 300F, pf1, empresa1, null, true, lotacao1);
        Gerente gerente2 = new Gerente("nenekorin", "321", "Amanda", 2L, endereco1, 500F, pf2, empresa1, null, true, lotacao1);

        Estagiario estagiario1 = new Estagiario(400F, "Fulano", 8L, endereco3, pf4);
        Estagiario estagiario2 = new Estagiario(200F, "Ciclano", 9L, endereco3, pf4);

        Instrutor instrutor1 = new Instrutor("Lau", "#@#", "Lauro", 15L, endereco3, pf3, 25F, 40, empresa3, filial2, true, lotacao2);
        Instrutor instrutor2 = new Instrutor("Math", "###", "Matheus", 16L, endereco3, pf5, 25F, 40, empresa3, filial2, true, lotacao2);

        Treinamento treinamento1 = new Treinamento(1L, "treinamento 1", "2 meses", 10, "24/08/2018", "24/10/2018",
                "", "", "", "", "", "", instrutor2);
        Treinamento treinamento2 = new Treinamento(1L, "treinamento 2", "2 meses", 40, "24/03/2018", "24/05/2018",
                "", "", "", "", "", "", instrutor2);
        Treinamento treinamento3 = new Treinamento(1L, "treinamento 3", "2 meses", 35, "24/10/2018", "24/12/2018",
                "", "", "", "", "", "", instrutor1);

        int opFiltro, opGeral, opCadastro;

        do {
            opGeral = x.nextInt();
            System.out.println("Bem vindo ao sistema.\n1- Gerenciar pessoal\n2- Gerenciar infraestrutura.");

            switch (opGeral) {
                case 1:
                    do {
                        System.out.println("Você deseja:\n1- Adicionar gerente de suporte");
                        opCadastro = x.nextInt();
                        switch (opCadastro) {
                            case 1:

                                break;

                            case 2:

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
