package acme;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

import io.vertx.amqp.AmqpClientOptions;

public class AmqpConfiguration {

    @Produces
    @Named("my-topic-config")
    public AmqpClientOptions options() {
        return defaultOptions();
    }

    @Produces
    @Named("my-topic-config2")
    public AmqpClientOptions options2() {
        return defaultOptions();
    }
    
    private static final AmqpClientOptions defaultOptions() {
        return new AmqpClientOptions()
                .setHost("localhost")
                .setPort(5672)
                .setUsername("smallrye")
                .setPassword("smallrye");
    }
}
