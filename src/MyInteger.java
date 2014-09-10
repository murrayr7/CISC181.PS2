public class MyInteger {

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}


	public MyInteger(int input){
		value=input;
	}

	public Boolean isEven(){
		return ((this.value%2)==0);
	}

	public Boolean isOdd(){
		return ((this.value%2)==1);
	}

	public Boolean isPrime(){
		int value = this.value;
		for( int i=2 ; i<(int)(value/2); i++)
			if ((value%i)==0){
				return false;
			}
		return true;
	}

	public static Boolean isEven(int input){
		return ((input%2)==0);
	}

	public static Boolean isOdd(int input){
		return ((input%2)==1);
	}

	public static Boolean isPrime(int input){
		double value = (double) input;
		for( int i=2 ; i<=(int)(Math.sqrt(value)); i++)
			if ((value%i)==0){
				return false;
			}
		return true;
	}
	
	public static Boolean isEven(MyInteger input){
		double value = (double) input.getValue();
		return ((value%2)==0);
	}

	public static Boolean isOdd(MyInteger input){
		double value = (double) input.getValue();
		return ((value%2)==1);
	}

	public static Boolean isPrime(MyInteger input){
		double value = (double) input.getValue();
		for( int i=2 ; i<(int)(Math.sqrt(value)); i++)
			if ((value%i)==0){
				return false;
			}
		return true;
	}
	
	public Boolean equals(int input){
		return (input==this.getValue());
	}

	public Boolean equals(MyInteger input){
		return (input.getValue()==this.getValue());
	}
	
	public static int parseInt(char[] input){
		int a=0;
		for(int i=0;i<input.length;i++){
			a+=Character.getNumericValue(input[i]);
		}
		return a;
	}
	
	public static int parseInt(String input){
		int a=0;
		for(int i=0;i<input.length();i++){
			char ch = input.charAt(i);
			a+=Character.getNumericValue(ch);
		}
		return a;
	}
	
	
}


