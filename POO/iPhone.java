
// Classe iPhone.java
public class iPhone implements ReprodutorMusical, Telefone, Navegador {
    @Override
    public String tocar() {
        return "Tocando música";
    }

    @Override
    public String pausar() {
        return "Pausando música";
    }

    @Override
    public String selecionarMusica() {
        return "Selecionando música";
    }

    @Override
    public String ligar() {
        return "Ligando telefone";
    }

    @Override
    public String atender() {
        return "Atendendo chamada";
    }

    @Override
    public String iniciarCorreioVoz() {
        return "Iniciando correio de voz";
    }

    @Override
    public String exibirPagina() {
        return "Exibindo página na internet";
    }

    @Override
    public String adicionarNovaAba() {
        return "Adicionando nova aba no navegador";
    }

    @Override
    public String atualizarPagina() {
        return "Atualizando página no navegador";
    }
}