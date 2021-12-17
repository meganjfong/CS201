public class Gravity {
    public double falling(double time, double velo){
        double g = 9.8;
        double ret = time*velo + 0.5*g*time*time;
                return ret;
    }
}
