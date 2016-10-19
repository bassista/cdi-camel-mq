import import org.apache.activemq.camel.component.ActiveMQComponent;

class Produces {
 
    @Produces
    @Named("jms")
    @ApplicationScoped
    ActiveMQComponent getActiveMQComponent() {
        ActiveMQComponent component = new ActiveMQComponent();
        component.setConnectionFactory(new ActiveMQConnectionFactory("failover://tcp://broker-amq-tcp.amq-demo.svc.cluster.local:61616"));
        component.setUserName("amq-demo-user");
        component.setPassword("password");
        return component;
    }
}
