public class Celular extends Hardware {
    private int numeroCameras;
    private float tamanhoTela; // Em polegadas
    private String tipoTela;
    private String sistemaOperacional;

    public Celular(Fabricante fabricante, String processador, String memoria, String armazenamento, int numeroCameras, float tamanhoTela, String tipoTela, String sistemaOperacional) {
        super(fabricante, processador, memoria, armazenamento);
        this.numeroCameras = numeroCameras;
        this.tamanhoTela = tamanhoTela;
        this.tipoTela = tipoTela;
        this.sistemaOperacional = sistemaOperacional;
    }
}