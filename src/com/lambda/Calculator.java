package com.lambda;

public interface Calculator {

	// without any parameter
	// void switchOn();
	
	// with one parameter
	//void addition(int a);
	
	// with multiple arguments
	int subtract(int a, int b);
	
	public class CalculatorImpl{

		
	}
	
	
	public static void main(String[] args) {
		
		/* Calculator calc = () ->
			System.out.println("Inside Switch On method.");
			
        calc.switchOn(); */
		
		/* Calculator calc = (int a) ->
		    
			System.out.println("Addition: " + a);
		calc.addition(5); */
		
		Calculator cal = (a,b) -> {
			if(a<b) 
				throw new RuntimeException("a is greater than b, can't subtract");
			else
			    return a-b;
		};
		System.out.println(cal.subtract(10, 20));
	}

}
