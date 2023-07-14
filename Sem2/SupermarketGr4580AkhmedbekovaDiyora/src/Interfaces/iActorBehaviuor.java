package Interfaces;

import Classes.Actor;

public interface iActorBehaviuor {

    public boolean isTakeOrder() ;
    public boolean isMakeOrder() ;
    public void setTakeOrder(boolean takeOrder) ;
    public void setMakeOrder(boolean makeOrder) ;
    Actor getActor();
    public boolean isReturnOrder();
    public void setReturnOrder(boolean b);
    
}