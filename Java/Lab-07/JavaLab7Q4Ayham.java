// Java Lab 7 Q4

public class JavaLab7Q4Ayham {

	//public void main(String[] args) { // static
	public static void main(String[] args) { // static

		int sum = 0;
		int i;
		//for (i = 0; i < 10; i++); // declared i outside scope to make it work with the if  condition // Missing {} or remove ;
		for (i = 0; i < 10; i++) // declared i outside scope to make it work with the if  condition // Missing {} or remove ;
			sum += i; // Sum in not declared
		
		int j = 1;
		//if (i < j); // Missing {} or remove ; // i is not declared (i is declared inside another scope)
		if (i < j) { // Missing {} or remove ; // i is not declared (i is declared inside another scope)
			//System.out.println(i) // Error: Missing ;
			System.out.println(i); // Error: Missing ;
		}
		else {
			System.out.println(j);
		}

		while (j < 10); // j is not declared
		{
			System.out.println(">" + j);
			j++;
		};

		do {
			System.out.println(">>" + j);
			j++;
		//} while (j < 10) // Error: Missing ;
		} while (j < 10); // Error: Missing ;
	   
		return;
		}

	}