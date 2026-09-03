public class Carro {
    // Atributos encapsulados
    private String marca;
    private int velocidade;

    // Métodos
    public void acelerar() {
        velocidade += 10;
    }

    public void frear() {
        if (velocidade >= 10) {
            velocidade -= 10;
        } else {
            velocidade = 0;
        }
    }

    // Getter e Setter da marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter e Setter da velocidade
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}