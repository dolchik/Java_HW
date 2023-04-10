package Java_HW.HW_06;

public class Ex_61Laptop {

    private String name;
    private int ram;
    private int storageCap;
    private String os;
    private String colour;
    private double diagonal;

    public Ex_61Laptop(String name, int ram, int storageCap, String os, String colour, double diagonal){
        this.name = name;
        this.ram = ram;
        this.storageCap = storageCap;
        this.os = os;
        this.colour = colour;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return String.format("Название: %s. \n Объем оперативной памяти: %d Гб. \n"
        + "объем накопителя: %d Гб. \n ОС %s. \n Цвет %s. \n Диагональ %.1f. \n",
        this.name, this.ram, this.storageCap, this.os, this.colour, this.diagonal);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Ex_61Laptop) {
            return this.name.equals(((Ex_61Laptop) obj).name) && this.ram == ((Ex_61Laptop) obj).ram
            && this.storageCap == ((Ex_61Laptop) obj).storageCap && this.os.equals(((Ex_61Laptop) obj).os) 
            && this.colour.equals(((Ex_61Laptop) obj).colour) && this.diagonal == ((Ex_61Laptop) obj).diagonal;
        }
        return false;
        
    }

    public int getRam(){
        return this.ram;
    }
    public int getStorageCap(){
        return this.storageCap;
    }
    public String getOS(){
        return this.os;
    }
    public double getDiagonal(){
        return this.diagonal;
    }
}
