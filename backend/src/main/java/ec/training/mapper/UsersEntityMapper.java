package ec.training.mapper;

import ec.training.entity.UsersEntity;
import ec.training.entity.example.UsersEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersEntityMapper {
    long countByExample(UsersEntityExample example);

    int deleteByExample(UsersEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UsersEntity record);

    int insertSelective(UsersEntity record);

    List<UsersEntity> selectByExample(UsersEntityExample example);

    UsersEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UsersEntity record, @Param("example") UsersEntityExample example);

    int updateByExample(@Param("record") UsersEntity record, @Param("example") UsersEntityExample example);

    int updateByPrimaryKeySelective(UsersEntity record);

    int updateByPrimaryKey(UsersEntity record);
}