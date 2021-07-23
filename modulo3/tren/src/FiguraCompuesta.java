import java.util.ArrayList;
import java.util.List;

public class FiguraCompuesta extends Figura{
    private ArrayList <Figura> figuras;

    public FiguraCompuesta() {
        this.figuras = new ArrayList<Figura>();
    }

    @Override
    public double calcularArea() {
        double areaTotal = 0;
        for (Figura figura : figuras) {
            areaTotal += figura.calcularArea();
        }
        return areaTotal;
    }
}
