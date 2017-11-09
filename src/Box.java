class Box {
    double w;
    double h;
    double d;
    double volume(){
        return w * h * d;
    }
    void setDim(double w, double h, double d){
        this.w = w;
        this.h = h;
        this.d = d;
    }
}
class BoxDemo5{
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);
        // setDim для установки значений
        //5656

        vol = mybox1.volume();
        System.out.println("O ="+vol);

        vol = mybox2.volume();
        System.out.println("O ="+vol);
    }
}