public class Proxy implements Doughnut{
    Doughnut doughnut = new CherryDoughnut();

    @Override
    public void eat() {
        System.out.println("Proxy functional");
        doughnut.eat();
    }
}
