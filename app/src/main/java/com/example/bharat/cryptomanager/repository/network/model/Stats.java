package com.example.bharat.cryptomanager.repository.network.model;

import com.google.gson.annotations.SerializedName;

public class Stats{

	@SerializedName("BTC")
	private BTC bTC;

	@SerializedName("ZRX")
	private ZRX zRX;

	@SerializedName("AE")
	private AE aE;

	@SerializedName("BAT")
	private BAT bAT;

	@SerializedName("BCH")
	private BCH bCH;

	@SerializedName("XRP")
	private XRP xRP;

	@SerializedName("ETH")
	private ETH eTH;

	@SerializedName("OMG")
	private OMG oMG;

	@SerializedName("LTC")
	private LTC lTC;

	@SerializedName("GNT")
	private GNT gNT;

	@SerializedName("REQ")
	private REQ rEQ;

	public void setBTC(BTC bTC){
		this.bTC = bTC;
	}

	public BTC getBTC(){
		return bTC;
	}

	public void setZRX(ZRX zRX){
		this.zRX = zRX;
	}

	public ZRX getZRX(){
		return zRX;
	}

	public void setAE(AE aE){
		this.aE = aE;
	}

	public AE getAE(){
		return aE;
	}

	public void setBAT(BAT bAT){
		this.bAT = bAT;
	}

	public BAT getBAT(){
		return bAT;
	}

	public void setBCH(BCH bCH){
		this.bCH = bCH;
	}

	public BCH getBCH(){
		return bCH;
	}

	public void setXRP(XRP xRP){
		this.xRP = xRP;
	}

	public XRP getXRP(){
		return xRP;
	}

	public void setETH(ETH eTH){
		this.eTH = eTH;
	}

	public ETH getETH(){
		return eTH;
	}

	public void setOMG(OMG oMG){
		this.oMG = oMG;
	}

	public OMG getOMG(){
		return oMG;
	}

	public void setLTC(LTC lTC){
		this.lTC = lTC;
	}

	public LTC getLTC(){
		return lTC;
	}

	public void setGNT(GNT gNT){
		this.gNT = gNT;
	}

	public GNT getGNT(){
		return gNT;
	}

	public void setREQ(REQ rEQ){
		this.rEQ = rEQ;
	}

	public REQ getREQ(){
		return rEQ;
	}

	@Override
 	public String toString(){
		return 
			"Stats{" + 
			"bTC = '" + bTC + '\'' + 
			",zRX = '" + zRX + '\'' + 
			",aE = '" + aE + '\'' + 
			",bAT = '" + bAT + '\'' + 
			",bCH = '" + bCH + '\'' + 
			",xRP = '" + xRP + '\'' + 
			",eTH = '" + eTH + '\'' + 
			",oMG = '" + oMG + '\'' + 
			",lTC = '" + lTC + '\'' + 
			",gNT = '" + gNT + '\'' + 
			",rEQ = '" + rEQ + '\'' + 
			"}";
		}
}