package by.bsuir.renTrip.repository.specification.order;

import by.bsuir.renTrip.repository.specification.UpdateSpecification;

import java.util.Date;

public class OrderUpdateStatusAndTimeByIdSpecification implements UpdateSpecification {
    private static final String UPDATE_STATUS = "UPDATE orders SET orders.status = 1, time = '%s' WHERE id ='%s'";
    private int id;

    public OrderUpdateStatusAndTimeByIdSpecification(int id) {
        this.id = id;
    }

    @Override
    public String specify() {
        return String.format(UPDATE_STATUS, new Date().getTime(), id);
    }
}
