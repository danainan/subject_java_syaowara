
public class CatCafe {

	public static void main(String[] args) {
		
		/*1. Russian Blue, Age 2 yr, Color Grey, Name Chacha, Weight 1.5 kgs
		  2. Persian Cat, Age 1 yr, Color White, Name BomBom, Weight 1.15 kgs
		  3. Siamese Cat, Age 1 yr, Color White, Name PuffPuff, Weight 1 */

		
		Cat cat1 = new Cat();
		cat1.setBreed("Russian Blue");
		cat1.setAge(2);
		cat1.setColor("Grey");
		cat1.setName("Chacha");
		cat1.setWeight(1.5);
		
		Cat cat2 = new Cat();
		cat2.setBreed("Persian Cat");
		cat2.setAge(1);
		cat2.setColor("White");
		cat2.setName("BomBom");
		cat2.setWeight(1.15);
		
		Cat cat3 = new Cat();
		cat3.setBreed("Siamese Cat");
		cat3.setAge(1);
		cat3.setColor("White");
		cat3.setName("PuffPuff");
		cat3.setWeight(1);
		
		int sumAge = cat1.getAge() + cat2.getAge() + cat3.getAge();
		double sumWeight = cat1.getWeight() + cat2.getWeight() + cat3.getWeight();
		
		System.out.println("Cat Cafe");
		System.out.println("1. "+cat1.toString()+"\n2. "+cat2.toString()+"\n3. "+cat3.toString());
		System.out.println("Average age: "+sumAge/3.0+" Total Weight: "+sumWeight+" kgs");
	}

}
