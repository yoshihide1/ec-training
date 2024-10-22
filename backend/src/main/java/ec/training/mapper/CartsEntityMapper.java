package ec.training.mapper;

import ec.training.entity.CartsEntity;
import ec.training.entity.example.CartsEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CartsEntityMapper {
    long countByExample(CartsEntityExample example);

    int deleteByExample(CartsEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CartsEntity record);

    int insertSelective(CartsEntity record);

    List<CartsEntity> selectByExample(CartsEntityExample example);

    CartsEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CartsEntity record, @Param("example") CartsEntityExample example);

    int updateByExample(@Param("record") CartsEntity record, @Param("example") CartsEntityExample example);

    int updateByPrimaryKeySelective(CartsEntity record);

    int updateByPrimaryKey(CartsEntity record);
}