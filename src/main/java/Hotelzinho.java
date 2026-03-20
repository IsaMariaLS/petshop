public class Hotelzinho extends ServicoBase {
    private final int quantHoras;
    public Hotelzinho(String codigo, String data, TamanhoAnimal tamanhoAnimal, int quantHoras) {
        super(codigo, data, tamanhoAnimal);
        this.quantHoras = quantHoras;
    }


    @Override
    public double calcularPreco() {
            if (tamanhoAnimal == TamanhoAnimal.PEQUENO) {
                return quantHoras * 12.0;
            } else if (tamanhoAnimal == TamanhoAnimal.MEDIO) {
                return quantHoras * 18.0;
            } else {
                return quantHoras * 25.0;
            }
        }


}
