import java.io.*;

public class RegistrarVeiculo {
    private BufferedReader reader;
    
    public static void main(String[] args) throws Exception {
        RegistrarVeiculo rv = new RegistrarVeiculo();
        rv.reader = new BufferedReader(new InputStreamReader(System.in));
        rv.menu();
    }

    public void menu() throws Exception{
        String menu;

        System.out.println("\n");
        
        do {
            System.out.println("1- Carro\n2- Moto\n3- Caminhão\n4- Onibus\n5- Van\n6- Carro eletrico\n7- Bicicleta\n8- Triciculo\n9- Sair\n");
            
            System.out.println("\nDigite o numero correspondente ao veiculo que deseja regsitrar:");
            menu = this.reader.readLine();

            System.out.println("\n==========//==========");

            switch (Integer.parseInt(menu)) {
                case 1:
                    Carro carro1 = new Carro();

                    System.out.println("\nDigite a marca do carro: ");
                    String marca = this.reader.readLine();
                    carro1.setMarca(marca);

                    System.out.println("\nDigite a cor do carro: ");
                    String cor= this.reader.readLine();
                    carro1.setCor(cor);

                    System.out.println("\nDigite o numero de portas do carro: ");
                    String portas= this.reader.readLine();
                    carro1.setPortas(Integer.parseInt(portas));

                    System.out.println("\nDigite o numero de ocupantes máximo do carro: ");
                    String ocupantes= this.reader.readLine();
                    carro1.setOcupantes(Integer.parseInt(ocupantes));

                    System.out.println("\nCarro registrado com sucesso!");
                    System.out.println("\n==========//==========\n");
                    break;

                case 2:
                    Moto moto1 = new Moto();

                    System.out.println("\nDigite a marca da moto: ");
                    marca = this.reader.readLine();
                    moto1.setMarca(marca);

                    System.out.println("\nDigite a cor da moto: ");
                    cor= this.reader.readLine();
                    moto1.setCor(cor);

                    System.out.println("\nDigite a quantidade de cilindradas que a moto possui:");
                    String cilindradas = this.reader.readLine();
                    moto1.setCilindradas(Integer.parseInt(cilindradas));

                    System.out.println("\nMoto registrada com sucesso!");
                    System.out.println("\n==========//==========\n");
                    break;
                
                case 3:
                    Caminao caminhao1 = new Caminao();

                    System.out.println("\nDigite a marca do caminhão: ");
                    marca = this.reader.readLine();
                    caminhao1.setMarca(marca);

                    System.out.println("\nDigite a cor do caminhão: ");
                    cor= this.reader.readLine();
                    caminhao1.setCor(cor);

                    System.out.println("\nDigite o tipo de caçamba do caminhão:");
                    String Tcaçamba = this.reader.readLine();
                    caminhao1.setCaçamba(Tcaçamba);

                    System.out.println("\nDigite o numero de caçambas que o caminhão possui:");
                    String Ncaçambas = this.reader.readLine();
                    caminhao1.setNCaçambas(Integer.parseInt(Ncaçambas));

                    System.out.println("\nDigite o tipo de cabine que o caminhão possui:");
                    String cabine = this.reader.readLine();
                    caminhao1.setCabine(cabine);

                    System.out.println("\nCaminhão registrado com sucesso!");
                    System.out.println("\n==========//==========\n");
                    break;

                case 4:
                    Onibus onibus1 = new Onibus();

                    System.out.println("\nDigite a marca do onibus: ");
                    marca = this.reader.readLine();
                    onibus1.setMarca(marca);

                    System.out.println("\nDigite a cor do onibus: ");
                    cor= this.reader.readLine();
                    onibus1.setCor(cor);

                    System.out.println("\nDigite o numero de entradas que o onibus possui:");
                    String entradas = this.reader.readLine();
                    onibus1.setEntradas(Integer.parseInt(entradas));

                    System.out.println("\nDigite o numero maximo de passageiros do onibus:");
                    String passageiros = this.reader.readLine();
                    onibus1.setPassageiros(Integer.parseInt(passageiros));

                    System.out.println("\nDigite a finalidade para qual o onibus sera usado:");
                    String finalidade = this.reader.readLine();
                    onibus1.setFinalidade(finalidade);

                    System.out.println("\nOnibus registrado com sucesso!");
                    System.out.println("\n==========//==========\n");
                    break;

                case 5:
                    Van van1 = new Van();

                    System.out.println("\nDigite a marca da van: ");
                    marca = this.reader.readLine();
                    van1.setMarca(marca);

                    System.out.println("\nDigite a cor da van: ");
                    cor= this.reader.readLine();
                    van1.setCor(cor);

                    System.out.println("\nDigite o numero de assentos que a van possui:");
                    String assentos = this.reader.readLine();
                    van1.setAssentos(Integer.parseInt(assentos));

                    System.out.println("\nDigite o peso maximo que a van pode carregar:");
                    String peso = this.reader.readLine();
                    van1.setPesoMaximo(Float.parseFloat(peso));

                    System.out.println("\nVan registrada com sucesso!");
                    System.out.println("\n==========//==========\n");
                    break;

                case 6:
                    CarroEletrico carro2 = new CarroEletrico();

                    System.out.println("\nDigite a marca do carro: ");
                    marca = this.reader.readLine();
                    carro2.setMarca(marca);

                    System.out.println("\nDigite a cor do carro: ");
                    cor= this.reader.readLine();
                    carro2.setCor(cor);

                    System.out.println("\nDigite o numero de portas do carro: ");
                    portas= this.reader.readLine();
                    carro2.setPortas(Integer.parseInt(portas));

                    System.out.println("\nDigite o numero de ocupantes máximo do carro: ");
                    ocupantes= this.reader.readLine();
                    carro2.setOcupantes(Integer.parseInt(ocupantes));

                    System.out.println("\nDigite a voltagem da bateria do carro:");
                    String voltagem = this.reader.readLine();
                    carro2.setVoltagemBateria(Float.parseFloat(voltagem));

                    System.out.println("\nDigite o tempo de duração da bateria:");
                    String tempo = this.reader.readLine();
                    carro2.setHorasBateria(Float.parseFloat(tempo));

                    System.out.println("\nCarro eletrico registrado com sucesso!");
                    System.out.println("\n==========//==========\n");
                    break;

                case 7:
                    Bicicleta bicicleta1 = new Bicicleta();

                    System.out.println("\nDigite a marca da bicicleta: ");
                    marca = this.reader.readLine();
                    bicicleta1.setMarca(marca);

                    System.out.println("\nDigite a cor da bicicleta: ");
                    cor= this.reader.readLine();
                    bicicleta1.setCor(cor);

                    System.out.println("\nDigite a numeração do aro da bicicleta:");
                    String aro = this.reader.readLine();
                    bicicleta1.setAro(Integer.parseInt(aro));

                    System.out.println("\nA bicicleta é de uso infantil ou adulto?");
                    String usoBicicleta = this.reader.readLine();
                    bicicleta1.setAdultoInfantil(usoBicicleta);

                    System.out.println("\nBicicleta registrada com sucesso!");
                    System.out.println("\n==========//==========\n");
                    break;

                case 8:
                    Triciculo triciculo1 = new Triciculo();

                    System.out.println("\nDigite a marca do triciluco: ");
                    marca = this.reader.readLine();
                    triciculo1.setMarca(marca);

                    System.out.println("\nDigite a cor do triciculo: ");
                    cor= this.reader.readLine();
                    triciculo1.setCor(cor);

                    System.out.println("\nDigite a numeração do aro do triciculo:");
                    aro = this.reader.readLine();
                    triciculo1.setAro(Integer.parseInt(aro));

                    System.out.println("\nO triciculo é de uso infantil ou adulto?");
                    String usoTriciculo = this.reader.readLine();
                    triciculo1.setAdultoInfantil(usoTriciculo);

                    System.out.println("\nDigite o tipo de assento que o triciculo possui:");
                    String banco = this.reader.readLine();
                    triciculo1.setTipoBanco(banco);

                    System.out.println("\nDigite a cor do banco do triciculo:");
                    String corB = this.reader.readLine();
                    triciculo1.setCorBanco(corB);

                    System.out.println("\nTriciculo registrado com sucesso!");
                    System.out.println("\n==========//==========\n");
                    break;

                case 9:
                    break;

                default:
                    System.out.println("\nO numero digitado não corresponde a nenhum dos veiculos!");
                    System.out.println("\n==========//==========\n");
            }
        } while ((Integer.parseInt(menu)) != 9);
    }

}
