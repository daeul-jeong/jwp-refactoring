package kitchenpos.repository;

import kitchenpos.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
	boolean existsByOrderTableIdAndOrderStatusIn(Long orderTableId, List<String> asList);

	boolean existsByOrderTableIdInAndOrderStatusIn(List<Long> orderTableIds, List<String> asList);
}
