import java.util.ArrayList;

public class Inventario {
    ArrayList<Servico> inventario = new ArrayList<>();

    public void adicionarServico(Servico s){
        this.inventario.add(s);
    }

    public void emitirRelatorio(){
        double total = 0;
        for (Servico s : inventario){
            System.out.println("Codigo: " + s.getCodigo() + " Preco: R$ " + s.calcularPreco());
            total += s.calcularPreco();
        }
        System.out.println("Total: R$ " + total);
    }

}
