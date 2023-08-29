public class Person {
    private String name;
    private byte age;
    private int height;
    private float weight;

    //height cm, weight lbs
    public Person(String name, byte age, int height, float weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void growOlder() {
        age++;
        height--;
        weight-=0.5f;
    }
}
