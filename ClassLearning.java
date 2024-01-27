public class ClassLearning{
    //driver function 
    public static void main(String[] args){
        // Creation of class 
        Person person=new Person("Choti","FEMALE",27);
        System.out.println("Name : " + person.name);
        System.out.println("Gender : " + person.gender);
        System.out.println("Age : " + person.age);


    }
}


class Person{

    // fields of class 
    String name;
    int age;
    String gender;

    // Constructor
    // How many ways you can create you can create class.
    public Person(String name,String gender,int age){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    // setter
    public void setName(String name){
        this.name=name;
    }

    //getter
    public String getName(){
        return this.name;
    }

    

}