import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao iPhone!");

        String comando;
        boolean exibirComandos = true;
        boolean chamada = false;
        
        do {
            if (exibirComandos) {
                System.out.println("Comandos disponíveis:");

                System.out.println("ligar");
                System.out.println("1 - Tocar música");
                System.out.println("2 - Pausar música");
                System.out.println("3 - Parar música");
                System.out.println("4 - Exibir página");
                System.out.println("5 - Adicionar nova aba");
                System.out.println("6 - Atualizar página");
                System.out.println("7 - Iniciar correio de voz");
                System.out.println("8 - Atender chamada");
                System.out.println("9 - Desligar chamada");
                System.out.println("desligar");
                System.out.println();
                exibirComandos = false;
            }

            System.out.print("Digite o número do comando ou digite help para rever os comandos: ");
            comando = scanner.nextLine();

            if (!meuIPhone.verificarEstado()) {
                switch (comando) {
                    case "ligar":
                        meuIPhone.ligar();
                        break;
                }
            } else {
                switch (comando) {
                    case "desligar":
                        meuIPhone.desligar();
                        break;
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
                    if (chamada) {
                        System.out.println("Você ja esta em uma ligação. Encerre a ligação primeiro");
                        break;
                    } else {
                    meuIPhone.atender();
                    chamada = true;
                }
                    break;
                case "9":
                    meuIPhone.desligarChamada();
                    chamada = false;
                    break;
                case "help":
                    exibirComandos = true;
                    break;
                default:
                    System.out.println("Comando inválido.");
            }
        }
    } while (!comando.equals("desligar"));

        scanner.close();
    }
}