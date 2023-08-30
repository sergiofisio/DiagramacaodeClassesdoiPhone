import java.util.ArrayList;
import java.util.List;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String músicaAtual;
    private boolean estáLigado;
    private List<String> páginasAbertas;

    public iPhone() {
        páginasAbertas = new ArrayList<>();
        estáLigado = false;
    }

    public boolean verificarEstado() {
        if (!estáLigado) {
            System.out.println("O iPhone está desligado. Ligue-o primeiro.");
            return false;
        }
        return true;
    }

    public String getMúsicaAtual() {
        return músicaAtual;
    }

    public void tocar() {
        if (!estáLigado) {
            System.out.println(" iPhone desligado.");
        } else if (músicaAtual != null) {
            System.out.println("Tocando música: " + músicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void parar() {
        músicaAtual = null;
        System.out.println("Música parada.");
    }

    public void selecionarMusica(String musica) {
        músicaAtual = musica;

        System.out.println("Música selecionada: " + músicaAtual);
    }

    public void ligar() {
        estáLigado = true;
        System.out.println("iPhone ligado.");
    }

    public void atender() {
        if (estáLigado) {
            System.out.println("Chamada atendida.");
        } else {
            System.out.println("O iPhone está desligado. Não é possível atender a chamada.");
        }
    }

    public void iniciarCorreioVoz() {
        if (estáLigado) {
            System.out.println("Correio de voz iniciado.");
        } else {
            System.out.println("O iPhone está desligado. Não é possível iniciar o correio de voz.");
        }
    }

    public void desligarChamada() {

        System.out.println("Chamada terminada");

    }
    public void desligar() {
        
            System.out.println("iPhone desligado");
        
    }



    public void exibirPagina(String url) {
        if (estáLigado) {
            System.out.println("Exibindo página: " + url);
            páginasAbertas.add(url);
        } else {
            System.out.println("O iPhone está desligado. Não é possível exibir a página.");
        }
    }

    public void adicionarNovaAba(String url) {
        if (estáLigado) {
            System.out.println("Nova aba adicionada com a página: " + url);
            páginasAbertas.add(url);
        } else {
            System.out.println("O iPhone está desligado. Não é possível adicionar nova aba.");
        }
    }

    public void atualizarPagina() {
        if (estáLigado && !páginasAbertas.isEmpty()) {
            System.out.println("Página atualizada: " + páginasAbertas.get(páginasAbertas.size() - 1));
        } else if (!estáLigado) {
            System.out.println("O iPhone está desligado. Não é possível atualizar a página.");
        } else {
            System.out.println("Nenhuma página aberta para atualizar.");
        }
    }
}
