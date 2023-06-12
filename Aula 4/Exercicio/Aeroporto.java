import java.io.*;

public class Aeroporto {
    private CompanhiaAéria ca1;
    private BufferedReader reader;

    public static void main(String[] args) throws Exception {
        Aeroporto a1 = new Aeroporto();
        a1.ca1 = new CompanhiaAéria();
        a1.reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nDigite o nome da companhia aèria:");
        a1.ca1.setNomeCom(a1.reader.readLine());

        System.out.println("\nDigite o telefone da companhia aeria:");
        a1.ca1.setTelefone(a1.reader.readLine());

        a1.menu();
    }

    public void menu() throws Exception {
        String menu;

        do {
            System.out.println("\n1- Cadastrar vôo.\n2- Listar vôos.\n3- Listar passageiros de um determinado vôo.\n4- Exibir a quantidade de assentos livres em um determinado vôo.\n5- Sair.");

            System.out.println("\nEscolha uma das opcoes a cima:");
            menu = this.reader.readLine();

            System.out.println("\n==========//==========");

            switch (Integer.parseInt(menu)) {

                case 1:
                    this.cadastrarVôo();
                    break;

                case 2:
                    this.listarVôos();
                    break;

                case 3:
                    this.listarPassageiros();
                    break;

                case 4:
                    this.assentosLivres();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("\nOpcão invalida!\n");
                    System.out.println("\n==========//==========");
            }
        } while ((Integer.parseInt(menu)) != 5);
    }

    public void cadastrarVôo()throws Exception {
        int cont = 0;
        int voos = 0;
        String menu;
        Vôo v1 = new Vôo();

        System.out.print("\nDigite o numero do vôo:");
        v1.setNumVoo(Integer.parseInt(this.reader.readLine()));

        System.out.println("\nDigite o nome do piloto:");
        v1.setPiloto(this.reader.readLine());

        System.out.println("\nDigite o numero total de assentos do vôo:");
        v1.setNumAssentos(Integer.parseInt(this.reader.readLine()));

        do {
            System.out.println("\n1- Cadastrar passageiro.\n2- Sair.");
            System.out.println("\nEscolha uma das opcoes a cima:");
            menu = this.reader.readLine();

            System.out.println("\n==========//==========");

            switch (Integer.parseInt(menu)) {

                case 1:
                    Passageiro p1 = new Passageiro();

                    System.out.println("\nDigite o nome do passageiro:");
                    p1.setNome(this.reader.readLine());

                    System.out.println("\nDigite o numero do assento do passageiro:");
                    p1.setAssento(Integer.parseInt(this.reader.readLine()));

                    System.out.println("\nDigite o CPF do passageiro:");
                    p1.setCPF(Integer.parseInt(this.reader.readLine()));

                    System.out.println("\nDigite o RG do passagiro:");
                    p1.setRG(Integer.parseInt(this.reader.readLine()));

                    if (cont == v1.getNumAssentos())
                        System.out.println("\nVôo cheio!");

                    else {
                        cont = cont+1;
                        v1.setNumPassageiros(cont);
                    }

                    System.out.println("\nPassageiro registrado com sucesso!");
                    System.out.println("\n==========//==========");
                    break;

                case 2:
                    break;

                default:
                System.out.println("\nOpcão invalida!\n");
                System.out.println("\n==========//==========");
            }
        } while ((Integer.parseInt(menu)) != 2);

        voos = voos+1;
        ca1.setNumVôos(voos);
        ca1.setVôo(voos, v1);
    }

    public void listarVôos()throws Exception {
        int i,j;
        System.out.println("\n==========VÔOS==========\n");

        for (i=0;i < (ca1.getNumVôos());i++) {

            System.out.println("\n"+ i+1 +"° Vôo:\n");

            System.out.println("\nNumero do vôo:" + ca1.getVôo(i).getNumVoo());

            System.out.println("\nNome do piloto:" + ca1.getVôo(i).getPiloto());

            System.out.println("\nNumero total de assentos:"+ ca1.getVôo(i).getNumAssentos());

            System.out.println("\nNumero de passageiros:"+ ca1.getVôo(i).getNumPassageiros());

            System.out.println("\n==========INFORMAÇÕES DOS PASSAGEIROS==========\n");

            for (j=0;j < (ca1.getVôo(i).getNumPassageiros());j++) {

                System.out.println("\nNome do "+ i +"° passageiro: "+ ca1.getVôo(i).getPassageiro(j).getNome());

                System.out.println("\nRG do "+ i +"° passageiro: "+ ca1.getVôo(i).getPassageiro(j).getRG());

                System.out.println("\nCPF do "+ i +"° passageiro: "+ ca1.getVôo(i).getPassageiro(j).getCPF());

                System.out.println("\nNumero do assento do "+ i +"° passageiro: "+ ca1.getVôo(i).getPassageiro(j).getAssento());

                System.out.println("\n==========//==========\n");
            }
        }
    }

    public void listarPassageiros()throws Exception {
        int i,j;

        System.out.println("\nDigite o numero do voo que deseja listar os passageiros:");
        String voo = this.reader.readLine();

        System.out.println("\nEsse vôo possui "+ ca1.getVôo(Integer.parseInt(voo)).getNumPassageiros() +" passageiros!");

        for(i=0;i < (ca1.getVôo(Integer.parseInt(voo)).getNumPassageiros());i++) {

            System.out.println("\n==========INFORMAÇÕES DOS PASSAGEIROS==========\n");

            for (j=0;j < (ca1.getVôo(i).getNumPassageiros());j++) {

                System.out.println("\nNome do "+ i +"° passageiro: "+ ca1.getVôo(i).getPassageiro(j).getNome());

                System.out.println("\nRG do "+ i +"° passageiro: "+ ca1.getVôo(i).getPassageiro(j).getRG());

                System.out.println("\nCPF do "+ i +"° passageiro: "+ ca1.getVôo(i).getPassageiro(j).getCPF());

                System.out.println("\nNumero do assento do "+ i +"° passageiro: "+ ca1.getVôo(i).getPassageiro(j).getAssento());

                System.out.println("\n==========//==========\n");
            }
        }
    }

    public void assentosLivres()throws Exception {

        System.out.println("\nDigite o numero do voo que deseja concultar os assentos livres:");
        String voo = this.reader.readLine();

        System.out.println("\nEsse vôo possui "+ ((ca1.getVôo(Integer.parseInt(voo)).getNumAssentos())-(ca1.getVôo(Integer.parseInt(voo)).getNumPassageiros())) +" assentos livres!");
    }
}