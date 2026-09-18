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
}