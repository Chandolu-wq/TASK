package tnsTraining;

public class methodoverriding {
	class Animal {
	    void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	class Dog extends Animal {
	    @Override
	    void sound() {
	        System.out.println("Dog barks");
	    }
	}

	public class MethodOverriding {
	    private static Animal obj;

		public static void main(String[] args) {

	 
obj = null;
	        obj.sound();
	    }


		}
	}
