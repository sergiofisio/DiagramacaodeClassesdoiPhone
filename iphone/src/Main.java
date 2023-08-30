import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao iPhone!");
        meuIPhone.ligar();

        String comando;
        
        do {
            System.out.println("Comandos disponíveis:");
            System.out.println("1 - Tocar música");
            System.out.println("2 - Pausar música");
            System.out.println("3 - Parar música");
            System.out.println("4 - Exibir página");
            System.out.println("5 - Adicionar nova aba");
            System.out.println("6 - Atualizar página");
            System.out.println("7 - Iniciar correio de voz");
            System.out.println("8 - Atender chamada");
            System.out.println("9 - Desligar");
            System.out.print("Digite o número do comando: ");
            comando = scanner.nextLine();

            switch (comando) {
                case "1":
                    if (meuIPhone.getMúsicaAtual() == null) {
                        System.out.print("Digite o nome da música: ");
                        String nomeMusica = scanner.nextLine();
                        meuIPhone.selecionarMusica(nomeMusica);
                    }
                    meuIPhone.tocar();
                    break;
                case "2":
                    if (meuIPhone.getMúsicaAtual() == null) {
                        System.out.println("Nenhuma música selecionada para pausar.");
                    } else {
                        meuIPhone.pausar();
                    }
                    break;
                case "3":
                    meuIPhone.parar();
                    break;
                case "4":
                    System.out.print("Digite o URL do site: ");
                    String urlSite = scanner.nextLine();
                    meuIPhone.exibirPagina(urlSite);
                    break;
                case "5":
                    System.out.print("Digite o URL do site a ser adicionado: ");
                    String urlNovaAba = scanner.nextLine();
                    meuIPhone.adicionarNovaAba(urlNovaAba);
                    break;
                case "6":
                    meuIPhone.atualizarPagina();
                    break;
                case "7":
                    meuIPhone.iniciarCorreioVoz();
                    break;
                case "8":
                    meuIPhone.atender();
                    break;
                case "9":
                    meuIPhone.desligar();
                    break;
                default:
                    System.out.println("Comando inválido.");
            }
        } while (!comando.equals("9"));

        scanner.close();
    }
}