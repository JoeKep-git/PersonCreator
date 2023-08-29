public class Main {
    public static void main(String[] args) {
        // Create a new Person object
        //height cm, weight lbs
        Person person = new Person("James Peterson", (byte) 34, 180, 73.5f);
        Person person1 = new Person("Bob Thornley", (byte) 25, 171, 68.2f);

        System.out.println("Person 1: " +
                person.getName() + ", " +
                person.getAge() + ", " +
                person.getHeight() + ", " +
                person.getWeight());

        System.out.println("Person 2: " +
                person1.getName() + ", " +
                person1.getAge() + ", " +
                person1.getHeight() + ", " +
                person1.getWeight());

        person.growOlder();
        System.out.println("Person 1: " +
                person.getName() + ", " +
                person.getAge() + ", " +
                person.getHeight() + ", " +
                person.getWeight());
    }
}
