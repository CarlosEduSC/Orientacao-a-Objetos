import java.io.*;

public class ListaPreços {
    public BufferedReader reader;
    public BufferedWriter arqGravacaoEstoque;
    public BufferedReader arqLeituraEstoque;
    public BufferedWriter arqGravacaoEntrada;
    public BufferedReader arqLeituraEntrada;
    public BufferedWriter arqGravacaoSaida;
    public BufferedReader arqLeituraSaida;
    public String arqEntrada;
    public String arqSaida;
    public String arqEstoque = "comprar.csv";
    public String m;

    public static void main(String[] args)throws Exception{
        ListaPreços lp = new ListaPreços();
        lp.reader = new BufferedReader(new InputStreamReader(System.in));
        lp.gravaçãoEntrada();
        lp.gravaçãoEstoque();
        lp.gravaçãoSaida();
        lp.menu();
        lp.arqGravacaoEntrada.close();
        lp.arqGravacaoEstoque.close();
        lp.arqGravacaoSaida.close();
    }

    public void gravaçãoEntrada() throws Exception{
        System.out.println("\nDigite o nome que deseja colocar no arquivo de entrada:");
        arqEntrada = this.reader.readLine();

        
        if (arqEntrada.equals("")) {
            arqEntrada = "custo.csv";
        } else {
            arqEntrada = arqEntrada +".csv";
        }

        arqGravacaoEntrada = new BufferedWriter(new FileWriter(arqEntrada));
        arqGravacaoEntrada.write("CODIGO;ESTOQUE;NOME;PREÇO DE CUSTO;CATEGORIA");
        arqGravacaoEntrada.newLine();
        arqGravacaoEntrada.write("001;45;Papel A4;9,9;Papelaria");
        arqGravacaoEntrada.newLine();
        arqGravacaoEntrada.write("002;666;Limpa Vidros;3,89;Limpeza");
        arqGravacaoEntrada.newLine();
        arqGravacaoEntrada.write("003;3;Caneta Bic;1,23;Papelaria");
        arqGravacaoEntrada.newLine();
        arqGravacaoEntrada.write("005;76;Envelope A4;0,6;Papelaria");
        arqGravacaoEntrada.newLine();
        arqGravacaoEntrada.write("008;1234;Balde;7,18;Limpeza");
        arqGravacaoEntrada.newLine();
        arqGravacaoEntrada.write("011;23;Cafeteira ;152,7;Eletrodoméstico");
        arqGravacaoEntrada.newLine();
        arqGravacaoEntrada.write("012;1;Televisor 42”;880;Eletrodoméstico");
        arqGravacaoEntrada.newLine();
        arqGravacaoEntrada.write("013;7;Celular Xing Ling;99,99;Eletrodoméstico");
        arqGravacaoEntrada.newLine();
        arqGravacaoEntrada.write("014;44;Grill George Foremann;122,76;Eletrodoméstico");
        arqGravacaoEntrada.newLine();

    }

    public void gravaçãoEstoque()throws Exception {
        arqGravacaoEstoque = new BufferedWriter(new FileWriter(arqEstoque));
        arqGravacaoEstoque.write("CODIGO;ESTOQUE;NOME;PREÇO DE CUSTO;CATEGORIA");
        arqGravacaoEstoque.newLine();

        arqLeituraEntrada = new BufferedReader(new FileReader(arqEntrada));
        String linha;

        while((linha = arqLeituraEntrada.readLine()) != null){
            String[] entrada = linha.split(";");

            if ((Integer.parseInt(entrada[1])) < 10) {
                arqGravacaoEstoque.write(linha);
                arqGravacaoEstoque.newLine();
                }
        }

    }

    public void gravaçãoSaida()throws Exception {
        System.out.println("\nDigite o nome que deseja colocar no arquivo de saida:");
       arqSaida = reader.readLine();
        
        System.out.println("\nDigite a margem de lucro a ser aplicada aos produtos:");
        String ml = reader.readLine();
        float margemLucro = Float.parseFloat(ml);
        
        System.out.println("\n==========//==========\n");
        
        if (arqSaida.equals("")) {
            arqSaida = "venda.csv";
        } else {
            arqSaida = arqSaida +".csv";
        }

        arqGravacaoSaida = new BufferedWriter(new FileWriter(arqSaida));
        arqGravacaoSaida.write("CODIGO;NOME;PREÇO DE VENDA");
        arqGravacaoSaida.newLine();

        String linha;

        while((linha = arqLeituraEntrada.readLine()) != null){
            String[] entrada = linha.split(";");

            float preçoVenda = (Float.parseFloat(entrada[3]))+((Float.parseFloat(entrada[3]))*(margemLucro/100));

            arqGravacaoSaida.write(entrada[0] +";"+ entrada[2] +";"+ preçoVenda);
        }

    }



    public void menu()throws Exception {

        do {

            System.out.println("\n1- Imprimir lista de preços.\n2- Verificar itens com estoque inferior a 10.\n3- Sair.\n");

            System.out.println("\nEscolha uma das opções a cima:");
            m = reader.readLine();
            int menu = Integer.parseInt(m);
            String linha;

            switch (menu) {
                case 1:
                    System.out.println("\n==========LISTA DE PREÇOS==========\n");

                    arqLeituraSaida = new BufferedReader(new FileReader(arqSaida));
                    
                    while((linha = arqLeituraSaida.readLine()) != null) {
                        System.out.println(linha);
                    }
                    
                    System.out.println("\n==========//==========\n");
                    break;

                case 2:
                    System.out.println("\n==========ESTOQUE INFERIOR A 10==========\n");

                    arqLeituraEstoque = new BufferedReader(new FileReader(arqEstoque));

                    while((linha = arqLeituraEstoque.readLine()) != null) {
                        System.out.println(linha);
                    }
                    
                    System.out.println("\n==========//==========\n");
                    break;

                case 3:
                    System.out.println("\n==========//==========\n");
                    break;

                default:
                    System.out.print("\nOpção invalida!\n");
                    System.out.println("\n==========//==========\n");
            }
        
        } while (!m.equals("4"));
    }

    
}
