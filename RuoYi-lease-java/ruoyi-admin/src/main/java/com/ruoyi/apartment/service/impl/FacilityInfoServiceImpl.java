package com.ruoyi.apartment.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.apartment.mapper.FacilityInfoMapper;
import com.ruoyi.apartment.domain.FacilityInfo;
import com.ruoyi.apartment.service.IFacilityInfoService;

/**
 * 配套信息Service业务层处理
 * 
 * @author Asher
 * @date 2025-05-03
 */
@Service
public class FacilityInfoServiceImpl implements IFacilityInfoService 
{
    @Autowired
    private FacilityInfoMapper facilityInfoMapper;

    /**
     * 查询配套信息
     * 
     * @param id 配套信息主键
     * @return 配套信息
     */
    @Override
    public FacilityInfo selectFacilityInfoById(Long id)
    {
        return facilityInfoMapper.selectFacilityInfoById(id);
    }

    /**
     * 查询配套信息列表
     * 
     * @param facilityInfo 配套信息
     * @return 配套信息
     */
    @Override
    public List<FacilityInfo> selectFacilityInfoList(FacilityInfo facilityInfo)
    {
        return facilityInfoMapper.selectFacilityInfoList(facilityInfo);
    }

    /**
     * 新增配套信息
     * 
     * @param facilityInfo 配套信息
     * @return 结果
     */
    @Override
    public int insertFacilityInfo(FacilityInfo facilityInfo)
    {
        facilityInfo.setCreateTime(DateUtils.getNowDate());
        return facilityInfoMapper.insertFacilityInfo(facilityInfo);
    }

    /**
     * 修改配套信息
     * 
     * @param facilityInfo 配套信息
     * @return 结果
     */
    @Override
    public int updateFacilityInfo(FacilityInfo facilityInfo)
    {
        facilityInfo.setUpdateTime(DateUtils.getNowDate());
        return facilityInfoMapper.updateFacilityInfo(facilityInfo);
    }

    /**
     * 批量删除配套信息
     * 
     * @param ids 需要删除的配套信息主键
     * @return 结果
     */
    @Override
    public int deleteFacilityInfoByIds(Long[] ids)
    {
        return facilityInfoMapper.deleteFacilityInfoByIds(ids);
    }

    /**
     * 删除配套信息信息
     * 
     * @param id 配套信息主键
     * @return 结果
     */
    @Override
    public int deleteFacilityInfoById(Long id)
    {
        return facilityInfoMapper.deleteFacilityInfoById(id);
    }
}
