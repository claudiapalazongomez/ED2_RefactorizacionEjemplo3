package es.studium.extraerconstante;

public class ExtraerConstante
{
	private static final String ES = " es ";
	private static final String TEXTO = "El factorial de "; //al repetirse esa cadena, la extraemos como una constante (Refactor -> Extract Constant)

	public static void main(String[] args)
	{
		int numero = 3;
		System.out.println(TEXTO + numero + ES + calcularFactorial(numero));
		numero = 5;
		System.out.println(TEXTO + numero + ES + calcularFactorial(numero));
	}

	public static double calcularFactorial(double n)
	{
		if (n == 0)
		{
			return 1;
		} else
		{
			double resultado = n * calcularFactorial(n - 1);
			return resultado;
		}
	}
}
