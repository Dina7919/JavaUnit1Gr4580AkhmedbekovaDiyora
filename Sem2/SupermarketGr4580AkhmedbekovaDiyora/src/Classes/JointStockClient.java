package Classes;

public class JointStockClient extends Actor {

    private int jointStockID;
    private int numberParticipens;

    public JointStockClient(String name, int jointStockID, int numberParticipens) {
        super(name+" - название акции");
        this.jointStockID = jointStockID;
        this.numberParticipens = numberParticipens;
    }

     @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
      return this;
    }

}
