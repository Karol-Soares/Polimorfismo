package polimorfismo;

public class PolimorfismoCavalo extends PolimorfismoAnimal{
	
	private String som;

	public PolimorfismoCavalo(String nome, String som) {
		super(nome, som);
	}	
    @Override
    public void emitir(String som) {
		System.out.println();
   }

}
