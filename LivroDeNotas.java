//alta coesão
//somente uma responsabilidade
//somente um propósito na vida
//uma única razão de ser

public class LivroDeNotas{ //private oculta a classe
private String nomeDaDisciplina;

public LivroDeNotas(String nomeDaDisciplina){
    setNomeDaDisciplina(nomeDaDisciplina);
}

//setter
public void setNomeDaDisciplina(String nomeDaDisciplina){ //todo esse bloco existe para indicar o que está 
    if(nomeDaDisciplina.length() >= 3)
    this.nomeDaDisciplina = nomeDaDisciplina;            //em nomeDaDisciplina por que a 'String' está 'private', método setter
} // this. operador de auto-referência

//getter
public String getNomeDaDisciplina(){
    return nomeDaDisciplina;
}

    public void exibirMensagem(){
        System.out.printf("Bem vindo ao livro de notas de %s\n", nomeDaDisciplina);
    }
}