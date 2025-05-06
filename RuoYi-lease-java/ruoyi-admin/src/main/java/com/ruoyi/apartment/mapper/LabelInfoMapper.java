package com.ruoyi.apartment.mapper;

import java.util.List;
import com.ruoyi.apartment.domain.LabelInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 标签信息Mapper接口
 * 
 * @author Asher
 * @date 2025-05-03
 */
@Mapper
public interface LabelInfoMapper 
{
    /**
     * 查询标签信息
     * 
     * @param id 标签信息主键
     * @return 标签信息
     */
    public LabelInfo selectLabelInfoById(Long id);

    /**
     * 查询标签信息列表
     * 
     * @param labelInfo 标签信息
     * @return 标签信息集合
     */
    public List<LabelInfo> selectLabelInfoList(LabelInfo labelInfo);

    /**
     * 新增标签信息
     * 
     * @param labelInfo 标签信息
     * @return 结果
     */
    public int insertLabelInfo(LabelInfo labelInfo);

    /**
     * 修改标签信息
     * 
     * @param labelInfo 标签信息
     * @return 结果
     */
    public int updateLabelInfo(LabelInfo labelInfo);

    /**
     * 删除标签信息
     * 
     * @param id 标签信息主键
     * @return 结果
     */
    public int deleteLabelInfoById(Long id);

    /**
     * 批量删除标签信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLabelInfoByIds(Long[] ids);
}
