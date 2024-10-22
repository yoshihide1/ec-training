package ec.training.mapper;

import ec.training.entity.CartItemsEntity;
import ec.training.entity.example.CartItemsEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CartItemsEntityMapper {
    long countByExample(CartItemsEntityExample example);

    int deleteByExample(CartItemsEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CartItemsEntity record);

    int insertSelective(CartItemsEntity record);

    List<CartItemsEntity> selectByExample(CartItemsEntityExample example);

    CartItemsEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CartItemsEntity record, @Param("example") CartItemsEntityExample example);

    int updateByExample(@Param("record") CartItemsEntity record, @Param("example") CartItemsEntityExample example);

    int updateByPrimaryKeySelective(CartItemsEntity record);

    int updateByPrimaryKey(CartItemsEntity record);
}