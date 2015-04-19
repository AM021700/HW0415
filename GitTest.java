class GitTest{
	public static void main( String args[] ){
		print( 2, 7 );
	}

	public static int add( int a, int b ){
		return a + b;
	}

	public static int mult( int a, int b ){
		return a * b;
	}

	public static void print( int a, int b ){
		System.out.println( mult( add( a, b ), a ) );
	}
}