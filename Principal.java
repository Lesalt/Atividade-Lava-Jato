import java.util.*;

public class Principal {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        FilaEspera filaEspera = new FilaEspera();
        FilaLavados filaLavados = new FilaLavados();
        int question = Integer.MIN_VALUE;
        Carro carroResp;
        Moto motoResp;
        Caminhao caminhaoResp;
        Object obj;
        String identNumber;
        String modelo;
        String cor;
        String ownerName;
        int doorsNumber;
        int qtdEixos;
        FilaEspera filaEsperaAux;
        while(question != 0){
            System.out.println("LAVA JATO:\n1) Lavar Carro.\n2) Lavar Moto\n3) Lavar Caminhão\n4) Imprimir lista de espera.\n5) Imprimir Veículos Lavados.");
            question = Integer.parseInt(read.nextLine());
            switch (question){
                case(1):
                    System.out.println("Informe o numero de identificação do veículo: ");
                    identNumber = read.nextLine();
                    System.out.println("Informe o modelo do veiculo: ");
                    modelo = read.nextLine();
                    System.out.println("Informe a cor do veículo: ");
                    cor = read.nextLine();
                    System.out.println("Informe o nome do proprietario: ");
                    ownerName = read.nextLine();
                    System.out.println("Infome o numero de portas: ");
                    doorsNumber = Integer.parseInt(read.nextLine());
                    Carro carro = new Carro(identNumber, modelo, cor, ownerName, doorsNumber);
                    if(filaEspera.getCount() < 3){
                        filaEspera.setCount(filaEspera.getCount() + 1);
                        filaEspera.add(carro);
                    }else{
                        filaEspera.add(carro);
                        filaLavados.add(filaEspera.remove());
                        filaEspera.setCount(1);
                    }
                    break;

                case(2):
                    System.out.println("Informe o numero de identificação do veículo: ");
                    identNumber = read.nextLine();
                    System.out.println("Informe o modelo do veiculo: ");
                    modelo = read.nextLine();
                    System.out.println("Informe a cor do veículo: ");
                    cor = read.nextLine();
                    System.out.println("Informe o nome do proprietario: ");
                    ownerName = read.nextLine();
                    Moto moto = new Moto(identNumber,modelo, cor, ownerName);
                    if(filaEspera.getCount() < 3){
                        filaEspera.setCount(filaEspera.getCount() + 1);
                        filaEspera.add(moto);
                    }else{
                        filaEspera.add(moto);
                        filaLavados.add(filaEspera.remove());
                        filaEspera.setCount(1);
                    }
                    break;

                case(3):
                    System.out.println("Informe o numero de identificação do veículo: ");
                    identNumber = read.nextLine();
                    System.out.println("Informe o modelo do veiculo: ");
                    modelo = read.nextLine();
                    System.out.println("Informe a cor do veículo: ");
                    cor = read.nextLine();
                    System.out.println("Informe o nome do proprietario: ");
                    ownerName = read.nextLine();
                    System.out.println("Informe a quantidade de eixos do caminhão: ");
                    qtdEixos = Integer.parseInt(read.nextLine());
                    System.out.println("Infome o numero de portas: ");
                    doorsNumber = Integer.parseInt(read.nextLine());
                    Caminhao caminhao = new Caminhao(identNumber, modelo, cor, ownerName, qtdEixos, doorsNumber);
                    if(filaEspera.getCount() < 3){
                        filaEspera.setCount(filaEspera.getCount() + 1);
                        filaEspera.add(caminhao);
                    }else{
                        filaEspera.add(caminhao);
                        filaLavados.add(filaEspera.remove());
                        filaEspera.setCount(1);
                    }
                    break;

                case(4):
                    filaEsperaAux =  filaEspera;
                    System.out.println("---FILA DE ESPERA DE VEÍCULOS PARA SEREM LAVADOS---");
                    while (!filaEsperaAux.filaIsEmpty()){
                        obj = filaEsperaAux.remove();
                        if(obj instanceof Carro) {
                            carroResp = (Carro) obj;
                            System.out.println("\n*Tipo de Veiculo: " + carroResp.getTipoVeiculo() + "\n*Numero de Identificaçaõ: "+ carroResp.getIdentNumber() + "\n*Modelo: " + carroResp.getModelo() + "\n*Cor: " + carroResp.getCor() + "\n*Dono: " + carroResp.getOwnerName() + "\n*STATUS: EM ESPERA*\n======");
                        }else if(obj instanceof Moto){
                            motoResp = (Moto) obj;
                            System.out.println("\n*Tipo de Veiculo: " + motoResp.getTipoVeiculo() + "\n*Numero de Identificaçaõ: "+ motoResp.getIdentNumber() + "\n*Modelo: " + motoResp.getModelo() + "\n*Cor: " + motoResp.getCor() + "\n*Dono: " + motoResp.getOwnerName() + "\n*STATUS: EM ESPERA*\n======");
                        }else if(obj instanceof Caminhao){
                            caminhaoResp = (Caminhao) obj;
                            System.out.println("\n*Tipo de Veiculo: " + caminhaoResp.getTipoVeiculo() + "\n*Numero de Identificaçaõ: "+ caminhaoResp.getIdentNumber() + "\n*Modelo: " + caminhaoResp.getModelo() + "\n*Cor: " + caminhaoResp.getCor() + "\n*Dono: " + caminhaoResp.getOwnerName() + "\n*STATUS: EM ESPERA*\n======");
                        }
                    }
                    break;

                case(5):
                    FilaLavados filaLavadosAux = filaLavados;

                    System.out.println("---FILA DE VEÍCULOS JÁ LAVADOS--- ");
                    while(!filaLavadosAux.filaIsEmpty()){
                        obj = filaLavadosAux.remove();
                        if(obj instanceof Carro) {
                            carroResp = (Carro) obj;
                            System.out.println("\n*Tipo de Veiculo: " + carroResp.getTipoVeiculo() + "\n*Numero de Identificaçaõ: "+ carroResp.getIdentNumber() + "\n*Modelo: " + carroResp.getModelo() + "\n*Cor: " + carroResp.getCor() + "\n*Dono: " + carroResp.getOwnerName() + "\n*STATUS: LAVADO*\n======");
                        }else if(obj instanceof Moto){
                            motoResp = (Moto) obj;
                            System.out.println("\n*Tipo de Veiculo: " + motoResp.getTipoVeiculo() + "\n*Numero de Identificaçaõ: "+ motoResp.getIdentNumber() + "\n*Modelo: " + motoResp.getModelo() + "\n*Cor: " + motoResp.getCor() + "\n*Dono: " + motoResp.getOwnerName() + "\n*STATUS: LAVADO*\n======");
                        }else if(obj instanceof Caminhao){
                            caminhaoResp = (Caminhao) obj;
                            System.out.println("\n*Tipo de Veiculo: " + caminhaoResp.getTipoVeiculo() + "\n*Numero de Identificaçaõ: "+ caminhaoResp.getIdentNumber() + "\n*Modelo: " + caminhaoResp.getModelo() + "\n*Cor: " + caminhaoResp.getCor() + "\n*Dono: " + caminhaoResp.getOwnerName() + "\n*STATUS: LAVADO*\n======");
                        }
                    }
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente...");
                    break;

            }
        }


    }
}
