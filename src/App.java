public class App {
    public static void main(String[] args) throws Exception {
        
        Fabricante dell = new Fabricante("Dell", "https://www.dell.com", "Estados Unidos");
        Computador alienwareAurora = new Computador(dell, "Intel Core Ultra 9 285K", "32 GB - DDR5", "SSD M.2 1 TB", "Desktop", "Windows 11", "Gamer");

        System.out.println(alienwareAurora);

        Fabricante apple = new Fabricante("Apple", "https://apple.com", "Estados Unidos");
        Celular iPhone17 = new Celular(apple, "Apple A19", "8 GB", "256 GB", 3, 6.3f, "Super Retina XDR OLED", "iOS 27");

        System.out.println(iPhone17);

        Fabricante microsoft = new Fabricante("Microsoft", "https://microsoft.com", "Estados Unidos");
        Videogame xbox360 = new Videogame(microsoft, "IBM PowerPC", "512 MB GDDR3", "500 GB", "Slim", true, true);

        System.out.println(xbox360);

        Fabricante sony = new Fabricante("Sony", "Japão");
        System.out.println("\n\n Chamando impressão do site com o construtor sem o atributo site (valor nulo):");
        System.out.println(sony.getSite());
    }
}
