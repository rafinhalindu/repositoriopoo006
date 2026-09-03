public class TesteLivroDeNotas{
    public static void main(String [] args){
        //*de referência --> LivroDeNotas
        LivroDeNotas livroDeNotas = new LivroDeNotas("POO"); //bloco de criacao de objeto 
        livroDeNotas.setNomeDaDisciplina("POO");
        livroDeNotas.exibirMensagem();
        LivroDeNotas livroDeNotas2 = new LivroDeNotas("PAOO");
        livroDeNotas.setNomeDaDisciplina("PAOO");
        livroDeNotas.exibirMensagem();

        //Esse livro é de: POO
        System.out.printf("Esse livro é de: %s\n", livroDeNotas.getNomeDaDisciplina());
        //Esse livro é de: PAOO
        System.out.printf("Esse livro é de: %s\n", livroDeNotas2.getNomeDaDisciplina());
    }
}