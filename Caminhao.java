public class Caminhao {
    private String tipoVeiculo = "CAMINHÃO";
    private String identNumber;
    private String modelo;
    private String cor;
    private String ownerName;
    private int qtdEixos;
    private int doorsNumbers;

    public Caminhao(){

    }
    public Caminhao(String identNumber, String modelo, String cor, String ownerName, int qtdEixos, int doorsNumbers) {
        this.identNumber = identNumber;
        this.modelo = modelo;
        this.cor = cor;
        this.ownerName = ownerName;
        this.qtdEixos = qtdEixos;
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

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public int getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    public int getDoorsNumbers() {
        return doorsNumbers;
    }

    public void setDoorsNumbers(int doorsNumbers) {
        this.doorsNumbers = doorsNumbers;
    }
}
