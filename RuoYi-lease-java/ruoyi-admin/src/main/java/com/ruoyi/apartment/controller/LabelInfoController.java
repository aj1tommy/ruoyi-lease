package com.ruoyi.apartment.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.apartment.domain.LabelInfo;
import com.ruoyi.apartment.service.ILabelInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 标签信息Controller
 * 
 * @author Asher
 * @date 2025-05-03
 */
@RestController
@RequestMapping("/apartment/label")
public class LabelInfoController extends BaseController
{
    @Autowired
    private ILabelInfoService labelInfoService;

    /**
     * 查询标签信息列表
     */
    @PreAuthorize("@ss.hasPermi('apartment:label:list')")
    @GetMapping("/list")
    public TableDataInfo list(LabelInfo labelInfo)
    {
        startPage();
        List<LabelInfo> list = labelInfoService.selectLabelInfoList(labelInfo);
        return getDataTable(list);
    }

    /**
     * 导出标签信息列表
     */
    @PreAuthorize("@ss.hasPermi('apartment:label:export')")
    @Log(title = "标签信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LabelInfo labelInfo)
    {
        List<LabelInfo> list = labelInfoService.selectLabelInfoList(labelInfo);
        ExcelUtil<LabelInfo> util = new ExcelUtil<LabelInfo>(LabelInfo.class);
        util.exportExcel(response, list, "标签信息数据");
    }

    /**
     * 获取标签信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('apartment:label:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(labelInfoService.selectLabelInfoById(id));
    }

    /**
     * 新增标签信息
     */
    @PreAuthorize("@ss.hasPermi('apartment:label:add')")
    @Log(title = "标签信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LabelInfo labelInfo)
    {
        return toAjax(labelInfoService.insertLabelInfo(labelInfo));
    }

    /**
     * 修改标签信息
     */
    @PreAuthorize("@ss.hasPermi('apartment:label:edit')")
    @Log(title = "标签信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LabelInfo labelInfo)
    {
        return toAjax(labelInfoService.updateLabelInfo(labelInfo));
    }

    /**
     * 删除标签信息
     */
    @PreAuthorize("@ss.hasPermi('apartment:label:remove')")
    @Log(title = "标签信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(labelInfoService.deleteLabelInfoByIds(ids));
    }
}
