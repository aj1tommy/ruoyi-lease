package com.ruoyi.apartment.service;

import java.util.List;
import com.ruoyi.apartment.domain.FacilityInfo;

/**
 * 配套信息Service接口
 * 
 * @author Asher
 * @date 2025-05-03
 */
public interface IFacilityInfoService 
{
    /**
     * 查询配套信息
     * 
     * @param id 配套信息主键
     * @return 配套信息
     */
    public FacilityInfo selectFacilityInfoById(Long id);

    /**
     * 查询配套信息列表
     * 
     * @param facilityInfo 配套信息
     * @return 配套信息集合
     */
    public List<FacilityInfo> selectFacilityInfoList(FacilityInfo facilityInfo);

    /**
     * 新增配套信息
     * 
     * @param facilityInfo 配套信息
     * @return 结果
     */
    public int insertFacilityInfo(FacilityInfo facilityInfo);

    /**
     * 修改配套信息
     * 
     * @param facilityInfo 配套信息
     * @return 结果
     */
    public int updateFacilityInfo(FacilityInfo facilityInfo);

    /**
     * 批量删除配套信息
     * 
     * @param ids 需要删除的配套信息主键集合
     * @return 结果
     */
    public int deleteFacilityInfoByIds(Long[] ids);

    /**
     * 删除配套信息信息
     * 
     * @param id 配套信息主键
     * @return 结果
     */
    public int deleteFacilityInfoById(Long id);
}
