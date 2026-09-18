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

}
