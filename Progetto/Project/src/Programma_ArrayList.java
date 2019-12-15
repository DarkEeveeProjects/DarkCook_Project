package ArrayList;
import java.util.ArrayList;

public class Programma_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> v=new ArrayList<>();
		System.out.println("I valori di v sono: "+v.size());
		v.add("Albero");
		v.add("Banana");
		v.add("Denti");
		v.add("Elevatore");
		v.add(2, "cuscino"); // IN QUESTO MODO INSERISCO LA PAROLA CUSCINO ALL'INDICE 2, OVVERO ALLA TERZA PAROLA
		
		for(int i=0; i<v.size(); i++)
			System.out.println("elemento "+ i+ ": "+v.get(i));
		System.out.println("Ora i valori di v sono: "+v.size());
		System.out.println("primo :" +v.get(0));
		System.out.println("ultimo :" +v.get(v.size()-1));

	}

}
