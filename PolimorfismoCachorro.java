package polimorfismo;

public class PolimorfismoCachorro extends PolimorfismoAnimal{
	
	private String som;

	public PolimorfismoCachorro(String nome, String som)
	{
		super(nome, som);
	}	
	
    public void emitir(String som) {
	    System.out.println();
   }

}
