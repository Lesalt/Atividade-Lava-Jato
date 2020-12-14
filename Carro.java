public class Carro {
    private String tipoVeiculo = "CARRO";
    private String identNumber;
    private String modelo;
    private String cor;
    private String ownerName;
    private int doorsNumbers;

    public Carro(){

    }
    public Carro(String identNumber, String modelo, String cor, String ownerName, int doorsNumbers) {
        this.identNumber = identNumber;
        this.modelo = modelo;
        this.cor = cor;
        this.ownerName = ownerName;
        this.doorsNumbers = doorsNumbers;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public String getIdentNumber() {
        return identNumber;
    }

    public void setIdentNumber(String identNumber) {
        this.identNumber = identNumber;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getDoorsNumbers() {
        return doorsNumbers;
    }

    public void setDoorsNumbers(int doorsNumbers) {
        this.doorsNumbers = doorsNumbers;
    }
}
