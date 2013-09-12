package fizzbuzz;

public class FizzBuzz {

	public String imprimir(int num)
	{
		String mensaje = "";
		if (!(num%3==0) && !(num%5==0))
			mensaje += num;
		else
		{
			if (num%3==0)
				mensaje += "fizz";
			if (num%5==0)
				mensaje += "buzz";
		}
		return mensaje;
	}
}
