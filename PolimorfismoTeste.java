package polimorfismo;

public class PolimorfismoTeste {

	public static void main(String[] args) {
		
		PolimorfismoCachorro dog = new PolimorfismoCachorro("Scooby","Salsichaa.");
		PolimorfismoCavalo pangare = new PolimorfismoCavalo("Pé de Pano","ihaaa");
		PolimorfismoPreguica preg = new PolimorfismoPreguica("Sid", "A gente vai viver");

		System.out.println("\n"+dog.getNome()+" "+dog.getSom());
        System.out.println("\n"+pangare.getNome()+" "+pangare.getSom());
		System.out.println("\n"+preg.getNome()+" faz um "+preg.getSom());
	}
		// TODO Auto-generated method stub

	}


