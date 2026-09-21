public class App {
    public static void main(String[] args) throws Exception {
        
        Fabricante Dell = new Fabricante("Dell", "https://www.dell.com", "Estados Unidos");
        Computador AlienwareAurora = new Computador(Dell, "Intel Core Ultra 9 285K", "32 GB - DDR5", "SSD M.2 1 TB", "Desktop", "Windows 11", "Gamer");

        System.out.println(AlienwareAurora);

        Fabricante Apple = new Fabricante("Apple", "https://apple.com", "Estados Unidos");
        Celular iPhone17 = new Celular(Apple, "Apple A19", "8 GB", "256 GB", 3, 6.3f, "Super Retina XDR OLED", "iOS 27");

        System.out.println(iPhone17);

        Fabricante Microsoft = new Fabricante("Microsoft", "https://microsoft.com", "Estados Unidos");
        Videogame XBOX360 = new Videogame(Microsoft, "IBM PowerPC", "512 MB GDDR3", "500 GB", "Slim", true, true);

        System.out.println(XBOX360);
    }
}
