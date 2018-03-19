package com.example.bharat.cryptomanager.repository.network.model;

import com.google.gson.annotations.SerializedName;

public class AE{

	@SerializedName("last_traded_price")
	private String lastTradedPrice;

	@SerializedName("min_24hrs")
	private String min24hrs;

	@SerializedName("lowest_ask")
	private String lowestAsk;

	@SerializedName("max_24hrs")
	private String max24hrs;

	@SerializedName("highest_bid")
	private String highestBid;

	@SerializedName("vol_24hrs")
	private String vol24hrs;

	public void setLastTradedPrice(String lastTradedPrice){
		this.lastTradedPrice = lastTradedPrice;
	}

	public String getLastTradedPrice(){
		return lastTradedPrice;
	}

	public void setMin24hrs(String min24hrs){
		this.min24hrs = min24hrs;
	}

	public String getMin24hrs(){
		return min24hrs;
	}

	public void setLowestAsk(String lowestAsk){
		this.lowestAsk = lowestAsk;
	}

	public String getLowestAsk(){
		return lowestAsk;
	}

	public void setMax24hrs(String max24hrs){
		this.max24hrs = max24hrs;
	}

	public String getMax24hrs(){
		return max24hrs;
	}

	public void setHighestBid(String highestBid){
		this.highestBid = highestBid;
	}

	public String getHighestBid(){
		return highestBid;
	}

	public void setVol24hrs(String vol24hrs){
		this.vol24hrs = vol24hrs;
	}

	public String getVol24hrs(){
		return vol24hrs;
	}

	@Override
 	public String toString(){
		return 
			"AE{" + 
			"last_traded_price = '" + lastTradedPrice + '\'' + 
			",min_24hrs = '" + min24hrs + '\'' + 
			",lowest_ask = '" + lowestAsk + '\'' + 
			",max_24hrs = '" + max24hrs + '\'' + 
			",highest_bid = '" + highestBid + '\'' + 
			",vol_24hrs = '" + vol24hrs + '\'' + 
			"}";
		}
}