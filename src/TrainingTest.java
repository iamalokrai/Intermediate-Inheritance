// class to test the Training, PublicTraining and CorporateTraining classes

public class TrainingTest {

	public static void main(String[] args) {

		Training publicTraining = new PublicTraining(1, "Java", 5000, 50);
		System.out.println("Public training cost: " + publicTraining.getOrderValues());
		Training corporateTraining = new CorporateTraining(2, "Big Data", 35000, 4);
		System.out.println("Corporate training cost: " + corporateTraining.getOrderValues());
	}

}
