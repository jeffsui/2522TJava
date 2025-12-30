package asjy.base.day7;

public class PetHospital {
    /**
     * 照顾宠物
     * @param pet
     */
    public static void treatPet(APet pet){
        pet.eat();
        pet.play();
    }

    /**
     * 出租宠物
     * @param pet
     */
    public static void rentPet(APet pet){
        if(pet instanceof  Dog){
//            Dog dog = (Dog) pet;
//            dog.watchHouse();
            ((Dog)pet).watchHouse();
        }else if(pet instanceof Cat){
            Cat cat = (Cat)pet;
            cat.catchMouse();
        }
    }

}
