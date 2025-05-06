package com.ruoyi.apartment.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 支付方式对象 payment_type
 * 
 * @author ruoyi
 * @date 2025-05-03
 */
public class PaymentType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 付款方式名称 */
    @Excel(name = "付款方式名称")
    private String name;

    /** 每次支付租期数 */
    @Excel(name = "每次支付租期数")
    private Long payMonthCount;

    /** 付费说明 */
    @Excel(name = "付费说明")
    private String additionalInfo;

    /** 是否删除 */
    @Excel(name = "是否删除")
    private Long isDeleted;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPayMonthCount(Long payMonthCount) 
    {
        this.payMonthCount = payMonthCount;
    }

    public Long getPayMonthCount() 
    {
        return payMonthCount;
    }
    public void setAdditionalInfo(String additionalInfo) 
    {
        this.additionalInfo = additionalInfo;
    }

    public String getAdditionalInfo() 
    {
        return additionalInfo;
    }
    public void setIsDeleted(Long isDeleted) 
    {
        this.isDeleted = isDeleted;
    }

    public Long getIsDeleted() 
    {
        return isDeleted;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("payMonthCount", getPayMonthCount())
            .append("additionalInfo", getAdditionalInfo())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("isDeleted", getIsDeleted())
            .toString();
    }
}
