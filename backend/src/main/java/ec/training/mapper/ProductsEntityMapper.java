package ec.training.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import ec.training.entity.ProductsEntity;
import ec.training.entity.example.ProductsEntityExample;

@Mapper
public interface ProductsEntityMapper {
    long countByExample(ProductsEntityExample example);

    int deleteByExample(ProductsEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductsEntity record);

    int insertSelective(ProductsEntity record);

    List<ProductsEntity> selectByExample(ProductsEntityExample example);

    Optional<ProductsEntity> selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductsEntity record,
            @Param("example") ProductsEntityExample example);

    int updateByExample(@Param("record") ProductsEntity record, @Param("example") ProductsEntityExample example);

    int updateByPrimaryKeySelective(ProductsEntity record);

    int updateByPrimaryKey(ProductsEntity record);

    @Select("select * from products")
    List<ProductsEntity> selectAll();
}