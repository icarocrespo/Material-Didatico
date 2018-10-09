/*
    Descrição da necessidade do sistema: Fazem uso deste sistema o instrutor e o gerente de treinamento da empresa. 
Os usuários devem acessar o sistema a fim de alimentar e buscar informações sobre o material didático dos treinamentos. 
O gerente de treinamento e o instrutor devem acessar o sistema (com usuário e senha). 
Somente o gerente pode criar um banco de dados (um conjunto de arquivos texto) para guardar os dados de um material didático de um determinado
treinamento e também pode cadastrar instrutores. 

    O treinamento é composto pelos seguintes dados: nome do treinamento, carga horária, número máximo de alunos, valor, data de início, data final, 
instrutor responsável, o caminho absoluto (path) do arquivo textual compactado da apostila, caminho absoluto (path) do arquivo compactado 
com slides do curso, caminho absoluto (path) arquivo compactado com uma documentação relatando o tipo de equipamento necessário para realizar o curso, 
caminho absoluto (path) do arquivo de softwares necessários, bem como o caminho absoluto (path) do procedimento de instalação dos mesmos nos 
respectivos equipamentos, caminho absoluto (path) do arquivo compactado com o setup do curso. 

    A criação e alteração de um banco de dados para um treinamento somente será feita pelo gerente (só ele pode criar/alterar). 
Já o instrutor pode acessá-lo, já que ele tem acesso para leitura dos registros no arquivo de treinamentos. 
Deve existir uma checagem automática no momento que o gerente está cadastrando um registro do treinamento para que o mesmo forneça ao menos 
o path do arquivo da apostila, path dos slides do curso, e o path dos documento de configuração do ambiente, a data de início e fim, 
o instrutor responsável e o nome do treinamento. Caso o gerente não forneça estes dados, a operação para o cadastro do treinamento 
deve ser cancelada, retornando para a tela de registro. 

    O instrutor, ao acessar o sistema, visualizará uma lista de treinamentos cadastrados cujo seu nome constar no treinamento. 
Não é permitido apresentar treinamentos que não são de propriedade de um instrutor. 

    Caso seja necessário atualizar ou alterar algum dado de um treinamento, 
o instrutor deverá solicitar ao gerente de treinamentos a alteração deste material. Assim, deve-se manter um arquivo com solicitações de alteração como: 
data da solicitação, nome do instrutor, o nome do curso cujo material didático é requisitado para alteração e o status da solicitação 
(em aberto ou resolvida). Assim, o gerente quando loga no sistema deve ter disponível um item de menu para acessar as 
solicitações com status em aberto. Uma vez que o gerente resolveu a solicitação, ele deve marcar a solicitação como resolvida no 
arquivo de solicitações. O instrutor logado deve poder listar todas as suas solicitações que estão resolvidas ou que estão em aberto.
 */
package refatorado;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import modelo.Gerente;
import modelo.Instrutor;
import modelo.Solicitacao;
import modelo.Treinamento;

public class Refatorado {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        Instrutor instrutor = new Instrutor();
        Treinamento treinamento = new Treinamento();
        Solicitacao solicitacao = new Solicitacao();

        List<Treinamento> tlista = new ArrayList();
        List<Solicitacao> slista = new ArrayList();
        List<Object> all = new ArrayList();

        Scanner x = new Scanner(System.in);
        //switch dos fulanos

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
