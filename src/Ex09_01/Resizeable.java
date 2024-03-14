package Ex09_01;

public interface Resizeable {
         void resize (double percent);
         default double getArea(){
             int i = 0;
             return i;
         }
}
