import java.util.ArrayList;
import java.util.List;

public class FilaEspera {
    private int count = 1;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    List<Object> veiculos = new ArrayList<>();
    void add(Object object){
        this.veiculos.add(object);
    }

    Object remove(){
        return this.veiculos.remove(0);
    }

    boolean filaIsEmpty(){
        return this.veiculos.isEmpty();
    }

    public List<Object> getVeiculos() {
        return veiculos;
    }
}
