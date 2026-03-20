public class Banho extends ServicoBase{

    TamanhoPelo tamanhoPelo;

    public Banho(String codigo, String data, TamanhoAnimal tamanhoAnimal, TamanhoPelo tamanhoPelo){
        super(codigo,data, tamanhoAnimal);
        this.tamanhoPelo = tamanhoPelo;
    }

    @Override
    public double calcularPreco() {
        if (tamanhoAnimal == TamanhoAnimal.PEQUENO) {
            if (tamanhoPelo == TamanhoPelo.CURTO) {
                return 50.0;
            } else if(tamanhoPelo == TamanhoPelo.MEDIO) {
                return 65.0;
            } else {
                return 75.0;
            }

        } else if (tamanhoAnimal == TamanhoAnimal.MEDIO) {
            if (tamanhoPelo == TamanhoPelo.CURTO) {
                return 60.0;
            } else if(tamanhoPelo == TamanhoPelo.MEDIO) {
                return 75.0;
            } else {
                return 85.0;
            }
        } else{
            if (tamanhoPelo == TamanhoPelo.CURTO) {
                return 70.0;
            } else if(tamanhoPelo == TamanhoPelo.MEDIO) {
                return 85.0;
            } else {
                return 95.0;
            }
        }
    }
}
