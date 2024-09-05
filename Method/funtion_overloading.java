public class funtion_overloading {
    public double volume(double r){
        double vol = (22.0/7.0)*4.0/3.0*r*r*r;
        return vol;
    }
    public double volume(double h,double r){
        double vol = (22.0/7.0)*r*r*h;
        return vol;
    }
    public double volume(double l, double b, double h){
        double vol = l*b*h;
        return vol;
    }

}
