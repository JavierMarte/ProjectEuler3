import java.util.ArrayList;

public class Euler2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		ArrayList<Integer> arr = new ArrayList();
		ArrayList<Integer> evenArr = new ArrayList();
		int i = 0;
		int y = 1;
		int x = 2;
		int sum = 0;
		int evensum = 0;
		int limit = 4000000;
		arr.add(y);
		arr.add(x);
		while(sum < limit){						
			sum = arr.get(i) + arr.get(i + 1);
			if(sum % 2 == 0){				
				evensum = arr.get(i) + arr.get(i + 1);
			}
			if(sum > limit){				
				break;
			}else{
				if(sum % 2 == 0){					
					evensum = arr.get(i) + arr.get(i + 1);
					evenArr.add(evensum);
				}
							
			}
			arr.add(sum);			
			i++;			
		}
		System.out.println(evenArr);
	}

}
