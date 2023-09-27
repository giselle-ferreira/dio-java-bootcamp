package pratica.set.operacoesbasicas;

import java.util.Objects;

public class Convidado {

    private String nome;
    private int codigo;

    public Convidado(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Convidado { " +
                "nome: " + nome + " | " +
                "codigo: " + codigo +
                " }\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigo() == convidado.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }
}