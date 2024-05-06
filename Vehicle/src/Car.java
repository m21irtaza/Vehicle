public class Car implements Vehicle,MP{
    @Override
    public void Playsong() {
        System.out.println("Playing Song");
    }

    @Override
    public void Stopsong() {
        System.out.println("Stopping Song");
    }

    @Override
    public void Forwardsong() {
        System.out.println("Playing next Song");
    }

    @Override
    public void speedup() {
        System.out.println("Speeding up");
    }

    @Override
    public void slowdown() {
        System.out.println("Slowing down");
    }

    @Override
    public void Braking() {
        System.out.println("Braking....");
    }


}

