package templateerrod.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import templateerrod.domain.*;
import templateerrod.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productName;
    private String userId;
    private Integer qty;
    private String status;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
//>>> DDD / Domain Event
