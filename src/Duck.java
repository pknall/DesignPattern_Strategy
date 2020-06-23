/*
 * This is the CONTEXT in the UML Diagram.
 */

public class Duck {

    IFlyBehavior fb;
    IQuackBehavior qb;
    IDisplayBehavior db;

    public Duck(IFlyBehavior fb, IQuackBehavior qb, IDisplayBehavior db) {
        this.fb = fb;
        this.qb = qb;
        this.db = db;

    }

    public void fly() {
        fb.fly();
    }

    public void quack() { qb.quack(); }

    public void display() { db.display(); }
}
