package ec.training.mapper;

import ec.training.entity.InventoryEntity;
import ec.training.entity.example.InventoryEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InventoryEntityMapper {
    long countByExample(InventoryEntityExample example);

    int deleteByExample(InventoryEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InventoryEntity record);

    int insertSelective(InventoryEntity record);

    List<InventoryEntity> selectByExample(InventoryEntityExample example);

    InventoryEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InventoryEntity record, @Param("example") InventoryEntityExample example);

    int updateByExample(@Param("record") InventoryEntity record, @Param("example") InventoryEntityExample example);

    int updateByPrimaryKeySelective(InventoryEntity record);

    int updateByPrimaryKey(InventoryEntity record);
}