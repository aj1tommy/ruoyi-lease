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
import com.ruoyi.apartment.domain.FacilityInfo;
import com.ruoyi.apartment.service.IFacilityInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 配套信息Controller
 * 
 * @author Asher
 * @date 2025-05-03
 */
@RestController
@RequestMapping("/apartment/facility")
public class FacilityInfoController extends BaseController
{
    @Autowired
    private IFacilityInfoService facilityInfoService;

    /**
     * 查询配套信息列表
     */
    @PreAuthorize("@ss.hasPermi('apartment:facility:list')")
    @GetMapping("/list")
    public TableDataInfo list(FacilityInfo facilityInfo)
    {
        startPage();
        List<FacilityInfo> list = facilityInfoService.selectFacilityInfoList(facilityInfo);
        return getDataTable(list);
    }

    /**
     * 导出配套信息列表
     */
    @PreAuthorize("@ss.hasPermi('apartment:facility:export')")
    @Log(title = "配套信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FacilityInfo facilityInfo)
    {
        List<FacilityInfo> list = facilityInfoService.selectFacilityInfoList(facilityInfo);
        ExcelUtil<FacilityInfo> util = new ExcelUtil<FacilityInfo>(FacilityInfo.class);
        util.exportExcel(response, list, "配套信息数据");
    }

    /**
     * 获取配套信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('apartment:facility:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(facilityInfoService.selectFacilityInfoById(id));
    }

    /**
     * 新增配套信息
     */
    @PreAuthorize("@ss.hasPermi('apartment:facility:add')")
    @Log(title = "配套信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FacilityInfo facilityInfo)
    {
        return toAjax(facilityInfoService.insertFacilityInfo(facilityInfo));
    }

    /**
     * 修改配套信息
     */
    @PreAuthorize("@ss.hasPermi('apartment:facility:edit')")
    @Log(title = "配套信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FacilityInfo facilityInfo)
    {
        return toAjax(facilityInfoService.updateFacilityInfo(facilityInfo));
    }

    /**
     * 删除配套信息
     */
    @PreAuthorize("@ss.hasPermi('apartment:facility:remove')")
    @Log(title = "配套信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(facilityInfoService.deleteFacilityInfoByIds(ids));
    }
}
