/*
 * A "Duck" have 3 behaviors: Flying, Quacking and Displaying.  However, depending on the type of duck, these behaviors
 * do different things.  This is similar to the idea that words can have multiple meanings...behaviors can have
 * different implementations.
 *
 * By working through interfaces (IDisplayBehavior, IFlyBehavior and IQuackBehavior), the implementation of those
 * behaviors is assigned at runtime when the Duck object is constructed.  The related behaviors (SimpleDisplaying,
 * SimpleFlying, etc...), themselves, implement one of these interfaces (IDisplayBehavior, IFlyBehavior or
 * IQuackBehavior) and are, therefor, able to be referenced by the respective variables (fb, qb and db) in Duck.
 *
 * The application then executes the Duck.fly(), Duck.quack() or Duck.display() method to call (through their
 * respective interface) the referenced "-ing" behavior.
 */

public class ApplicationClass {

    /* Main Application.
     * Creates two "Duck" objects with different behaviors based on the "-ing" behavior they are assigned.
     */
    public static void main(String[] args) {
        Duck cityDuck = new Duck(new SimpleFlying(), new CityQuacking(), new SimpleDisplaying());
        Duck complexDuck = new Duck(new SimpleFlying(), new SimpleQuacking(), new ComplexDisplaying());

        cityDuck.fly();
        cityDuck.quack();
        cityDuck.display();
        complexDuck.fly();
        complexDuck.quack();
        complexDuck.display();
    }

}
