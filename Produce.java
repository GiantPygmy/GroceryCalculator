package grocery.calculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jeremy Ryan
 */
public class Produce extends Grocery {

    private boolean needsPeeling;
    boolean peeled;

    public Produce() {
        super();
        needsPeeling = false;
        peeled = false;
    }

    public Produce(String name, int quantity, double cost, boolean needsPeeling, boolean peeled) {
        super(name, quantity, cost);
        this.needsPeeling = needsPeeling;
        this.peeled = peeled;
    }

    //get and set
    public boolean isNeedsPeeling() {
        return needsPeeling;
    }

    public void setNeedsPeeling(boolean needsPeeling) {
        this.needsPeeling = needsPeeling;
    }

    public boolean isPeeled() {
        return peeled;
    }

    public void setPeeled(boolean peeled) {
        this.peeled = peeled;
    }

    @Override
    public String toString() {
        return super.toString() + " Needs peeling: " + needsPeeling + " Peeled: " + peeled;
    }
}
