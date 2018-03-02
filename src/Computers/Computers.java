package Computers;

public class Computers {
    private String modelComp;
    private int year;
    private int memory;
    private int price;

    public static ComputerBuilder builder (){
        return new ComputerBuilder();
    }

    static class ComputerBuilder{
        private Computers computers = new Computers();


        public ComputerBuilder modelComp (String  modelComp){
            this.computers.modelComp = modelComp;
            return this;
        }

        public ComputerBuilder year (int year){
            this.computers.year = year;
            return this;
        }

        public ComputerBuilder memory (int memory){
            this.computers.memory = memory;
            return this;
        }

        public ComputerBuilder price (int price){
            this.computers.price = price;
            return this;
        }




        public Computers build(){
            return computers;
        }



    }




    @Override
    public String toString() {
        return "Computers{" +
                "modelComp='" + modelComp + '\'' +
                ", year=" + year +
                ", memory=" + memory +
                ", price=" + price +
                '}';
    }
}
