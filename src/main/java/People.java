/**
 * Created by yumingjie on 15-2-5.
 */
public class People {
    private String name;
    private int i;
    private int i1;

    public People(String name, int i, int i1) {
        this.name = name;
        this.i = i;
        this.i1 = i1;
    }

    public String getName() {
        return name;
    }

    public int getI() {
        return i;
    }

    public int getI1() {
        return i1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setI1(int i1) {
        this.i1 = i1;
    }

    public int rally(People people){
        return people.i-=50;
    }

    public boolean siwang() {
        return this.i <= 0;
    }

}
