class templates{
	
	
	static <T extends Comparable<T>> T max(T a, T b){
		if(a.compareTo(b)<0) return b;
		if(a.compareTo(b)>0) return a;
		return a;
	}
	
	
	
	public static void main(String[] args){
		
		System.out.println(max('a','d'));
	}
}