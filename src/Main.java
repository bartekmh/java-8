import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		functionExamples();
		functionExamplesGenericMethod();
		consumerExample();
		binaryOperatorExample();
		predicateExample();
		supplierExample();
	}
	

	private static void functionExamplesGenericMethod() {
		Function<String[],List<String>> asList = Arrays::<String>asList;
	    
	    System.out.println(asList.apply(new String[]{"a","b","c"}));
	    
	   
			
	}


	private static void supplierExample() {
		 Supplier<Game> suplier = Game::new;
		
		 suplier.get();
		 suplier.get();
	}


	private static void predicateExample() {
		// TODO Auto-generated method stub
		
	}


	public static void functionExamples(){
		System.out.println("--functionExamples");
		Function<Integer, String> myfunction1 = (asd) -> "oo" + asd;
		Function<Integer, String> myfunction2 = (asd) -> {return "oo" + asd;};
		Function<Integer, String> myfunction3 = asd -> {return "oo" + asd;};
		
		String one = myfunction1.apply(1);
		String two = myfunction2.apply(2);
		String thr = myfunction3.apply(3);

		System.out.println(one);
		System.out.println(two);
		System.out.println(thr);
		
		List<String> list = Arrays.asList("a", "b");
		
		Function<String, String> myfunction4 = (asd) -> "oo" + asd;
		
		list.stream().map(myfunction4).forEach(System.out::println);
	}
	
	public static void consumerExample(){
		System.out.println("--consumerExample");
		List<String> list = Arrays.asList("a", "b");
		
		Consumer<String> consumer1 = (str1) -> System.out.println(str1);
		
		list.stream().forEach(consumer1);
		list.stream().forEach(System.out::println);
		
	}

	private static void binaryOperatorExample() {
		System.out.println("--binaryOperatorExample");
		String val = "abc";
		BinaryOperator<String> binaryOperator1 = (str1, str2) -> val.replaceAll(str1, str2);
		BinaryOperator<String> binaryOperator2 = val::replaceAll;
		 
		List<String> list = Arrays.asList("a", "b");
		
		for(String s:list){
			System.out.println(binaryOperator1.apply(s, "b"));
			System.out.println(binaryOperator2.apply(s, "b"));
		}
		
	}
}
