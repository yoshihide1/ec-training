package ec.training.mapper;

import ec.training.entity.PaymentsEntity;
import ec.training.entity.example.PaymentsEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentsEntityMapper {
    long countByExample(PaymentsEntityExample example);

    int deleteByExample(PaymentsEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PaymentsEntity record);

    int insertSelective(PaymentsEntity record);

    List<PaymentsEntity> selectByExample(PaymentsEntityExample example);

    PaymentsEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PaymentsEntity record, @Param("example") PaymentsEntityExample example);

    int updateByExample(@Param("record") PaymentsEntity record, @Param("example") PaymentsEntityExample example);

    int updateByPrimaryKeySelective(PaymentsEntity record);

    int updateByPrimaryKey(PaymentsEntity record);
}