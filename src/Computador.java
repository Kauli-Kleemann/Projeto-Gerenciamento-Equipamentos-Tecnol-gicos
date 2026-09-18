public class Computador extends Hardware {
    private String genero;
    private String sistemaOperacional;
    private String tipo;

    public Computador(Fabricante fabricante, String processador, String memoria, String armazenamento, String genero, String sistemaOperacional, String tipo) {
        super(fabricante, processador, memoria, armazenamento);
        this.genero = genero;
        this.sistemaOperacional = sistemaOperacional;
        this.tipo = tipo;
    }
}
