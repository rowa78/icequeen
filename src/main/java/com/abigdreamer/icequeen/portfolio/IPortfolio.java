﻿package com.abigdreamer.icequeen.portfolio;

import java.time.LocalDateTime;
import java.util.Map;

import com.abigdreamer.icequeen.events.FillEvent;
import com.abigdreamer.icequeen.events.MarketEvent;
import com.abigdreamer.icequeen.events.SignalEvent;

public interface IPortfolio {
	
	void updateSignal(SignalEvent signal);

	void updateFill(FillEvent fill);

	void updateTimeIndex(MarketEvent market);

	Map<LocalDateTime, Holding> getHoldingHistory();

	Map<LocalDateTime, Double> getEquityCurve();
	
}
