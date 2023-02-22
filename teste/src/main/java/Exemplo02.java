class Pessoa {

    private String nome;

    public Pessoa(){}

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

class Funcionario extends Pessoa {

    private String cpf;

    public Funcionario(String nome) {
        super(nome);
    }

    public Funcionario(){}

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

public class Exemplo02 {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("joao");
        p.setNome("joao");
        Funcionario f = new Funcionario();
        f.setCpf("123");
        System.out.println(f.getCpf());
        System.out.println(f.getNome());
    }
}
