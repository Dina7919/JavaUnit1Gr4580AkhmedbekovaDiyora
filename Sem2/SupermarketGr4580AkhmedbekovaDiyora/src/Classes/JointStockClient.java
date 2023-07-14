package Classes;

public class JointStockClient extends Actor {

    private int jointStockID;
    private int numberParticipens;

    // конструктор класса JointStockClient принимает 3 параметра - название акции, id акционера и количество акций. 
    // значения jointStockID и numberParticipens присваиваются соответствующим полям объекта JointStockClient

    public JointStockClient(String name, int jointStockID, int numberParticipens) {
        super(name+" - название акции");
        this.jointStockID = jointStockID;
        this.numberParticipens = numberParticipens;
    }

     @Override
     // данный метод возвращает значение поля name из класса Actor.
    public String getName() {
        return super.name;
    }

    // данный метод возвращает значение поля isTakeOrder из класса Actor.
    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    // данный метод возвращает значение поля  isReturnOrder из класса Actor.
    public boolean isReturnOrder() {
      return super.isTakeOrder;
    }

    // данный метод возвращает значение поля isMakeOrder из класса Actor.
    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }

    // данный метод устанавливает значение поля isMakeOrder в переданное значение makeOder
    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    // данный метод устанавливает значение поля isTakeOrder в переданное значение pikUpOrder
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }

    // данный метод возвращает текущий объект JointStockClient
    public Actor getActor() {
      return this;
    }

    public void setReturnOrder(boolean returnOrder) {
      super.isReturnOrder = returnOrder;
    }
  // данный метод устанавливает значение поля isReturnOrder в переданное значение returnOrder.

}
