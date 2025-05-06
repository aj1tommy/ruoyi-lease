package com.ruoyi.apartment.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.apartment.mapper.LeaseTermMapper;
import com.ruoyi.apartment.domain.LeaseTerm;
import com.ruoyi.apartment.service.ILeaseTermService;

/**
 * 租期Service业务层处理
 * 
 * @author Asher
 * @date 2025-05-03
 */
@Service
public class LeaseTermServiceImpl implements ILeaseTermService 
{
    @Autowired
    private LeaseTermMapper leaseTermMapper;

    /**
     * 查询租期
     * 
     * @param id 租期主键
     * @return 租期
     */
    @Override
    public LeaseTerm selectLeaseTermById(Long id)
    {
        return leaseTermMapper.selectLeaseTermById(id);
    }

    /**
     * 查询租期列表
     * 
     * @param leaseTerm 租期
     * @return 租期
     */
    @Override
    public List<LeaseTerm> selectLeaseTermList(LeaseTerm leaseTerm)
    {
        return leaseTermMapper.selectLeaseTermList(leaseTerm);
    }

    /**
     * 新增租期
     * 
     * @param leaseTerm 租期
     * @return 结果
     */
    @Override
    public int insertLeaseTerm(LeaseTerm leaseTerm)
    {
        leaseTerm.setCreateTime(DateUtils.getNowDate());
        return leaseTermMapper.insertLeaseTerm(leaseTerm);
    }

    /**
     * 修改租期
     * 
     * @param leaseTerm 租期
     * @return 结果
     */
    @Override
    public int updateLeaseTerm(LeaseTerm leaseTerm)
    {
        leaseTerm.setUpdateTime(DateUtils.getNowDate());
        return leaseTermMapper.updateLeaseTerm(leaseTerm);
    }

    /**
     * 批量删除租期
     * 
     * @param ids 需要删除的租期主键
     * @return 结果
     */
    @Override
    public int deleteLeaseTermByIds(Long[] ids)
    {
        return leaseTermMapper.deleteLeaseTermByIds(ids);
    }

    /**
     * 删除租期信息
     * 
     * @param id 租期主键
     * @return 结果
     */
    @Override
    public int deleteLeaseTermById(Long id)
    {
        return leaseTermMapper.deleteLeaseTermById(id);
    }
}
