package cinema.dao;

import cinema.model.Order;
import cinema.model.User;
import java.util.List;
import java.util.Optional;

public interface OrderDao {
    Order add(Order order);

    Optional<Order> get(Long id);

    void update(Order order);

    List<Order> getByUser(User user);
}
