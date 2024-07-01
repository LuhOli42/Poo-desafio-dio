import funcoes.aparelhoTelefonico.Telefone;
import funcoes.navegadorNaInternet.Browser;
import funcoes.reprodutorMusical.MP3;

public class Iphone implements MP3, Telefone, Browser {

  @Override
  public void exibirPagina(String url) {
    // TODO Auto-generated method stub
    System.out.println("Abrindo a página " + url);
  }

  @Override
  public void adicionarNovaAba() {
    // TODO Auto-generated method stub
    System.out.println("Nova aba aberta");
  }

  @Override
  public void atualizarPagina() {
    // TODO Auto-generated method stub
    System.out.println("Pagina atualizada");
  }

  @Override
  public void ligar(String numero) {
    // TODO Auto-generated method stub

    System.out.println("Ligando para o numero:  " + numero);
  }

  @Override
  public void atender() {
    // TODO Auto-generated method stub
    System.out.println("Atendendo telefone");
  }

  @Override
  public void iniciarCorreioVoz() {
    // TODO Auto-generated method stub
    System.out.println("Iniciando correio de voz");
  }

  @Override
  public void tocar() {
    // TODO Auto-generated method stub
    System.out.println("Tocando musica");
  }

  @Override
  public void pausar() {
    // TODO Auto-generated method stub
    System.out.println("Pausando musica");
  }

  @Override
  public void selecionarMusica(String musica) {
    // TODO Auto-generated method stub
    System.out.println("Selecionando musica: " + musica);
  }
}
