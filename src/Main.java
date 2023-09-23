import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;
import iphone.Iphone;

public class Main {
    public static void main(String[] args) {
        // Criar uma instância do iPhone
        Iphone iphone = new Iphone("iPhone 13", "12345");

        // Usar o iPhone como Aparelho Telefônico
        AparelhoTelefonico telefone = iphone;
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        // Usar o iPhone como Navegador na Internet
        NavegadorInternet navegador = iphone;
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        // Usar o iPhone como Reprodutor Musical
        ReprodutorMusical reprodutor = iphone;
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica();
    }
}