public class FizzBuzz {

	public String imprimirFizz(int num)
	{
		String mensaje="";
		if (num%3==0)
			mensaje += "fizz";
		return mensaje;
	}
	
	public String imprimirBuzz(int num)
	{
		String mensaje="";
		if (num%5==0)
			mensaje += "buzz";
		return mensaje;
	}
	
	public String imprimir(int num)
	{
		String mensaje = "";
		if (num>0)
		{
			mensaje+=imprimirFizz(num);
			mensaje+=imprimirBuzz(num);
			if (mensaje.isEmpty())
				mensaje += num;
		}
		return mensaje;
	}
	
	public String imprimirSerie(int limite)
	{
		String serie="";
		for(int i=1;i<limite;i++)
		{
			serie+=imprimir(i)+"/n ";
		}
		serie+=imprimir(limite);
		return serie;
	}

}
