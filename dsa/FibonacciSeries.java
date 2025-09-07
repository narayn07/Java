//code for printing fibonacci series.
class FibonacciSeries{
	public int Fibonacci(int n){
		int first = 0;
		int second = 1;
		int sum = 0;
		if(n == 0){
			return first;
		}
		else if(n == 1){
			return second;
		}
		for(int i = 2; i <= n; i++){
			sum = first+second;
			first = second;
			second = sum;
		}
		return sum; //return the fibonacci of nth term.
	}
	public static void main(String[] args){
		FibonacciSeries fi = new FibonacciSeries();
		System.out.println(fi.Fibonacci(1));
		System.out.println(fi.Fibonacci(2));
		System.out.println(fi.Fibonacci(3));
		System.out.println(fi.Fibonacci(4));
		System.out.println(fi.Fibonacci(5));
		System.out.println(fi.Fibonacci(6));
		System.out.println(fi.Fibonacci(7));
	}
}

