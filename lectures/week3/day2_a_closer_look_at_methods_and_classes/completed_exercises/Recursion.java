class Recursion {
	public static void main(String[] args){
		System.out.println(blocksInTriangle(4));
	}
	public static int blocksInTriangle(int rows){
		if(rows > 0){
			return rows += blocksInTriangle(--rows); 
		} else {
			return rows;
		}	
		
	}
}