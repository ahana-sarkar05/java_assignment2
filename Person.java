import lombok.*;
// Person class
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
class Person {
    private String name;
    private int age;
    private Address address; // Has-A relationship
	
	
}

// Address class
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
class Address {
    private String street;
    private String city;
    private String pinCode;
	
	
}

// Main class
class PersonHasAddress {
    public static void main(String[] args) {
        Address address = new Address("18/ V", "Mahesh Serampore Hooghly",  "712202");
        Person person = new Person("Ahana", 19, address);
        System.out.println(person);
    }
}
