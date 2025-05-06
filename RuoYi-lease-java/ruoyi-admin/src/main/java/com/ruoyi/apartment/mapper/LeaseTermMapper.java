package com.ruoyi.apartment.mapper;

import java.util.List;
import com.ruoyi.apartment.domain.LeaseTerm;
import org.apache.ibatis.annotations.Mapper;

/**
 * 租期Mapper接口
 * 
 * @author Asher
 * @date 2025-05-03
 */
@Mapper
public interface LeaseTermMapper 
{
    /**
     * 查询租期
     * 
     * @param id 租期主键
     * @return 租期
     */
    public LeaseTerm selectLeaseTermById(Long id);

    /**
     * 查询租期列表
     * 
     * @param leaseTerm 租期
     * @return 租期集合
     */
    public List<LeaseTerm> selectLeaseTermList(LeaseTerm leaseTerm);

    /**
     * 新增租期
     * 
     * @param leaseTerm 租期
     * @return 结果
     */
    public int insertLeaseTerm(LeaseTerm leaseTerm);

    /**
     * 修改租期
     * 
     * @param leaseTerm 租期
     * @return 结果
     */
    public int updateLeaseTerm(LeaseTerm leaseTerm);

    /**
     * 删除租期
     * 
     * @param id 租期主键
     * @return 结果
     */
    public int deleteLeaseTermById(Long id);

    /**
     * 批量删除租期
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLeaseTermByIds(Long[] ids);
}
