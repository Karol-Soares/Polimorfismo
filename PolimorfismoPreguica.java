package polimorfismo;

public class PolimorfismoPreguica extends PolimorfismoAnimal{
	
	private String som;

	public PolimorfismoPreguica(String nome, String som) {
		super(nome, som);
	}	
    @Override
    public void emitir(String som) {
		System.out.println();
   }

}
