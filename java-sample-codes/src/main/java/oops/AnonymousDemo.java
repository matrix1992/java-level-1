package oops;

/*
 * Demo for anonymous class
 */
public class AnonymousDemo {

    public void makeAnimalSound(Animal animal) {
        String sound = animal.makeSound();
        System.out.println(sound);
    }

    public static void main(String[] args) {
        AnonymousDemo ad = new AnonymousDemo();
        ad.makeAnimalSound(new Animal() {

            public String makeSound() {
                return "Bark";
            }

			@Override
			public String getSize() {
				return "Small";
			}

        });
    }

}
