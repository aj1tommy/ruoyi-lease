package com.ruoyi.apartment.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.apartment.mapper.LabelInfoMapper;
import com.ruoyi.apartment.domain.LabelInfo;
import com.ruoyi.apartment.service.ILabelInfoService;

/**
 * 标签信息Service业务层处理
 * 
 * @author Asher
 * @date 2025-05-03
 */
@Service
public class LabelInfoServiceImpl implements ILabelInfoService 
{
    @Autowired
    private LabelInfoMapper labelInfoMapper;

    /**
     * 查询标签信息
     * 
     * @param id 标签信息主键
     * @return 标签信息
     */
    @Override
    public LabelInfo selectLabelInfoById(Long id)
    {
        return labelInfoMapper.selectLabelInfoById(id);
    }

    /**
     * 查询标签信息列表
     * 
     * @param labelInfo 标签信息
     * @return 标签信息
     */
    @Override
    public List<LabelInfo> selectLabelInfoList(LabelInfo labelInfo)
    {
        return labelInfoMapper.selectLabelInfoList(labelInfo);
    }

    /**
     * 新增标签信息
     * 
     * @param labelInfo 标签信息
     * @return 结果
     */
    @Override
    public int insertLabelInfo(LabelInfo labelInfo)
    {
        labelInfo.setCreateTime(DateUtils.getNowDate());
        return labelInfoMapper.insertLabelInfo(labelInfo);
    }

    /**
     * 修改标签信息
     * 
     * @param labelInfo 标签信息
     * @return 结果
     */
    @Override
    public int updateLabelInfo(LabelInfo labelInfo)
    {
        labelInfo.setUpdateTime(DateUtils.getNowDate());
        return labelInfoMapper.updateLabelInfo(labelInfo);
    }

    /**
     * 批量删除标签信息
     * 
     * @param ids 需要删除的标签信息主键
     * @return 结果
     */
    @Override
    public int deleteLabelInfoByIds(Long[] ids)
    {
        return labelInfoMapper.deleteLabelInfoByIds(ids);
    }

    /**
     * 删除标签信息信息
     * 
     * @param id 标签信息主键
     * @return 结果
     */
    @Override
    public int deleteLabelInfoById(Long id)
    {
        return labelInfoMapper.deleteLabelInfoById(id);
    }
}
