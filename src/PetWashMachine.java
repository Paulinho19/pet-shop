public class PetWashMachine {
    private int water = 0;
    private int shampoo = 0;

    Pet pet = new Pet();

    public void washPet(){
        if (this.pet != null) {
            System.out.println("A máquina está em uso, favor aguarde.");
        } else{
            if(pet.getIsClean()){
                System.out.println("Pet já está limpo.");
            } else {
                System.out.println("Pet lavado!");
                pet.setClean(true);
                this.water -= 10;
                this.shampoo -= 2;
            }
        }
    }

    public void addWater(){
        if(this.water >= 30){
            System.out.println("A máquina já está com a capacidade máxima de água (30L)");
        } else {
            System.out.println("Foram adicionados 2 litros de água");
            this.water += 2;
        }
    }

    public void addShampoo(){
        if(this.shampoo >= 10){
            System.out.println("A máquina já está com a capacidade máxima de shampoo (10L)");
        } else {
            System.out.println("Foram adicionados 2 litros de shampoo");
            this.shampoo += 2;
        }
    }

    public void getWater(){
        System.out.printf("A máquina está com %s litros de água", this.water);
    }

    public void getShampoo(){
        System.out.printf("A máquina está com %s litros de shampoo", this.shampoo);
    }


    public void setWater(int water){
        this.water = water;
    }

    public void setShampoo(int shampoo){
        this.shampoo = shampoo;
    }











}
