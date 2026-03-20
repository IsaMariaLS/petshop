public abstract class ServicoBase implements Servico {

    String codigo;
    String data;
    TamanhoAnimal tamanhoAnimal;

    public ServicoBase(String codigo, String data, TamanhoAnimal tamanhoAnimal) {
        this.codigo = codigo;
        this.data = data;
        this.tamanhoAnimal = tamanhoAnimal;

    }
    public String getCodigo() {
        return codigo;
    }

    public abstract double calcularPreco();



}
