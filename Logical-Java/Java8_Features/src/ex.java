import java.util.Arrays;
import java.util.List;

public class ex {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(2,5,4,3,8);
	int result = num.stream().filter(n->n%2==0).map(i-> i*2).sorted().reduce(0,(a,b)->a+b);//.forEach(n -> System.out.println(n));
		System.out.println(result);
	}

}
