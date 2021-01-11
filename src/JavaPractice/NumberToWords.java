package JavaPractice;

public class NumberToWords {

	public static void main(String[] args) {
    numberToWords(-222);
	}
	public static void numberToWords(int number) {
		String result="";
		if(number<0) {
			System.out.println("Invalid Value");
		}
		else {
			if(number==0) {
				System.out.println("Zero");
			}
			
			int reversedNum=reverse(number);
			
			while(reversedNum!=0) {
				int digit=reversedNum%10;
				switch(digit) {
				case 0:
					result+=" Zero";
				    break;
				case 1:
					result+=" One";
				    break;
				case 2:
					result+=" Two";
				    break;
				case 3:
					result+=" Three";
				    break;
				case 4:
					result+=" Four";
				    break;
				case 5:
					result+=" Five";
				    break;
				case 6:
					result+=" Six";
				    break;
				case 7:
					result+=" Seven";
				    break;
				case 8:
					result+=" Eight";
				    break;
				case 9:
					result+=" Nine";
				    break;
				default:System.out.println("Invalid value");
				}
				reversedNum=reversedNum/10;
			}
			int countResult=getDigitCount(reverse(number));
			while(countResult!=getDigitCount(number)) {
				result+=" Zero";
				countResult+=1;
			}
		}
		
		System.out.println(result);
		
	}
	public static int reverse(int number) {
		int reversed=0;
		while( number!=0) {
			int digit=number%10;
			reversed=reversed*10;
			reversed=reversed+digit;
			number=number/10;
		}
		return reversed;	
	}
	
	public static int getDigitCount(int number) {
		if(number<0) {
			return -1;
		}
		else {
			int count=0;
			if(number==0) {
				++count;
			}
			while(number!=0) {
				count++;
				number=number/10;
			}
			return count;
		
		}

		}
		
}
