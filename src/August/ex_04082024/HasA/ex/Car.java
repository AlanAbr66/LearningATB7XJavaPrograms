package August.ex_04082024.HasA.ex;

public class Car  {// Aggregation - hasA
protected void StartTheCar(){
    new Engine().start();
    new Tyres().rolling();
}
}

