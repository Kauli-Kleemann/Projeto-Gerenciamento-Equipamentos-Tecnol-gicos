public class Videogame extends Hardware {
    private String versao; // Fat ou Slim
    private boolean sensorMovimento; // Se possui suporte a sensor de movimento
    private boolean leitorDisco; // Se possui leitor de disco

    public Videogame(Fabricante fabricante, String processador, String memoria, String armazenamento, String versao, boolean sensorMovimento, boolean leitorDisco) {
        super(fabricante, processador, memoria, armazenamento);
        this.versao = versao;
        this.sensorMovimento = sensorMovimento;
        this.leitorDisco = leitorDisco;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public boolean isSensorMovimento() {
        return sensorMovimento;
    }

    public void setSensorMovimento(boolean sensorMovimento) {
        this.sensorMovimento = sensorMovimento;
    }

    public boolean isLeitorDisco() {
        return leitorDisco;
    }

    public void setLeitorDisco(boolean leitorDisco) {
        this.leitorDisco = leitorDisco;
    }

    public String toString() {
        return "\n\n Videogame\n\n - Fabricante: " + getFabricante().getNome() +
        "\n - Processador: " + getProcessador() + "\n - Memória: " + getMemoria() +
        "\n - Armazenamento: " + getArmazenamento() + "\n - Versão: " + getVersao() +
        "\n - Suporte a Sensor de Movimento: " + isSensorMovimento() + 
        "\n - Possui Leitor de Disco: " + isLeitorDisco();
    }

}