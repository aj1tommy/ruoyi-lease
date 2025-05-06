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
import com.ruoyi.apartment.domain.LeaseTerm;
import com.ruoyi.apartment.service.ILeaseTermService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 租期Controller
 * 
 * @author Asher
 * @date 2025-05-03
 */
@RestController
@RequestMapping("/apartment/term")
public class LeaseTermController extends BaseController
{
    @Autowired
    private ILeaseTermService leaseTermService;

    /**
     * 查询租期列表
     */
    @PreAuthorize("@ss.hasPermi('apartment:term:list')")
    @GetMapping("/list")
    public TableDataInfo list(LeaseTerm leaseTerm)
    {
        startPage();
        List<LeaseTerm> list = leaseTermService.selectLeaseTermList(leaseTerm);
        return getDataTable(list);
    }

    /**
     * 导出租期列表
     */
    @PreAuthorize("@ss.hasPermi('apartment:term:export')")
    @Log(title = "租期", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LeaseTerm leaseTerm)
    {
        List<LeaseTerm> list = leaseTermService.selectLeaseTermList(leaseTerm);
        ExcelUtil<LeaseTerm> util = new ExcelUtil<LeaseTerm>(LeaseTerm.class);
        util.exportExcel(response, list, "租期数据");
    }

    /**
     * 获取租期详细信息
     */
    @PreAuthorize("@ss.hasPermi('apartment:term:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(leaseTermService.selectLeaseTermById(id));
    }

    /**
     * 新增租期
     */
    @PreAuthorize("@ss.hasPermi('apartment:term:add')")
    @Log(title = "租期", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LeaseTerm leaseTerm)
    {
        return toAjax(leaseTermService.insertLeaseTerm(leaseTerm));
    }

    /**
     * 修改租期
     */
    @PreAuthorize("@ss.hasPermi('apartment:term:edit')")
    @Log(title = "租期", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LeaseTerm leaseTerm)
    {
        return toAjax(leaseTermService.updateLeaseTerm(leaseTerm));
    }

    /**
     * 删除租期
     */
    @PreAuthorize("@ss.hasPermi('apartment:term:remove')")
    @Log(title = "租期", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(leaseTermService.deleteLeaseTermByIds(ids));
    }
}
