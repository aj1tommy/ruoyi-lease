package com.ruoyi.apartment.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.apartment.mapper.PaymentTypeMapper;
import com.ruoyi.apartment.domain.PaymentType;
import com.ruoyi.apartment.service.IPaymentTypeService;

/**
 * 支付方式Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-05-03
 */
@Service
public class PaymentTypeServiceImpl implements IPaymentTypeService 
{
    @Autowired
    private PaymentTypeMapper paymentTypeMapper;

    /**
     * 查询支付方式
     * 
     * @param id 支付方式主键
     * @return 支付方式
     */
    @Override
    public PaymentType selectPaymentTypeById(Long id)
    {
        return paymentTypeMapper.selectPaymentTypeById(id);
    }

    /**
     * 查询支付方式列表
     * 
     * @param paymentType 支付方式
     * @return 支付方式
     */
    @Override
    public List<PaymentType> selectPaymentTypeList(PaymentType paymentType)
    {
        return paymentTypeMapper.selectPaymentTypeList(paymentType);
    }

    /**
     * 新增支付方式
     * 
     * @param paymentType 支付方式
     * @return 结果
     */
    @Override
    public int insertPaymentType(PaymentType paymentType)
    {
        paymentType.setCreateTime(DateUtils.getNowDate());
        return paymentTypeMapper.insertPaymentType(paymentType);
    }

    /**
     * 修改支付方式
     * 
     * @param paymentType 支付方式
     * @return 结果
     */
    @Override
    public int updatePaymentType(PaymentType paymentType)
    {
        paymentType.setUpdateTime(DateUtils.getNowDate());
        return paymentTypeMapper.updatePaymentType(paymentType);
    }

    /**
     * 批量删除支付方式
     * 
     * @param ids 需要删除的支付方式主键
     * @return 结果
     */
    @Override
    public int deletePaymentTypeByIds(Long[] ids)
    {
        return paymentTypeMapper.deletePaymentTypeByIds(ids);
    }

    /**
     * 删除支付方式信息
     * 
     * @param id 支付方式主键
     * @return 结果
     */
    @Override
    public int deletePaymentTypeById(Long id)
    {
        return paymentTypeMapper.deletePaymentTypeById(id);
    }
}
