package challenge;
public class PowerOfTwo{
	public static boolean powerOfTwo(int N){
		if(N == 0){
			return false;
		}

		for(int i = 0; i <= Math.sqrt(N); i++){
			if(Math.pow(2, i) == N){
				return true;
			} 
		}
		return false;
	}

  public static boolean powerOf2Binary(int N){
    return Integer.toBinaryString(N).indexOf('1')==Integer.toBinaryString(N).lastIndexOf('1');
  }

}