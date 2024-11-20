package templateerrod.domain;

import java.util.*;
import lombok.*;
import templateerrod.domain.*;
import templateerrod.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productName;
    private String userId;
    private Integer qty;
    private String status;
}
