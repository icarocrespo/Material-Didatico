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

        Instrutor instrutor1 = new Instrutor("Lau", "#@#", "Lauro", 15L, endereco3, pf5, 25F, 40, empresa3, filial2, true, lotacao2);
        Instrutor instrutor2 = new Instrutor("Math", "###", "Matheus", 16L, endereco3, pf6, 25F, 40, empresa3, filial2, true, lotacao2);

        System.out.println("Bem vindo.\n1- Cadastrar Intrutor\n2- Resolver Solicitações\n3- Listar Instrutores\n0- Sair");
        Random random = new Random();

        System.out.println("Para cadastrar um novo instrutor, informe as informações abaixo:");
        instrutor.setId(random.nextLong());

        System.out.print("Nome: ");
        instrutor.setNome("Ícaro");
        instrutor.setLogin("icaro");
        instrutor.setSenha("123");

        System.out.println("Solicitações em aberto:");
        for (Solicitacao obj : slista) {
            System.out.println("ID: " + obj.getId() + " | Instrutor: " + obj.getInstrutor().getNome()
                    + " | Nome: " + obj.getTreiinamento().getNome()
                    + " | Data: " + obj.getData() + " | Status: " + obj.getStatus());
        }
        do {
            System.out.println("Informe a Id da solicitacao que deseja alterar.");

            if (solicitacao != null) {
                solicitacao.setStatus(true);
            }

            if (instrutor.getId() != null) {
                System.out.println("\nBem-vindo " + instrutor.getNome());
                do {
                    System.out.println("1- Listar treinamento\n2- Listar treinamento ordenado crescente por Id\n"
                            + "3- Listar treinamento ordenado decrescente por Id\n4- Listar treinamento ordenado crescente por Data\n"
                            + "5- Listar treinamento ordenado decrescente por Data\n6- Adicionar Treinamento\n"
                            + "7- Solicitar alteração\n0- Sair");

                    if (tlista.isEmpty()) {
                        System.out.println("Você não possui treinamentos cadastrados.");
                    } else {
                        System.out.println("Seus Treinamentos cadastrados:");
                        for (Treinamento obj : tlista) {
                            System.out.println("ID: " + obj.getId() + " | Instrutor: " + obj.getInstrutor_nome()
                                    + " | Nome: " + obj.getNome() + " | Duração: " + obj.getDuracao() + " | Início: " + obj.getInicio()
                                    + " | Fim: " + obj.getFim() + " | Número de alunos:" + obj.getNum_alunos()
                                    + " | Path apostila: " + obj.getPath_apostila() + " | Path slides: " + obj.getPath_slides()
                                    + " | Path equipamentos necessários: " + obj.getPath_equipNecessario() + " | Path instalação: "
                                    + obj.getPath_instalacao() + " | Path setup: " + obj.getPath_setup() + " | Path softwares: "
                                    + obj.getPath_softwares());
                        }
                    }
                    System.out.println("Treinamento ordenado crescente por Id:");
                    for (Treinamento obj : tlista) {
                        System.out.println("ID: " + obj.getId() + " | Instrutor: " + obj.getInstrutor_nome()
                                + " | Nome: " + obj.getNome() + " | Duração: " + obj.getDuracao() + " | Início: " + obj.getInicio()
                                + " | Fim: " + obj.getFim() + " | Número de alunos:" + obj.getNum_alunos()
                                + " | Path apostila: " + obj.getPath_apostila() + " | Path slides: " + obj.getPath_slides()
                                + " | Path equipamentos necessários: " + obj.getPath_equipNecessario() + " | Path instalação: "
                                + obj.getPath_instalacao() + " | Path setup: " + obj.getPath_setup() + " | Path softwares: "
                                + obj.getPath_softwares());
                    }
                    break;
                }
                                                
            
          
            
          case 3: {
                                                    System.out.println("Treinamento ordenado decrescente por Id:");
                                                    for (Treinamento obj : tlista) {
                                                        System.out.println("ID: " + obj.getId() + " | Instrutor: " + obj.getInstrutor_nome()
                                                                + " | Nome: " + obj.getNome() + " | Duração: " + obj.getDuracao() + " | Início: " + obj.getInicio()
                                                                + " | Fim: " + obj.getFim() + " | Número de alunos:" + obj.getNum_alunos()
                                                                + " | Path apostila: " + obj.getPath_apostila() + " | Path slides: " + obj.getPath_slides()
                                                                + " | Path equipamentos necessários: " + obj.getPath_equipNecessario() + " | Path instalação: "
                                                                + obj.getPath_instalacao() + " | Path setup: " + obj.getPath_setup() + " | Path softwares: "
                                                                + obj.getPath_softwares());
                                                    }
                                                    break;
                                                }
                                                case 4: {
                                                    System.out.println("Treinamento ordenado crescente por Data:");
                                                    for (Treinamento obj : tlista) {
                                                        System.out.println("ID: " + obj.getId() + " | Instrutor: " + obj.getInstrutor_nome()
                                                                + " | Nome: " + obj.getNome() + " | Duração: " + obj.getDuracao() + " | Início: " + obj.getInicio()
                                                                + " | Fim: " + obj.getFim() + " | Número de alunos:" + obj.getNum_alunos()
                                                                + " | Path apostila: " + obj.getPath_apostila() + " | Path slides: " + obj.getPath_slides()
                                                                + " | Path equipamentos necessários: " + obj.getPath_equipNecessario() + " | Path instalação: "
                                                                + obj.getPath_instalacao() + " | Path setup: " + obj.getPath_setup() + " | Path softwares: "
                                                                + obj.getPath_softwares());
                                                    }
                                                    break;
                                                }
                                                case 5: {
                                                    System.out.println("Treinamento ordenado decrescente por Data:");
                                                    for (Treinamento obj : tlista) {
                                                        System.out.println("ID: " + obj.getId() + " | Instrutor: " + obj.getInstrutor_nome()
                                                                + " | Nome: " + obj.getNome() + " | Duração: " + obj.getDuracao() + " | Início: " + obj.getInicio()
                                                                + " | Fim: " + obj.getFim() + " | Número de alunos:" + obj.getNum_alunos()
                                                                + " | Path apostila: " + obj.getPath_apostila() + " | Path slides: " + obj.getPath_slides()
                                                                + " | Path equipamentos necessários: " + obj.getPath_equipNecessario() + " | Path instalação: "
                                                                + obj.getPath_instalacao() + " | Path setup: " + obj.getPath_setup() + " | Path softwares: "
                                                                + obj.getPath_softwares());
                                                    }
                                                    break;
                                                }
                                                case 6: {
                                                    Random random = new Random();
                                                    treinamento = new Treinamento();
                                                    System.out.println("Para cadastrar novo treinamento informe as informações abaixo:");
                                                    System.out.println("Para datas, utilize o modelo dd-MM-aaaa. Para a duração utilize um número "
                                                            + "seguido da sua unidade. Ex.: 4h.");

                                                    treinamento.setId(random.nextLong());
                                                    System.out.println("Nome:");
                                                    treinamento.setNome(x.next());
                                                    System.out.println("Duração:");
                                                    treinamento.setDuracao(x.next());
                                                    System.out.println("Início:");
                                                    treinamento.setInicio(x.next());
                                                    System.out.println("Fim:");
                                                    treinamento.setFim(x.next());
                                                    System.out.println("Número de alunos:");
                                                    treinamento.setNum_alunos(x.nextInt());
                                                    treinamento.setInstrutor_nome(instrutor.getNome());
                                                    System.out.println("Path apostila:");
                                                    treinamento.setPath_apostila(x.next());
                                                    System.out.println("Path equipamentos:");
                                                    treinamento.setPath_equipNecessario(x.next());
                                                    System.out.println("Path instalação:");
                                                    treinamento.setPath_instalacao(x.next());
                                                    System.out.println("Path setup:");
                                                    treinamento.setPath_setup(x.next());
                                                    System.out.println("Path slides:");
                                                    treinamento.setPath_slides(x.next());
                                                    System.out.println("Path softwares:");
                                                    treinamento.setPath_softwares(x.next());

                                                    break;
                                                }
                                                case 7: {
                                                    int cont_solicitacao = 700;
                                                    do {
                                                            for (Treinamento obj : tlista) {
                                                                if (obj.getInstrutor_nome().equals(instrutor.getNome())) {
                                                                    System.out.println("ID: " + obj.getId() + " | Instrutor: " + obj.getInstrutor_nome()
                                                                            + " | Nome: " + obj.getNome() + " | Duração: " + obj.getDuracao() + " | Início: " + obj.getInicio()
                                                                            + " | Fim: " + obj.getFim() + " | Número de alunos:" + obj.getNum_alunos()
                                                                            + " | Path apostila: " + obj.getPath_apostila() + " | Path slides: " + obj.getPath_slides()
                                                                            + " | Path equipamentos necessários: " + obj.getPath_equipNecessario() + " | Path instalação: "
                                                                            + obj.getPath_instalacao() + " | Path setup: " + obj.getPath_setup() + " | Path softwares: "
                                                                            + obj.getPath_softwares());
                                                                    //obj.toString();
                                                                }
                                                            }
                                                            do {
                                                                System.out.println("Digite o ID que desejas alterar.\nDigite 0 para sair.");
                                                                cont_solicitacao = x.nextInt();
                                                                if (cont_solicitacao == 0) {
                                                                    break;
                                                                } else {
                                                                    Random random = new Random();
                                                                    ok = false;
                                                                    for (Treinamento obj : tlista) {
                                                                        if (cont_solicitacao == obj.getId()) {
                                                                            solicitacao = new Solicitacao();
                                                                            Date data = new Date();
                                                                            data.setMonth(9);
                                                                            data.setYear(2018);

                                                                            solicitacao.setId(random.nextLong());
                                                                            solicitacao.setInstrutor(instrutor);
                                                                            solicitacao.setTreinamento(obj);
                                                                            solicitacao.setStatus(false);
                                                                            solicitacao.setData(data);
                                                                        }
                                                                    }
                                                                }
                                                            } while (cont_solicitacao != 0);
                                                        }

                                                    } while (cont_solicitacao != 0);
                                                    break;
                                                }
                                                default: {
                                                    break;
                                                }
                                            }
                                        
    
    }
    while (opI 

!= 0);
                                    } else {
                                        System.out.println("Instrutor não encontrado.");
                                    }
                                }
                                break;
                            }
                            default: {
                                break;
                            }
                        }

                    } while (op2 != 0);
                    break;
                }
                default: {
                    break;
                }
            }
        } while (op != 0);
        System.out.println("Parabéns! Tu saístes do sistema.");
    }
}
