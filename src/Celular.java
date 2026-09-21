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

    public int getNumeroCameras() {
        return numeroCameras;
    }

    public void setNumeroCameras(int numeroCameras) {
        this.numeroCameras = numeroCameras;
    }

    public float getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(float tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String toString() {
        return "\n\n Celular\n\n - Fabricante: " + getFabricante().getNome() +
        "\n - Processador: " + getProcessador() + "\n - Memória: " + getMemoria() +
        "\n - Armazenamento: " + getArmazenamento() + "\n - Número de Câmeras: " + getNumeroCameras() +
        "\n - Sistema Operacional: " + getSistemaOperacional() + "\n - Tamanho da Tela: " + getTamanhoTela() + 
        "\n - Tipo da Tela: " + getTipoTela();
    }

}