public class Tosa extends ServicoBase {

    public Tosa(String codigo, String data, TamanhoAnimal tamanhoAnimal) {
        super(codigo, data, tamanhoAnimal);

    }
    @Override
    public double calcularPreco() {
        if (tamanhoAnimal == TamanhoAnimal.PEQUENO) {
            return 30.0;
        } else if (tamanhoAnimal == TamanhoAnimal.MEDIO) {
            return 40.0;
        } else {
            return 50.0;
        }

    }

}

