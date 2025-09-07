class FibonacciSeries{
	public int Fibonacci(int x){
		int first = 0;
		int second = 1;
		int sum = 0;
		if(x == 0){
			return first;
		}
		else if(x == 1){
			return second;
		}
		for(int i = 2; i <= x; i++){
			sum = first+second;
			first = second;
			second = sum;
		}
		return sum;
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
