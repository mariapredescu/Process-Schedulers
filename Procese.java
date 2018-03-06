
/**
 * Clasa Procese cuprinde cele 7 metode pentru fiecare tip de proces.
 *  
 * @author Maria Predescu 
 *
 */
public class Procese {
	
	/**
	 * Metoda verifica daca un numar este prim.
	 * 
	 * @param num reprezinta numarul de verificat
	 * @return 0 daca numarul nu este prim, 1 daca numarul este prim
	 */
	public int CheckPrime(int num) {
		
		if(num < 2) 
			return 0;
		for(int i = 2; i <= num / 2; i++) {
			if(num % i == 0) {
				return 0;
			}
		}
		return 1;
	}
	
	/**
	 * Metoda determina cel mai mic numar prim mai mare decat numarul primit.
	 * 
	 * @param num reprezinta numarul fata de care trebuie sa determinam urmatorul
	 * numar prim
	 * @return cel mai mic numar prim mai mare decat numarul primit
	 * 
	 */
	public int NextPrime(int num) {
		
		if(num == 2)
			return 3;
		if(CheckPrime(num) == 1) {
			num++;
		}
		while(!(CheckPrime(num) == 1)) {
			num++;
		}
		return num;
	}
	
	/**
	 * Metoda calculeaza al n-lea termen modulo 9973 din sirul lui Fibonacci .
	 * 
	 * @param n pozitia termenului din sirul lui Fibonacci ce trebuie returnat
	 * @return al n-lea termen din sirul lui Fibonacci
	 */
	public int Fibonacci(int n) {
		if(n < 0)
			return -1;
		if(n == 0)
			return 0;
		int x = 1;
		int y = 1;
		for(int i = 2; i < n; i++) {
			int aux = x;
			x = y;
			y = (aux + x) % 9973;
		}
		return y;
	}
	
	/**
	 * Metoda calculeaza partea intreaga a radicalului modulului numarului primit.
	 * 
	 * @param num reprezinta numarul primit
	 * @return partea intreaga a radicalului modulului numarului primit
	 */
	public int Sqrt(int num) {
		
		return (int) (Math.sqrt(Math.abs(num)));
	}
	
	/**
	 * Metoda calculeaza patratul numarului primit.
	 * 
	 * @param n reprezinta numarul primit
	 * @return patratul numarului dat
	 */
	public int Square(int n) {
		
		return n * n;
	}
	
	/**
	 * Metoda calculeaza cubul numarului primit.
	 * 
	 * @param n reprezinta numarul primit
	 * @return cubul numarului primit
	 */
	public int Cube(int n) {
		
		return n * n * n;
	}
	
	/**
	 * Metoda calculeaza factorialul modulo 9973 al numarului primit.
	 * 
	 * @param n reprezinta numarul primit
	 * @return factorialul modulo 9973 al numarului primit
	 */
	public int Factorial(int n) {
		if(n < 0)
			return 0;
		int factorial = 1;
		for(int i = 2; i <= n; i++) {
			factorial = (factorial * i) % 9973;
		}
		return factorial;
	}
}
