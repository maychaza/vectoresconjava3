package ada.prueba;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	List<Auto> autos= new ArrayList<>(2);
	Auto auto= new Auto("renault", "sandero", 2010, 600000.00);
	Auto auto1= new Auto("Ford", "focus", 2015, 850000.05);

	autos.add(auto);
	autos.add(auto1);

	System.out.println("cantidad total:"+autos.size());
	for (int cont=0; cont< autos.size(); cont++){
		System.out.println(cont+(autos.get(cont).getPrecio()));
	}

    }
}



