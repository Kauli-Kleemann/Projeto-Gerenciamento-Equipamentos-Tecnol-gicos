public class Fabricante {
    private String nome;
    private String site;
    private String paisOrigem;

    public Fabricante(String nome, String site, String paisOrigem) {
        this.nome = nome;
        this.site = site;
        this.paisOrigem = paisOrigem;
    }

    // Sobrecarga: construtor sem o site
    public Fabricante(String nome, String paisOrigem) {
        this.nome = nome;
        this.paisOrigem = paisOrigem;
        this.site = null; // ou poderia ser ""
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getPaisOrigem() {
        return paisOrigem;  
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

}