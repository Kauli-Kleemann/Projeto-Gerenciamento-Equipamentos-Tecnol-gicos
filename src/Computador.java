public class Computador extends Hardware {
    private String genero; // Desktop ou laptop
    private String sistemaOperacional;
    private String tipo; // Gamer, escritório ou lazer

    public Computador(Fabricante fabricante, String processador, String memoria, String armazenamento, String genero, String sistemaOperacional, String tipo) {
        super(fabricante, processador, memoria, armazenamento);
        this.genero = genero;
        this.sistemaOperacional = sistemaOperacional;
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "\n\n Computador\n\n - Fabricante: " + getFabricante().getNome() +
        "\n - Processador: " + getProcessador() + "\n - Memória: " + getMemoria() +
        "\n - Armazenamento: " + getArmazenamento() + "\n - Gênero: " + getGenero() +
        "\n - Sistema Operacional: " + getSistemaOperacional() + "\n - Tipo: " + getTipo();
    }


}
