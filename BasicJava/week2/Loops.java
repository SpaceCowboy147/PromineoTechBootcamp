package week2coding;

public class Loops {

	public static void main(String[] args) {
int x = 0;		
while (x <= 100) {
	System.out.println(x); 
	x += 2;
	}

int y = 100;
while (y >= 0) { System.out.println(y);
	y -= 3;
}
for (int i = 1; i <= 100; i +=2) {
	System.out.println(i);
}
for (int i = 0; i < 100; i++) {
	if (i % 3 == 0) {
		System.out.println("Hello");
	if (i % 5 == 0) {
		System.out.println("World");
	if (i % 3 == 0 && i % 5 == 0) {
		System.out.println("HelloWorld");
	}
	
	}
	}

}
	}

}
