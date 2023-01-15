class Program{
	public static int[] twoNumberSum(int[] array,int targetSum){
		for (int m=0; m < array.length -1; m++){
			int firstNumber = array[m];
			for(int n=m+1; n < array.length; n++){
				int secondNumber = array[n];
				if (firstNumber + secondNumber == targetSum){
					return new int[] {firstNumber, secondNumber};
				}
			}
		}
		return new int[0];
	}
}

