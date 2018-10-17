package refatorado;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import modelo.EmpregadoInformatizado;
import modelo.Empresa;
import modelo.Endereco;
import modelo.Filial;
import modelo.Gerente;
import modelo.GerenteSuporte;
import modelo.Instrutor;
import modelo.Maquina;
import modelo.PessoaFisica;
import modelo.PessoaJuridica;
import modelo.Sala;
import modelo.Solicitacao;
import modelo.TipoPessoa;
import modelo.Treinamento;

public class Refatorado {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        Instrutor instrutor = new Instrutor();
        Treinamento treinamento = new Treinamento();
        Solicitacao solicitacao = new Solicitacao();
        Sala sala = new Sala();
        Maquina maquina = new Maquina();
        GerenteSuporte gerenteSuporte = new GerenteSuporte();
        EmpregadoInformatizado empregadoInformatizado = new EmpregadoInformatizado();
        Empresa empresa = new Empresa();
        Filial filial = new Filial();
        Endereco endereco = new Endereco();
        
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
        
        PessoaJuridica pj = new PessoaJuridica();
        PessoaFisica pf = new PessoaFisica();
        
        TipoPessoa tp = new PessoaFisica();
        
        tp.
        Endereco endereco1 = new Endereco("97645-340", "Ibirapuitã", "João Pedro de Souza", 383);
        Endereco endereco2 = new Endereco("97546-000", "Ibirapuitã", "Ibicuí", 400);
        
        Empresa empresa1 = new Empresa(1, "Empresa Um", endereco1, tipoPessoa1);
        Empresa empresa2 = new Empresa(2, "Empresa Dois", endereco2, tipoPessoa2);
        
        Filial filial1 = new Filial(tipoPessoa);
        Filial filial2 = new Filial();
        Gerente gerente1 = new Gerente("icaro", "123", "Ícaro", 1, endereco1, Float.NaN, tipoPessoa, empresa1, null, true, lotacao);
        
        System.out.println("1- Cadastrar Intrutor\n2- Resolver Solicitações\n3- Listar Instrutores\n0- Sair");
        Random random = new Random();
        instrutor = new Instrutor();

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
