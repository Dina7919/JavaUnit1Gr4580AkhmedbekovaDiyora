package Classes;

import java.util.List;
import java.util.ArrayList;

import Interfaces.iActorBehaviuor;

import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour,iQueueBehaviour, iActorBehaviuor, iReturnOrder {

    private List<iActorBehaviuor> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehaviuor>();
    }

    @Override
    public void acceptToMarket(iActorBehaviuor actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviuor actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
        
    }

    @Override
    public void update() {
       takeOrder();
       giveOrder();
       releaseFromQueue();
       returnOrder();
    }

    @Override
    public void giveOrder() {
        for(iActorBehaviuor actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
        
    }

    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>();
       for(iActorBehaviuor actor:queue)
       {
        if(actor.isTakeOrder())
        {
            releaseActors.add(actor.getActor());
            System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
        }

       }
    releaseFromMarket(releaseActors);
    }



    @Override
    public void takeOrder() {
        for(iActorBehaviuor actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");

            }
        }
        
    }

    @Override
    
    public void returnOrder() {
        for(iActorBehaviuor actor: queue)
        {
            if(actor.isReturnOrder())
            {
                actor.setReturnOrder(isReturnOrder());
                System.out.println(actor.getActor().getName()+" клиент вернул свой заказ ");
            }
        }
        
    }


    @Override
    public boolean isTakeOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isTakeOrder'");
    }

    @Override
    public boolean isMakeOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isMakeOrder'");
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTakeOrder'");
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setMakeOrder'");
    }

    @Override
    public Actor getActor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getActor'");
    }

    @Override
    public boolean isReturnOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isReturnOrder'");
    }

    @Override
    public void setReturnOrder(boolean returnOrder) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setReturnOrder'");
    }


    
}
