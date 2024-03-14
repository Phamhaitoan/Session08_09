package Ex08_03;

public class MovablePoint extends Point {
    private float xspeed;
    private float yspeed;

    public MovablePoint() {
    }

    public MovablePoint(float xspeed, float yspeed) {
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public float getXspeed() {
        return xspeed;
    }

    public void setXspeed(float xspeed) {
        this.xspeed = xspeed;
    }

    public float getYspeed() {
        return yspeed;
    }

    public void setYspeed(float yspeed) {
        this.yspeed = yspeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x="+ getX() +
                "y = " + getY() +
                "speed=" + (xspeed + yspeed ) +
                '}';
    }
    public void setSpeed(float xspeed,float yspeed){
           this.xspeed = xspeed;
           this.yspeed = yspeed;
    }
    public float[] getSpeed(){
        return new float[]{xspeed,yspeed};
    }
    public MovablePoint move(){
     this.setX(getX() + xspeed);
     this.setY(getY() + yspeed);
      return this;
    }
}
