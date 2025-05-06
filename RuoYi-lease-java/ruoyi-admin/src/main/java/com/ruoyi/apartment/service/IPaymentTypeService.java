package com.ruoyi.apartment.service;

import java.util.List;
import com.ruoyi.apartment.domain.PaymentType;

/**
 * 支付方式Service接口
 * 
 * @author ruoyi
 * @date 2025-05-03
 */
public interface IPaymentTypeService 
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
     * 批量删除支付方式
     * 
     * @param ids 需要删除的支付方式主键集合
     * @return 结果
     */
    public int deletePaymentTypeByIds(Long[] ids);

    /**
     * 删除支付方式信息
     * 
     * @param id 支付方式主键
     * @return 结果
     */
    public int deletePaymentTypeById(Long id);
}
