package com.chandra.stock.data.collector.etdc;

import java.io.IOException;

import com.chandra.stocks.common.utils.http.HttpUtil;

public class ETDataCollector {
	public static void main(String arr[]) throws IOException {
		String url = "http://etsearch.indiatimes.com/etspeeds/ethome.ep?ticker=Hindalco&callback=jQuery111306693887297738002_1488088567077&matchCompanyName=true&dvr=true&idr=true&mcx=true&mf=true&insideet=false&detail=true&forex=false&index=true&mecklai=true&pagesize=6&outputtype=json";
		String response = new HttpUtil().getRequest(url, null);
		System.out.println(response);
	}

}
