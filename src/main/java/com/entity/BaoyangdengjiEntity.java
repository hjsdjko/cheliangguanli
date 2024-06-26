package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 保养登记
 *
 * @author 
 * @email
 */
@TableName("baoyangdengji")
public class BaoyangdengjiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BaoyangdengjiEntity() {

	}

	public BaoyangdengjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 员工
     */
    @TableField(value = "yuangong_id")

    private Integer yuangongId;


    /**
     * 保养登记唯一编号
     */
    @TableField(value = "baoyangdengji_uuid_number")

    private String baoyangdengjiUuidNumber;


    /**
     * 保养名称
     */
    @TableField(value = "baoyangdengji_name")

    private String baoyangdengjiName;


    /**
     * 保养类型
     */
    @TableField(value = "baoyangdengji_types")

    private Integer baoyangdengjiTypes;


    /**
     * 保养详情
     */
    @TableField(value = "baoyangdengji_content")

    private String baoyangdengjiContent;


    /**
     * 保养时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "baoyangdengji_time")

    private Date baoyangdengjiTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：员工
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }


    /**
	 * 获取：员工
	 */

    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 设置：保养登记唯一编号
	 */
    public String getBaoyangdengjiUuidNumber() {
        return baoyangdengjiUuidNumber;
    }


    /**
	 * 获取：保养登记唯一编号
	 */

    public void setBaoyangdengjiUuidNumber(String baoyangdengjiUuidNumber) {
        this.baoyangdengjiUuidNumber = baoyangdengjiUuidNumber;
    }
    /**
	 * 设置：保养名称
	 */
    public String getBaoyangdengjiName() {
        return baoyangdengjiName;
    }


    /**
	 * 获取：保养名称
	 */

    public void setBaoyangdengjiName(String baoyangdengjiName) {
        this.baoyangdengjiName = baoyangdengjiName;
    }
    /**
	 * 设置：保养类型
	 */
    public Integer getBaoyangdengjiTypes() {
        return baoyangdengjiTypes;
    }


    /**
	 * 获取：保养类型
	 */

    public void setBaoyangdengjiTypes(Integer baoyangdengjiTypes) {
        this.baoyangdengjiTypes = baoyangdengjiTypes;
    }
    /**
	 * 设置：保养详情
	 */
    public String getBaoyangdengjiContent() {
        return baoyangdengjiContent;
    }


    /**
	 * 获取：保养详情
	 */

    public void setBaoyangdengjiContent(String baoyangdengjiContent) {
        this.baoyangdengjiContent = baoyangdengjiContent;
    }
    /**
	 * 设置：保养时间
	 */
    public Date getBaoyangdengjiTime() {
        return baoyangdengjiTime;
    }


    /**
	 * 获取：保养时间
	 */

    public void setBaoyangdengjiTime(Date baoyangdengjiTime) {
        this.baoyangdengjiTime = baoyangdengjiTime;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Baoyangdengji{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", yuangongId=" + yuangongId +
            ", baoyangdengjiUuidNumber=" + baoyangdengjiUuidNumber +
            ", baoyangdengjiName=" + baoyangdengjiName +
            ", baoyangdengjiTypes=" + baoyangdengjiTypes +
            ", baoyangdengjiContent=" + baoyangdengjiContent +
            ", baoyangdengjiTime=" + baoyangdengjiTime +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
