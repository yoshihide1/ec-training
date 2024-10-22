package ec.training.mapper;

import ec.training.entity.OrderItemsEntity;
import ec.training.entity.example.OrderItemsEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderItemsEntityMapper {
    long countByExample(OrderItemsEntityExample example);

    int deleteByExample(OrderItemsEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderItemsEntity record);

    int insertSelective(OrderItemsEntity record);

    List<OrderItemsEntity> selectByExample(OrderItemsEntityExample example);

    OrderItemsEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderItemsEntity record, @Param("example") OrderItemsEntityExample example);

    int updateByExample(@Param("record") OrderItemsEntity record, @Param("example") OrderItemsEntityExample example);

    int updateByPrimaryKeySelective(OrderItemsEntity record);

    int updateByPrimaryKey(OrderItemsEntity record);
}