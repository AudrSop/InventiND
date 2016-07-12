/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.inventi.playground;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

/**
 *
 * @author Burbulas
 */
public class AggregationCounter implements AggregationStrategy {

    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {

        if (oldExchange == null) {
            String newBody = newExchange.getIn().getBody(String.class);
            String body = (newExchange.getProperty("CamelSplitIndex", Integer.class) +1) +". " + newBody + "\n";
            newExchange.getIn().setBody(body);
            return newExchange;
        }

        String oldBody = oldExchange.getIn().getBody(String.class);
        String newBody = newExchange.getIn().getBody(String.class);
        String body = oldBody + (newExchange.getProperty("CamelSplitIndex", Integer.class) +1) + ". " + newBody + "\n";
        oldExchange.getIn().setBody(body);

        return oldExchange;
    }

}
