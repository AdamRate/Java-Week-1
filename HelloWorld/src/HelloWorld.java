public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[11];
		//int[] arr2 = new int[11];
		
		for (int i=1; i<11; i++){
			arr[i]= i;
			System.out.println(arr[i]);
			}
		
		for (int j=1; j<11; j++)
		{
			arr[j] = j *10;
			System.out.println(arr[j]);
		}
			
			//System.out.println(method(arr[i],arr2[i]));}
		
	}
	
	
	public static int method(int a,int b){
		
		
		if (a != 0 && b != 0)
		{
			return (a+b);
		}
		
		else if (a == 0){
			return (b);
		}
		
		else if (b == 0){
			return (a);
		}
		
		
		else
		return(0);
		}

}


