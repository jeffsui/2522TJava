package asjy.base.day7;

public class TestPetHospital {
    public static void main(String[] args) {
//        Cat cat = new Cat("加菲猫",2);
//        APet pet  = cat;
        PetHospital.treatPet(new Cat("加菲猫",2));
        PetHospital.treatPet(new Dog("黑背",3));
        System.out.println("通过向下转型--方法参数一致");
        PetHospital.rentPet(new Cat("加菲猫",2));
        PetHospital.rentPet(new Dog("黑背",3));

//        PetHospital.rentPet(new Snake());

    }
}
