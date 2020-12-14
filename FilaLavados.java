import java.util.ArrayList;
import java.util.List;

public class FilaLavados {

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
}
