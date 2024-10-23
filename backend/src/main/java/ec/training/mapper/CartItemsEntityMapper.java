package ec.training.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import ec.training.entity.CartItemsEntity;
import ec.training.entity.example.CartItemsEntityExample;

@Mapper
public interface CartItemsEntityMapper {
        long countByExample(CartItemsEntityExample example);

        int deleteByExample(CartItemsEntityExample example);

        int deleteByPrimaryKey(Long id);

        int insert(CartItemsEntity record);

        int insertSelective(CartItemsEntity record);

        List<CartItemsEntity> selectByExample(CartItemsEntityExample example);

        CartItemsEntity selectByPrimaryKey(Long id);

        int updateByExampleSelective(@Param("record") CartItemsEntity record,
                        @Param("example") CartItemsEntityExample example);

        int updateByExample(@Param("record") CartItemsEntity record, @Param("example") CartItemsEntityExample example);

        int updateByPrimaryKeySelective(CartItemsEntity record);

        int updateByPrimaryKey(CartItemsEntity record);

        List<CartItemsEntity> selectCartItemsByCartId(@Param("cartId") Long cartId);

        /**
         * 対象のユーザーのカートItemを削除する
         * 
         * @param userId
         */
        void deleteCartItemsByCartId(@Param("cartId") Long cartId);

        /**
         * 一括登録する
         * 
         * @param items
         */
        void bulkInsert(List<CartItemsEntity> items);
}