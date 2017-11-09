class Box158 {
    double width;
    double height;
    double depth;

    Box158(){
        System.out.println("Konstruktor object");
        width = 3;
        height = 3;
        depth = 3;
    }
    double volume() {
        return width * height * depth;
    }
   void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

}


class BoxDemo6 {
    public static void main(String[] args) {
        Box158 myb1 = new Box158();
        Box158 myb2 = new Box158();

        double vol;

        vol = myb1.volume();
        System.out.println("Объем=" + vol);

        vol = myb2.volume();
        System.out.println("Объем=" + vol);

    }
}
class BoxDemo7{
        public static void main(String[] args) {
            Box158 myb1 = new Box158();
            Box158 myb2 = new Box158();
            double vol;

            myb1.setDim( 10, 20, 15);
            myb2.setDim(3, 6, 9);

            vol = myb1.volume();
            System.out.println("Объем="+vol);

            vol = myb2.volume();
            System.out.println("Объем="+vol);
        }
}
