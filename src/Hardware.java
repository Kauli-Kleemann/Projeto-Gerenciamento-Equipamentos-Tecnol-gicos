public abstract class Hardware {
    private Fabricante fabricante;
    private String processador;
    private String memoria;
    private String armazenamento;

    public Hardware(Fabricante fabricante, String processador, String memoria, String armazenamento) {
        this.fabricante = fabricante;
        this.processador = processador;
        this.memoria = memoria;
        this.armazenamento = armazenamento;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    

}
