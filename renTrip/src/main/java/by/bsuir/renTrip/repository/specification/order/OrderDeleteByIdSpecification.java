package by.bsuir.renTrip.repository.specification.order;

import by.bsuir.renTrip.repository.specification.UpdateSpecification;

public class OrderDeleteByIdSpecification implements UpdateSpecification {
    private static final String DELETE = "DELETE FROM orders WHERE id ='%s'";
    private int id;

    public OrderDeleteByIdSpecification(int id) {
        this.id = id;
    }

    @Override
    public String specify() {
        return String.format(DELETE, id);
    }
}
