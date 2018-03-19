package com.example.bharat.cryptomanager.repository.network.model;

import com.google.gson.annotations.SerializedName;

public class KoinexResponse{

	@SerializedName("stats")
	private Stats stats;

	@SerializedName("prices")
	private Prices prices;

	public void setStats(Stats stats){
		this.stats = stats;
	}

	public Stats getStats(){
		return stats;
	}

	public void setPrices(Prices prices){
		this.prices = prices;
	}

	public Prices getPrices(){
		return prices;
	}

	@Override
 	public String toString(){
		return 
			"KoinexResponse{" + 
			"stats = '" + stats + '\'' + 
			",prices = '" + prices + '\'' + 
			"}";
		}
}