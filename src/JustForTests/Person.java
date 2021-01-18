package JustForTests;

public class Person{

    public String name;
    public int age;
    public String id;



    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }


    @Override
    public boolean equals(Object obj){

        if(obj == null)
            return false;

        if(obj.getClass() != Person.class)
            return false;

        Person otherPerson = (Person) obj;

        return this.id.equals(otherPerson.id);
    }


    @Override
    public int hashCode(){
        return this.id.hashCode();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
