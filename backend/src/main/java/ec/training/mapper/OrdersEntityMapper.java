package ec.training.mapper;

import ec.training.entity.OrdersEntity;
import ec.training.entity.example.OrdersEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrdersEntityMapper {
    long countByExample(OrdersEntityExample example);

    int deleteByExample(OrdersEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrdersEntity record);

    int insertSelective(OrdersEntity record);

    List<OrdersEntity> selectByExample(OrdersEntityExample example);

    OrdersEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrdersEntity record, @Param("example") OrdersEntityExample example);

    int updateByExample(@Param("record") OrdersEntity record, @Param("example") OrdersEntityExample example);

    int updateByPrimaryKeySelective(OrdersEntity record);

    int updateByPrimaryKey(OrdersEntity record);
}