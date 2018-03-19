package com.example.bharat.cryptomanager.repository.network.model;

import com.google.gson.annotations.SerializedName;

public class Prices{

	@SerializedName("ZRX")
	private String zRX;

	@SerializedName("AE")
	private String aE;

	@SerializedName("BCH")
	private String bCH;

	@SerializedName("OMG")
	private String oMG;

	@SerializedName("GNT")
	private String gNT;

	@SerializedName("BTC")
	private String bTC;

	@SerializedName("BAT")
	private String bAT;

	@SerializedName("XRP")
	private String xRP;

	@SerializedName("ETH")
	private String eTH;

	@SerializedName("LTC")
	private String lTC;

	@SerializedName("TRX")
	private double tRX;

	@SerializedName("MIOTA")
	private double mIOTA;

	@SerializedName("REQ")
	private String rEQ;

	public void setZRX(String zRX){
		this.zRX = zRX;
	}

	public String getZRX(){
		return zRX;
	}

	public void setAE(String aE){
		this.aE = aE;
	}

	public String getAE(){
		return aE;
	}

	public void setBCH(String bCH){
		this.bCH = bCH;
	}

	public String getBCH(){
		return bCH;
	}

	public void setOMG(String oMG){
		this.oMG = oMG;
	}

	public String getOMG(){
		return oMG;
	}

	public void setGNT(String gNT){
		this.gNT = gNT;
	}

	public String getGNT(){
		return gNT;
	}

	public void setBTC(String bTC){
		this.bTC = bTC;
	}

	public String getBTC(){
		return bTC;
	}

	public void setBAT(String bAT){
		this.bAT = bAT;
	}

	public String getBAT(){
		return bAT;
	}

	public void setXRP(String xRP){
		this.xRP = xRP;
	}

	public String getXRP(){
		return xRP;
	}

	public void setETH(String eTH){
		this.eTH = eTH;
	}

	public String getETH(){
		return eTH;
	}

	public void setLTC(String lTC){
		this.lTC = lTC;
	}

	public String getLTC(){
		return lTC;
	}

	public void setTRX(double tRX){
		this.tRX = tRX;
	}

	public double getTRX(){
		return tRX;
	}

	public void setMIOTA(double mIOTA){
		this.mIOTA = mIOTA;
	}

	public double getMIOTA(){
		return mIOTA;
	}

	public void setREQ(String rEQ){
		this.rEQ = rEQ;
	}

	public String getREQ(){
		return rEQ;
	}

	@Override
 	public String toString(){
		return 
			"Prices{" + 
			"zRX = '" + zRX + '\'' + 
			",aE = '" + aE + '\'' + 
			",bCH = '" + bCH + '\'' + 
			",oMG = '" + oMG + '\'' + 
			",gNT = '" + gNT + '\'' + 
			",bTC = '" + bTC + '\'' + 
			",bAT = '" + bAT + '\'' + 
			",xRP = '" + xRP + '\'' + 
			",eTH = '" + eTH + '\'' + 
			",lTC = '" + lTC + '\'' + 
			",tRX = '" + tRX + '\'' + 
			",mIOTA = '" + mIOTA + '\'' + 
			",rEQ = '" + rEQ + '\'' + 
			"}";
		}
}