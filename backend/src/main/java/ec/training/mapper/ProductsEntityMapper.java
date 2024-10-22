package ec.training.mapper;

import ec.training.entity.ProductsEntity;
import ec.training.entity.example.ProductsEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductsEntityMapper {
    long countByExample(ProductsEntityExample example);

    int deleteByExample(ProductsEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductsEntity record);

    int insertSelective(ProductsEntity record);

    List<ProductsEntity> selectByExample(ProductsEntityExample example);

    ProductsEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductsEntity record, @Param("example") ProductsEntityExample example);

    int updateByExample(@Param("record") ProductsEntity record, @Param("example") ProductsEntityExample example);

    int updateByPrimaryKeySelective(ProductsEntity record);

    int updateByPrimaryKey(ProductsEntity record);
}