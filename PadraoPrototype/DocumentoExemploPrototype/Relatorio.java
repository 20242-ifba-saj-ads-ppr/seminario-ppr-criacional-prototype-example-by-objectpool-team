package DocumentoExemploPrototype;

public class Relatorio extends Documento {
    private String autor;

    public Relatorio(String titulo, String conteudo, String autor) {
        super(titulo, conteudo);
        this.autor = autor;
    }

    @Override
    public Relatorio clone() {
        Relatorio clone = (Relatorio) super.clone();
        clone.autor = this.autor;
        return clone;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Relatório:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Conteúdo: " + getConteudo());
        System.out.println("Autor: " + autor);
        System.out.println();
    }
}