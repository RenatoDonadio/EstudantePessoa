/**
 * Pessoa
 */
public class Pessoa {  // extends Object (superclasse em todos as classes.)

    private String nome;
    //método construtor
    public Pessoa(String nome) {
        this.nome=nome;
    }
    //método de acesso
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

//sobrescrita: polimorfismo: altera o comportamento da superclasse Pessoa
    public String toString(){
        return "Pessoa: " + nome;
    }
}