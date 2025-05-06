package com.ruoyi.apartment.mapper;

import java.util.List;
import com.ruoyi.apartment.domain.PaymentType;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付方式Mapper接口
 * 
 * @author ruoyi
 * @date 2025-05-03
 */
@Mapper
public interface PaymentTypeMapper 
{
    /**
     * 查询支付方式
     * 
     * @param id 支付方式主键
     * @return 支付方式
     */
    public PaymentType selectPaymentTypeById(Long id);

    /**
     * 查询支付方式列表
     * 
     * @param paymentType 支付方式
     * @return 支付方式集合
     */
    public List<PaymentType> selectPaymentTypeList(PaymentType paymentType);

    /**
     * 新增支付方式
     * 
     * @param paymentType 支付方式
     * @return 结果
     */
    public int insertPaymentType(PaymentType paymentType);

    /**
     * 修改支付方式
     * 
     * @param paymentType 支付方式
     * @return 结果
     */
    public int updatePaymentType(PaymentType paymentType);

    /**
     * 删除支付方式
     * 
     * @param id 支付方式主键
     * @return 结果
     */
    public int deletePaymentTypeById(Long id);

    /**
     * 批量删除支付方式
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePaymentTypeByIds(Long[] ids);
}
