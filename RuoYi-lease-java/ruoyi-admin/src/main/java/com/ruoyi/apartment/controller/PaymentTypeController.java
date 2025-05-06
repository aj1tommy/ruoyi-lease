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
import com.ruoyi.apartment.domain.PaymentType;
import com.ruoyi.apartment.service.IPaymentTypeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 支付方式Controller
 * 
 * @author ruoyi
 * @date 2025-05-03
 */
@RestController
@RequestMapping("/apartment/paymenttype")
public class PaymentTypeController extends BaseController
{
    @Autowired
    private IPaymentTypeService paymentTypeService;

    /**
     * 查询支付方式列表
     */
    @PreAuthorize("@ss.hasPermi('apartment:paymenttype:list')")
    @GetMapping("/list")
    public TableDataInfo list(PaymentType paymentType)
    {
        startPage();
        List<PaymentType> list = paymentTypeService.selectPaymentTypeList(paymentType);
        return getDataTable(list);
    }

    /**
     * 导出支付方式列表
     */
    @PreAuthorize("@ss.hasPermi('apartment:paymenttype:export')")
    @Log(title = "支付方式", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PaymentType paymentType)
    {
        List<PaymentType> list = paymentTypeService.selectPaymentTypeList(paymentType);
        ExcelUtil<PaymentType> util = new ExcelUtil<PaymentType>(PaymentType.class);
        util.exportExcel(response, list, "支付方式数据");
    }

    /**
     * 获取支付方式详细信息
     */
    @PreAuthorize("@ss.hasPermi('apartment:paymenttype:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(paymentTypeService.selectPaymentTypeById(id));
    }

    /**
     * 新增支付方式
     */
    @PreAuthorize("@ss.hasPermi('apartment:paymenttype:add')")
    @Log(title = "支付方式", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PaymentType paymentType)
    {
        return toAjax(paymentTypeService.insertPaymentType(paymentType));
    }

    /**
     * 修改支付方式
     */
    @PreAuthorize("@ss.hasPermi('apartment:paymenttype:edit')")
    @Log(title = "支付方式", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PaymentType paymentType)
    {
        return toAjax(paymentTypeService.updatePaymentType(paymentType));
    }

    /**
     * 删除支付方式
     */
    @PreAuthorize("@ss.hasPermi('apartment:paymenttype:remove')")
    @Log(title = "支付方式", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(paymentTypeService.deletePaymentTypeByIds(ids));
    }
}
