package fizzbuzz;

public class FizzBuzz {
	private int cont = 0;
	public int posision()
	{
		return cont;
	}
	public String imprimir()
	{
		String mensaje = "";
		mensaje += cont;
		cont++;
		return mensaje;
	}
}
