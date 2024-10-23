package ec.training.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import ec.training.entity.CartsEntity;
import ec.training.entity.example.CartsEntityExample;

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

    /**
     * 
     * @param userId
     * @return ユーザーに紐づくカート
     */
    Optional<CartsEntity> selectByUserId(Integer userId);

}