package h_objects;

public class Paint extends Rectangle implements Ipriceable{

    public int getPrice(int wysokosc, int szerokosc){
        return getArea(wysokosc,szerokosc)*400;
    }

public Paint(int wysokosc, int szerokosc){
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
}

    public static void main(String[] args) {

        Paint paint1 = new Paint(10, 15);
        int pole = paint1.getArea(paint1.wysokosc, paint1.szerokosc);
        System.out.println(paint1.getPrice(paint1.wysokosc, paint1.szerokosc));

    }

    @Override
    public void getPrice() {

    }

    @Override
    public void getArea() {

    }
}
