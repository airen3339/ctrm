

package com.smm.ctrm.domain.Report;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.smm.ctrm.domain.HibernateEntity;
import com.smm.ctrm.domain.Basis.Brand;
import com.smm.ctrm.domain.Basis.Commodity;
import com.smm.ctrm.domain.Basis.Customer;
import com.smm.ctrm.domain.Basis.Legal;
@Entity
@Table(name = "SettleDaily", schema = "Report")

public class SettleDaily extends HibernateEntity {
	private static final long serialVersionUID = 1461719402487L;
	/**
	 * 交易日期
	 */
	@Column(name = "TradeDate")
	@JsonProperty(value = "TradeDate")
	private Date TradeDate;
	/**
	 * 
	 */
	@Column(name = "CRAmount")
	@JsonProperty(value = "CRAmount")
	private BigDecimal CRAmount;
	/**
	 * 
	 */
	@Column(name = "PnLAmount")
	@JsonProperty(value = "PnLAmount")
	private BigDecimal PnLAmount;
	/**
	 * 库存金额
	 */
	@Column(name = "StorageAmount")
	@JsonProperty(value = "StorageAmount")
	private BigDecimal StorageAmount;
	/**
	 * 库存数量
	 */
	@Column(name = "StorageQuantity")
	@JsonProperty(value = "StorageQuantity")
	private BigDecimal StorageQuantity;
	/**
	 * 内部抬头标识
	 */
	@Column(name = "LegalId")
	@JsonProperty(value = "LegalId")
	private String LegalId;
//	@JsonBackReference("SettleDaily_Legal")
	@ManyToOne(fetch = FetchType.EAGER, targetEntity = Legal.class)
	@JoinColumn(name = "LegalId", insertable = false, updatable = false, foreignKey = @ForeignKey(name="none"))
	@JsonProperty(value = "Legal")
	private Legal Legal;
	/**
	 * 客户标识
	 */
	@Column(name = "CustomerId")
	@JsonProperty(value = "CustomerId")
	private String CustomerId;
//	@JsonBackReference("SettleDaily_Customer")
	@ManyToOne(fetch = FetchType.EAGER, targetEntity = Customer.class)
	@JoinColumn(name = "CustomerId", insertable = false, updatable = false, foreignKey = @ForeignKey(name="none"))
	@Fetch(FetchMode.SELECT)
	@JsonProperty(value = "Customer")
	private Customer Customer;
	/**
	 * 品种标识
	 */
	@Column(name = "CommodityId")
	@JsonProperty(value = "CommodityId")
	private String CommodityId;
//	@JsonBackReference("SettleDaily_Commodity")
	@ManyToOne(fetch = FetchType.EAGER, targetEntity = Commodity.class)
	@JoinColumn(name = "CommodityId", insertable = false, updatable = false, foreignKey = @ForeignKey(name="none"))
	@JsonProperty(value = "Commodity")
	private Commodity Commodity;
	/**
	 * 品牌
	 */
	@Column(name = "BrandId")
	@JsonProperty(value = "BrandId")
	private String BrandId;
	@ManyToOne(fetch = FetchType.EAGER, targetEntity = Brand.class)
	@JoinColumn(name = "BrandId", insertable = false, updatable = false, foreignKey = @ForeignKey(name="none"))
	@Fetch(FetchMode.SELECT)
	@JsonProperty(value = "Brand")
	private Brand Brand;
	
	public Date getTradeDate(){
		return TradeDate;
	}
	public void setTradeDate(Date TradeDate){
		this.TradeDate=TradeDate;
	}
	
	public BigDecimal getCRAmount(){
		return CRAmount;
	}
	public void setCRAmount(BigDecimal CRAmount){
		this.CRAmount=CRAmount;
	}
	
	public BigDecimal getPnLAmount(){
		return PnLAmount;
	}
	public void setPnLAmount(BigDecimal PnLAmount){
		this.PnLAmount=PnLAmount;
	}
	
	public BigDecimal getStorageAmount(){
		return StorageAmount;
	}
	public void setStorageAmount(BigDecimal StorageAmount){
		this.StorageAmount=StorageAmount;
	}
	
	public BigDecimal getStorageQuantity(){
		return StorageQuantity;
	}
	public void setStorageQuantity(BigDecimal StorageQuantity){
		this.StorageQuantity=StorageQuantity;
	}
	
	public String getLegalId(){
		return LegalId;
	}
	public void setLegalId(String LegalId){
		this.LegalId=LegalId;
	}
	
	public Legal getLegal(){
		return Legal;
	}
	public void setLegal(Legal Legal){
		this.Legal=Legal;
	}
	
	public String getCustomerId(){
		return CustomerId;
	}
	public void setCustomerId(String CustomerId){
		this.CustomerId=CustomerId;
	}
	
	public Customer getCustomer(){
		return Customer;
	}
	public void setCustomer(Customer Customer){
		this.Customer=Customer;
	}
	
	public String getCommodityId(){
		return CommodityId;
	}
	public void setCommodityId(String CommodityId){
		this.CommodityId=CommodityId;
	}
	
	public Commodity getCommodity(){
		return Commodity;
	}
	public void setCommodity(Commodity Commodity){
		this.Commodity=Commodity;
	}
	
	public String getBrandId(){
		return BrandId;
	}
	public void setBrandId(String BrandId){
		this.BrandId=BrandId;
	}
	
	public Brand getBrand(){
		return Brand;
	}
	public void setBrand(Brand Brand){
		this.Brand=Brand;
	}

}