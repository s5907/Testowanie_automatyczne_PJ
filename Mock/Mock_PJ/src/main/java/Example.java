public class Example {
//int d = 2;
int points=0;

	public int funkcja1(){
		return 0;
	}
	
	public int funkcja2(){
		return 2;
	}

	public int AddTo(int d){
		return d+2;
	}


	public String name(){
	String imie= "jarek";
		return imie;
	}

	public String Addname(String names){
	//String imie= "jarek";
		return names;
	}

	public int ResultPoints (int result, int wr) {
		result = Math.abs(result);
		wr = Math.abs(wr);

		if ( result==0 && wr==0) {
		//	points= null;
		//		throw new IllegalArgumentException();
		}
		if (result < wr)
		 points = (result * 100)/wr ;
		if (result > wr)
		 points =  (result * 100)/wr ;
		if (result!=0 && wr!=0 && result == wr ) {
			 points =  100 ;
		}
		
		
		return (int) points;
	}

}
